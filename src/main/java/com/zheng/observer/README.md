###观察者模式
####简介
    定义对象间的一对多的依赖关系，当一个对象的状态发生变化时，所有依赖他的对象都得到通知并被自动更新，也就是说，观察者模式是关于多个对象想知道一个
    对象中数据变化情况的一种成熟模式
    观察者模式根据数据传递的方式又分为两种具体的模式：推模式和拉模式
#####推模式
    当主题发生改变时，主题对象自动将更新的数据推送到注册该主题的监听对象中，也就是说，数据是由主题在更新的时候直接传送到监听对象上
#####拉模式
    当主题发生改变时，主题对象向监听对象发送消息，但是并不传递更新的数据信息，获取数据的方式是由监听者自己根据主题对象提供的获取数据的接口来得到，
    并判断当前数据是否已经发生更改，从而获取更新数据
>推模式与拉模式的主要区别在于掌握数据的主动权究竟在谁手中