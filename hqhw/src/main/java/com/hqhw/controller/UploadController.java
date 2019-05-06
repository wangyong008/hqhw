package com.hqhw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.hqhw.pojo.Files;
import com.hqhw.utils.FileUploadTool;

@Controller
@RequestMapping("/upload")
public class UploadController {
    //通过Spring的autowired注解获取spring默认配置的request  

	@Autowired
	FileUploadTool fut;

    @RequestMapping(value = "/filesUpload", method=RequestMethod.POST)  
    public String filesUpload(@RequestParam("files") MultipartFile[] files) { 
        String path = "E:/upload/";
        //判断file数组不能为空并且长度大于0  
        if(files!=null&&files.length>0){  
            //循环获取file数组中得文件  
            for(int i = 0;i<files.length;i++){  
                MultipartFile file = files[i];  
                try {
                	//保存文件  
        			Files entity = fut.createFile(file); 
        			if (entity != null) {
        				System.out.println(1);
        			} else {
        				System.out.println(0);
        			}

        		} catch (Exception e) {
        			e.printStackTrace();
        		}
            }  
        }  
        // 重定向  
        return "";  
    }  

}
