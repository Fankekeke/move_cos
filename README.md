### 基于SpringBoot + Vue的搬家服务系统

搬家实时定位、同城搬家平台

##### 管理员端：全局运营与规则管控
###### 公告/消息通知： 实时发布平台政策与活动动态，通过系统推送触达用户及员工，确保关键信息传递的高效准确。

###### 用户/员工管理： 统一维护客户与搬家师傅的档案及权限，通过实名认证与信用体系，保障平台服务的安全可靠。

###### 计算规则配置： 灵活设定公里数、楼层、大件及特殊时段的计费标准，实现系统自动估价，确保收费流程透明。

###### 订单/支付管理： 实时监控订单全生命周期，并详细记录每一笔资金流水，通过数字化手段实现财务与业务的闭环。

###### 评价管理中心： 收集并审核用户对服务的反馈，作为员工考核与服务质量改进的依据，持续优化品牌口碑。

##### 用户端：便捷预约与消费追踪
###### 搬家填写预约： 支持在线填写起终点、楼层及物品清单，系统根据规则实时测算费用，实现一键极简下单。

###### 我的订单追踪： 实时查看搬家任务的当前状态与师傅位置，全程掌握服务进度，确保财产搬运过程可视化。

###### 付款记录/个人信息： 自主管理个人资料与收货地址，并可随时调取历史账单明细，让每一笔搬家支出清晰可查。

###### 订单服务评价： 在搬家完成后对师傅的专业度、准时性进行真实评定，通过交互反馈提升平台整体服务水准。

#### 安装环境

JAVA 环境 

Node.js环境 [https://nodejs.org/en/] 选择14.17

Yarn 打开cmd， 输入npm install -g yarn !!!必须安装完毕nodejs

Mysql 数据库 [https://blog.csdn.net/qq_40303031/article/details/88935262] 一定要把账户和密码记住

redis

Idea 编译器 [https://blog.csdn.net/weixin_44505194/article/details/104452880]

WebStorm OR VScode 编译器 [https://www.jianshu.com/p/d63b5bae9dff]

#### 采用技术及功能

后端：SpringBoot、MybatisPlus、MySQL、Redis、
前端：Vue、Apex、Antd、Axios、baidu.js

平台后台：springboot(框架) + redis(缓存中间件) + shiro(权限中间件) + mybatisplus(orm) + restful风格接口 + mysql(数据库)

开发环境：windows10 or windows7 ， vscode or webstorm ， idea + lambok

支付宝沙盒支付

#### 前台启动方式

安装所需文件 yarn install 
运行 yarn run dev

#### 后端启动方式

1.首先启动redis，进入redis目录终端。输入redis-server回车
2.导入sql文件，修改数据库与redis连接配置
3.idea中启动后端项目

### 管理员
公告管理，评价管理，消息通知，订单管理，支付记录，计算规则，员工管理，用户管理

### 用户
我的订单，付款记录，个人信息，订单评价


#### 默认后台账户密码

[管理员]
admin
1234qwer

[用户]
fank
1234qwer



#### 项目截图

|  |  |
|---------------------|---------------------|
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1678284704207.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1678283637454.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1678283876279.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1678283617760.jpg) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1678283854628.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/256a49b2694ea6178c1a0050fa27bb8.png) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1678283799594.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/51e231c9025a6fefdd44205e82c63f7.png) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1678283780193.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/fc2fd8817768e70a817f9d4bc01c3bd.png) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1678283762730.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/6774db826e9c0f3e22f046453bf8ec1.png) |
|![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/1678283746695.jpg) | ![](https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/work/936e9baf53eb9a217af4f89c616dc19.png) |



#### 演示视频

暂无

#### 获取方式

Email: fan1ke2ke@gmail.com

WeChat: `Storm_Berserker`

`附带部署与讲解服务，因为要恰饭资源非免费，伸手党勿扰，谢谢理解😭`

> 1.项目纯原创，不做二手贩子 2.一次购买终身有效 3.项目讲解持续到答辩结束 4.非常负责的答辩指导 5.**黑奴价格**

> 项目部署调试不好包退！功能逻辑没讲明白包退！

#### 其它资源

[2025年-答辩顺利通过-客户评价🍜](https://berserker287.github.io/2025/06/18/2025%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2024年-答辩顺利通过-客户评价👻](https://berserker287.github.io/2024/06/06/2024%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2023年-答辩顺利通过-客户评价🐢](https://berserker287.github.io/2023/06/14/2023%E5%B9%B4%E7%AD%94%E8%BE%A9%E9%A1%BA%E5%88%A9%E9%80%9A%E8%BF%87/)

[2022年-答辩通过率100%-客户评价🐣](https://berserker287.github.io/2022/05/25/%E9%A1%B9%E7%9B%AE%E4%BA%A4%E6%98%93%E8%AE%B0%E5%BD%95/)

[毕业答辩导师提问的高频问题](https://berserker287.github.io/2023/06/13/%E6%AF%95%E4%B8%9A%E7%AD%94%E8%BE%A9%E5%AF%BC%E5%B8%88%E6%8F%90%E9%97%AE%E7%9A%84%E9%AB%98%E9%A2%91%E9%97%AE%E9%A2%98/)

[50个高频答辩问题-技术篇](https://berserker287.github.io/2023/06/13/50%E4%B8%AA%E9%AB%98%E9%A2%91%E7%AD%94%E8%BE%A9%E9%97%AE%E9%A2%98-%E6%8A%80%E6%9C%AF%E7%AF%87/)

[计算机毕设答辩时都会问到哪些问题？](https://www.zhihu.com/question/31020988)

[计算机专业毕业答辩小tips](https://zhuanlan.zhihu.com/p/145911029)


#### 接JAVAWEB毕设，纯原创，价格公道，诚信第一

`网站建设、小程序、H5、APP、各种系统 选题+开题报告+任务书+程序定制+安装调试+项目讲解+论文+答辩PPT`

More info: [悲伤的橘子树](https://berserker287.github.io/)

<p><img align="center" src="https://fank-bucket-oss.oss-cn-beijing.aliyuncs.com/img/%E5%90%88%E4%BD%9C%E7%89%A9%E6%96%99%E6%A0%B7%E5%BC%8F%20(3).png" alt="fankekeke" /></p>
