package com.lexiang.main.common.utils;

import java.io.BufferedReader;  
import java.io.File;  
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.nio.charset.Charset;  
  
import org.apache.http.HttpResponse;  
import org.apache.http.client.methods.HttpPost;  
import org.apache.http.entity.mime.HttpMultipartMode;  
import org.apache.http.entity.mime.MultipartEntity;  
import org.apache.http.entity.mime.content.FileBody;  
import org.apache.http.entity.mime.content.StringBody;  
import org.apache.http.impl.client.DefaultHttpClient;  
/**
 * 
 * <p>Title: FileUpload4From.java</p>
 * <p>Description: java模拟form表单提交文件</p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sage</p>
 * @author 五虎将
 * @date 2016年3月21日下午11:28:15
 * @version 1.0
 */
public class FileUpload4From {


        public static void main(String args[]) throws Exception {  
               
        	
            MultipartEntity multipartEntity = new MultipartEntity(HttpMultipartMode.BROWSER_COMPATIBLE,"----------ThIs_Is_tHe_bouNdaRY_$", Charset.defaultCharset());  
            multipartEntity.addPart("method ",new StringBody("upload", Charset.forName("UTF-8")));    
            multipartEntity.addPart("access_token",new StringBody("138***********",Charset.forName("UTF-8")));    
            multipartEntity.addPart("image",new FileBody(new File(System.getProperty("user.dir")+"/src/test/resources/123.jpg")));    
                
            HttpPost request = new HttpPost("http://xxxxx.do");     
            request.setEntity(multipartEntity);  
            request.addHeader("Content-Type","multipart/form-data; boundary=----------ThIs_Is_tHe_bouNdaRY_$");  
              
            DefaultHttpClient httpClient = new DefaultHttpClient();  
            HttpResponse response =httpClient.execute(request);  
              
            InputStream is = response.getEntity().getContent();  
            BufferedReader in = new BufferedReader(new InputStreamReader(is));  
            StringBuffer buffer = new StringBuffer();  
            String line = "";  
            while ((line = in.readLine()) != null) {  
                buffer.append(line);  
            }  
              
            System.out.println("发送消息收到的返回："+buffer.toString());  
        }  
}
