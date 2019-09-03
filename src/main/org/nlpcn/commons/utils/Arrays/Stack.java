package main.org.nlpcn.commons.utils.Arrays;

public class Stack {

    //使用数组存储
    Object[] elements;
    //栈顶元素
    int index;

    //Constructor


    public Stack() {
        this(10);
    }

    // 初始化容量
    public Stack(int max) {
        elements = new Object[max];
    }

    public void put(Object element) throws StackOperationException {
        if (elements.length > index) {
            elements[index++] = element;
        } else {
            throw new StackOperationException("栈已满！");
        }
    }

    public Object pop() throws StackOperationException {
        if (index == 0) {
            throw new StackOperationException("已清空！");
        } else {
            return elements[--index];
        }
    }
}
