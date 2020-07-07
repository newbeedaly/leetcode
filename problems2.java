package cn.newbeedaly.springbootdemo.leetcode;


/**
 * @Description: Add Two Numbers
 * @Author: liqk
 * @Date: 2020/7/6
 **/
public class problems2 {

  /**
  You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order and each of their nodes contain a single digit.
    Add the two numbers and return it as a linked list.

  You may assume the two numbers do not contain any leading zero, except the number 0 itself.

  Example:

  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
  Output: 7 -> 0 -> 8
  Explanation: 342 + 465 = 807.
  **/

  public static LinkNode returnLinkNode(LinkNode y1,LinkNode y2) {
    LinkNode newNode = new LinkNode(0);
    LinkNode p = y1, q = y2, curr = newNode;
    //进位的数值
    int arr = 0;
    //元素有一个不为null，实行计算
    while(p != null || q != null) {
      int x = (p != null ) ? p.data : 0; // 需要考虑位数不同的数字相加
      int y = (q != null ) ? q.data : 0;
      int sum = 0;
      sum = (x+y+arr);
      arr = sum / 10;
      //创建一个数值为 (sum %10 )的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点，这是最难的地方，所以建议画图理解。
      curr.next = new LinkNode(sum % 10);//新节点
      curr = curr.next;
      if( p != null) {
        p = p.next;
      }
      if( q != null) {
        q = q.next;
      }
    }
    if(arr > 0) {
      curr.next = new LinkNode(arr);
    }
    //在这里，其实返回的是哑节点的下一个节点，所以不需要担心第一个节点无数值的问题。
    return newNode.next;
  }

  //主方法
  public static void main(String[] args) {
    // 创建两个链表
    // 第一个链表:  1-> 8 -> 7 -> 6  (在做加法运算代表的是6781)
    LinkNode l1 = new LinkNode(0);  // 这是第一个链表的第一个节点(不能用这个节点去往下加数据)
    // 必须有一个指针去往第一个节点上去加数据
    LinkNode p = l1;  // 这个指针节点会从链表的第一个节点一直往下走(直至最后一个节点)
    // p = p.next ; p.next = 7 ; 即：p.next.next = 7
    // p = p.next ; p.next = 7 ; p = p.next 即：p = p.next.next 这样一直走下去
    p.next = new LinkNode(2);
    p = p.next;
    p.next = new LinkNode(4);
    p = p.next;
    p.next = new LinkNode(3);
    // 第二个链表
    LinkNode l2 = new LinkNode(0);
    LinkNode q = l2;
    q.next = new LinkNode(5);
    q = q.next;
    q.next = new LinkNode(6);
    q = q.next;
    q.next = new LinkNode(4);
    LinkNode re = returnLinkNode(l1, l2);
    while(re != null) {
      System.out.println(re.data);
      re = re.next;
    }
  }


//单向链表的元素定义。
static class LinkNode{
  int data;//元素数值
  LinkNode next;//下一个元素
  //构造器
  LinkNode(int data){
    this.data = data;
  }

}

}
