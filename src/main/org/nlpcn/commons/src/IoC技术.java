package main.org.nlpcn.commons.src;

/**
 * Created by slade on 2019/9/26.
 */
public class IoC技术 {
}

/*
*   Spring：容器，用来管理Java对象，实现解耦合
*
*   1、IoC控制反转
*       控制：控制对象的创建、属性的赋值、依赖的管理，对象的生成到销毁
*       反转：把开发人员的对象管理权限转移给容器管理（Spring），由容器自己管理
*       举例：ServeLet、listener
*
*   2、实现：
*       1、DL，依赖查找
*       2、DI、依赖注入，Spring用的DI是反射机制
*           只需要提供对象名称，如何创建，赋值、管理都是容器自己管理的
*
* */
