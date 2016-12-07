# FlexibleTextView
####灵活定制背景的textview
####文本默认居中显示，可以设置圆形和方形不同颜色背景
----

自定义属性说明：

- `app:tColor"` 要显示的字体的颜色
- `app:bgColor"` 要显示的字体背景的颜色
- ` app:shape `
    - `app:shape="square"`  填充等宽高的方形背景
    - `app:shape="circular"`  取高度和宽度之间最小的值，填充圆形背景，圆的半径为最小的值的一半
    
----
方法介绍：

- 显示普通的字体
```
     /**
     * 默认透明背景的文本
     * @param text 文本
     */
    public void showText(String text) {
        ...
    }
```
- 显示圆形背景
```
    /**
     * 显示圆形背景的文本
     * @param text 文本
     */
    public void showCicleText(String text) {
        ...
    }
```
- 显示方形背景
```
    /**
     * 显示紫色方块背景
     * @param text 文本
     */
    public void showPurpleText(String text) {
       ...
    }
```

效果如下：

![image](https://github.com/MoveToNext/FlexibleTextView/blob/master/device180129.png)

