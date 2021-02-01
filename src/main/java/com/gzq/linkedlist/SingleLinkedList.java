package com.gzq.linkedlist;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.awt.*;

/**
 * @Auther: gzq
 * @Date: 2021/2/1 - 02 - 01 - 10:54
 * @Description: com.gzq.linkedlist
 */
public class SingleLinkedList implements SingleLinkedListDemo {

    //定义头结点(头结点不存放实际数据)
    private Hero head;

    public SingleLinkedList(Hero head) {
        this.head = head;
    }

    @Override
    public Boolean isEmpty() {
        if (head.next == null)
            return true;
        else
            return false;
    }

    @Override
    public void singleLinkedInsert(Hero hero) {
        Hero tmp = head;
        while (true) {
            if (tmp.next == null) {
                tmp.next = hero;
                System.out.println("插入尾部成功");
                break;
            } else
                tmp = tmp.next;
        }
    }

    @Override
    public void singleLinkedInsertByOrder(Hero hero) {
        Hero tmp = head;
        boolean flag = false;
        while (true) {
            if (tmp.next == null) {
                flag = true;
                break;
            } else if (tmp.next.heroNo > hero.heroNo) {
                flag = true;
                break;
            } else if (tmp.next.heroNo == hero.heroNo) {
                flag = false;
                break;
            } else
                tmp = tmp.next;
        }
        //true代表找到了插入位置
        if (flag == true) {
            hero.next = tmp.next;
            tmp.next = hero;
        } else
            System.out.printf("已经由该序号的节点，该节点为%s", tmp.next.toString());

    }

    @Override
    public void singleLinkedDel(int num) {
        if (isEmpty())
            System.out.println("这是一个空链表");
        Hero tmp = head;
        boolean flag = false;
        while (true) {
            if (tmp.next == null) {
                flag = false;
                break;
            }
            if (tmp.next.heroNo == num) {
                flag = true;
                break;
            }
            tmp = tmp.next;
        }
        if (flag) {
            tmp.next = tmp.next.next;
        } else
            System.out.println("没有找到该节点，无法删除");
    }

    @Override
    public void singleLinkedUpdate(Hero hero) {
        Hero tmp = head;
        boolean flag = false;
        while (true){
            if(tmp.next == null){
                break;
            }else if(tmp.next.heroNo == hero.heroNo){
                flag = true;
                break;
            }else
                tmp = tmp.next;
        }
        if(flag){
            tmp.next.heroName = hero.heroName;
        }else
            System.out.println("没有找到要更新的节点");
    }

    @Override
    public void singleLinkedListAll() {
        Hero tmp = head;
        if (isEmpty())
            System.out.println("这是一个空链表");
        while (true) {
            if (tmp.next == null)
                break;
            else {
                System.out.println(tmp.next.toString());
                tmp = tmp.next;
            }
        }
    }

    public static void main(String[] args) {
        Hero head = new Hero(0, "");
        SingleLinkedList testLink = new SingleLinkedList(head);
        testLink.singleLinkedInsert(new Hero(1,"superman"));
        testLink.singleLinkedInsert(new Hero(2,"superman1"));
        testLink.singleLinkedInsert(new Hero(4,"superman4"));
        testLink.singleLinkedInsertByOrder(new Hero(3,"superman3"));

//        testLink.singleLinkedUpdate(new Hero(2,"supermanUpdate"));
//        testLink.singleLinkedUpdate(new Hero(3,"supermanUpdate"));
//        testLink.singleLinkedDel(1);
        testLink.singleLinkedListAll();

    }
}
