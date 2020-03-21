package com.sunjian.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sunjian
 * @date 2020/3/20 8:07
 */
@Controller
public class UploadController {
    @RequestMapping("/upload")
    public String upload(@RequestParam("img")MultipartFile img, HttpServletRequest request){

        if(img.getSize() > 0){
            // 获取target目录下的文件保存路径
            String path = (String) request.getSession().getServletContext().getRealPath("files");

            String fileName = img.getOriginalFilename();// 获取原始文件名
            File file = new File(path, fileName); // 创建空文件

            try {
                img.transferTo(file); // 将img中的内容转移到file这个空文件中
            } catch (IOException e) {
                e.printStackTrace();
            }
            request.setAttribute("filePath", "/files/"+fileName);
        }
        return "upload";
    }

    @RequestMapping("/uploadMore")
    public String uploadMore(@RequestParam("imgs") MultipartFile[] imgs, HttpServletRequest request){
        List<String> filePaths = new ArrayList<>();
        for(MultipartFile img:imgs){
            if(img.getSize() > 0){
                String path = request.getSession().getServletContext().getRealPath("files");
                String fileName = img.getOriginalFilename();

                File file = new File(path, fileName);// 创建文件
                try {
                    img.transferTo(file);
                    filePaths.add("/files/" + fileName); // 将文件路径添加到list中
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        request.setAttribute("filePaths", filePaths);
        return "uploadMore";
    }

    @RequestMapping("/download")
    public void download(String filePath, HttpServletRequest request, HttpServletResponse response){

        // 文件名处理
        filePath = filePath.split("/")[2];

        // 设置响应流文件进行下载
        response.setHeader("Content-Disposition", "attachment;filename=" + filePath);
        try {
            ServletOutputStream servletOutputStream = response.getOutputStream();
            File file = new File(request.getSession().getServletContext().getRealPath("files"), filePath);

            byte[] bytes = FileUtils.readFileToByteArray(file);
            servletOutputStream.write(bytes);
            servletOutputStream.flush();
            servletOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
