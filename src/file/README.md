## java web 线上环境读取resources目录下的文件
例如读取resources目录下的foo.html文件

经试验以下做法在本地可以行得通，线上会报file not found exception

````
// 
getClass().getProtectionDomain().getCodeSource().getLocation("foo.html").getPath();

// Example表示当前语句所在的类名
[Example].class.getClassLoader().getResource("FrameExample.json")


// 如果是用Spring框架的话，可以这么写。
Resource resource = (new DefaultResourceLoader()).getResource("classpath:foo.html");
// 获取resource之后不要用getFile().getPath()，还不清楚什么原因，因为用path来读文件，在线上环境会无法读取，可以用流读
InputStream is = resource.getInputStream
````