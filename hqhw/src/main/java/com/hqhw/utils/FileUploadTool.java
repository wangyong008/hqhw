package com.hqhw.utils;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.hqhw.pojo.Files;

//文件上传工具
@Component
public class FileUploadTool {
	
	@Autowired
	TimeUtil tu;

// 文件最大500M
	private static long upload_maxsize = 5000 * 1024 * 1024;
// 文件允许格式
	private static String[] allowFiles = { ".gif", ".png", ".jpg", ".mp4", ".flv", ".avi", ".wmv", ".3GP", ".rm", ".rmvb", ".mov", ".wmf"};
	
	public Files createFile(MultipartFile file) {
		
//		path = image/20160511/	name = "20160511094134_44434.jpg"
		int length = file.getOriginalFilename().length();
		String name = file.getOriginalFilename().substring(15, length);
		String path = "d:/uploadFile/" +file.getOriginalFilename().substring(0, 15);
		Files entity = new Files();
		boolean bflag = false;
		// 判断文件不为空
		if (file.getSize() != 0 && !file.isEmpty()) {
			bflag = true;
			// 判断文件大小
			if (file.getSize() <= upload_maxsize) {
				bflag = true;
				// 文件类型判断
				if (this.checkFileType(name)) {
					bflag = true;
				} else {
					bflag = false;
				}
			} else {
				bflag = false;
			}
		} else {
			bflag = false;
		}
		if (bflag) {  
            try {  
//            	判断文件夹在不在，不在的话创建
                File filepath = new File(path);
                if (!filepath.exists()) 
                    filepath.mkdirs();
                // 文件保存路径  
                String savePath = path + name;  
                File f = new File(savePath);
                // 转存文件  
                file.transferTo(f);
                if(f.exists()) {
	                entity.setNewname(name);
	                entity.setSize(this.getSize(f));
	                entity.setPath(savePath);
	                entity.setUploadtime(new Date());
                }
            } catch (Exception e) {  
                e.printStackTrace();  
            }
            
        } else {
			return null;
		}
		return entity;

	}

	/**
	 * 文件类型判断
	 *
	 * @param fileName
	 * @return
	 */
	private boolean checkFileType(String fileName) {
		Iterator<String> type = Arrays.asList(allowFiles).iterator();
		while (type.hasNext()) {
			String ext = type.next();
			if (fileName.toLowerCase().endsWith(ext)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 文件大小，返回kb.mb ?
	 * 
	 * @return
	 */
	private String getSize(File file) {
		String size = "";
		long fileLength = file.length();
		DecimalFormat df = new DecimalFormat("#.00");
		if (fileLength < 1024) {
			size = df.format((double) fileLength) + "BT";
		} else if (fileLength < 1048576) {
			size = df.format((double) fileLength / 1024) + "KB";
		} else if (fileLength < 1073741824) {
			size = df.format((double) fileLength / 1048576) + "MB";
		} else {
			size = df.format((double) fileLength / 1073741824) + "GB";
		}

		return size;

	}
}