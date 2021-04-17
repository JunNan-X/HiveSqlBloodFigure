# HiveSqlBloodFigure

##### 如果你喜欢这个项目，那就点击一下右上方的【Star】以及【Fork】，支持一下我，让我有动力持续更新！

#### 项目介绍
在数据仓库建设中，经常会使用到数据血缘追中方面的功能，本项目实现了对hql集合进行静态分析，获取hql对应的血缘图（表血缘 + 字段血缘）

#### 项目升级内容
1. 删除hive-exec与hadoop-common的maven依赖，使得项目更加的轻量级。
2. 重构项目代码，优化解析，修复无字段血缘时，不能获取表血缘的BUG。
3. 规范化接口输入输出，血缘图均为自定义实体，方便进行JSON序列化。
4. 新增接口层，方便Spring的注入，同时也提供静态方式调用。

#### 下个版本升级内容
引入JDBC获取元数据信息，使血缘图更加丰富，同时可以解决Sql中有select * 的问题。

#### 测试用例
请关注test下的HiveBloodEngineTest与HiveSqlBloodFactoryTest。

#### 接口地址
    接口类：HiveBloodEngine，实现类：HiveBloodEngineImpl。（spring接入）
    工具类：HiveSqlBloodFactory。（静态调用）
    
#### 使用说明

运行：
![输入图片说明](https://images.gitee.com/uploads/images/2019/0102/172109_101b76d9_146322.png "屏幕截图.png")

结果：

表血缘：
![输入图片说明](https://images.gitee.com/uploads/images/2019/0102/172002_32a128d6_146322.png "屏幕截图.png")

字段血缘：
![输入图片说明](https://images.gitee.com/uploads/images/2019/0102/171929_39c2de70_146322.png "屏幕截图.png")


#### 参与贡献

感谢 xiaoju 提供的代码贡献。
