# 上传
页面:
1.post提交
2.enctype:multipart/form-data

服务端
1.添加apache commons依赖
2.配置commons解析器CommonsMultipartResolver
3.控制器方法参数类型是MultipartFile,参数名是页面中文件
控件的名字

# 参考文档:
https://www.baeldung.com/spring-file-upload