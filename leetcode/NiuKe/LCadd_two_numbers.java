package NiuKe;

public class LCadd_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int jinwei=0;
        int weishu=0;
        ListNode l3=new ListNode(0);
        ListNode l4=l3;
        while((l1!=null) || (l2!=null)|| jinwei != 0){
            int l1val= l1!=null?l1.val:0;
            int l2val= l2!=null?l2.val:0;
            int sumval = l1val+l2val+jinwei;
            jinwei = sumval/10;
            ListNode lnn = new ListNode(sumval%10);
            l3.next = lnn;
            l3=lnn;
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        return l4.next;
    }
}

