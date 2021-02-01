package com.gzq.linkedlist;

import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;

/**
 * @Auther: gzq
 * @Date: 2021/2/1 - 02 - 01 - 10:56
 * @Description: com.gzq.linkedlist
 */
public interface SingleLinkedListDemo {
    //判断单链表是否为空
    Boolean isEmpty();
    //插入（默认插入到最后）
    void singleLinkedInsert(Hero hero);
    //插入（按No顺序插入）
    void singleLinkedInsertByOrder(Hero hero);
    //删除某个元素
    void singleLinkedDel(int num);
    //更新某个元素
    void singleLinkedUpdate(Hero hero);
    //显示所有元素
    void singleLinkedListAll();

}
