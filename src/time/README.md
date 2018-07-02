假设项目有以下环境

- 本地环境，时区为中国时区
- 测试环境部署地美国，时区为美国时区
- 正式环境部署地美国，时区为美国时区

现在本地环境与测试环境时区是不一致的，当系统出现问题需要在本地调试，这里因为时区的不一致，可以发现本地显示的时间与线上测试环境显示的时间会有时差。

为了保证，不同环境显示相同的时间，需要在程序的入口先设定时区，否则Java会将当前系统时区作为默认时区，导致不同环境出现不同的时区。
时区设定为任何时区都无所谓，最重要的是要保质一致。

Spring boot程序启动入口
````java
public static void main(String[] args) {
    // 东八区
    TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
    // 启动服务
    SpringApplication app = new SpringApplication(Launch.class);
    app.addListeners(new SystemInit());
    app.run(args);
}
````