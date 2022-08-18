package binarytree;
import java.util.*;
public class introduction {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node=node;
            this.state=state;
        }
    }
    public static void display(Node node){
        if(node==null){
            return;
        }
        String str="";
        str+= node.left==null? "." :node.left.data+"";
        str+="->" +node.data+"<-";
        str+=node.right==null?".":node.right.data+"";

        System.out.println(str);
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args) {
        Integer[] arr={10,25,null};
        Node root=new Node(arr[0],null,null);
        Pair rp=new Pair(root,1);

        Stack<Pair> st= new Stack<>();
        st.push(rp);

        int idx=0;
        while(st.size()>0){
            Pair top=st.peek();
            if(top.state==1){
                idx++;
                if(arr[idx]!=null){
                    top.node.left=new Node(arr[0],null,null);
                    Pair lp=new Pair(top.node.left,1);
                    st.push(lp);
                }else{
                    top.node.left=null;
                }
                top.state++;
            }else if(top.state==2){
                idx++;
                if(arr[idx]!=null){
                    top.node.right=new Node(arr[0],null,null);
                    Pair nrp=new Pair(top.node.right,1);
                    st.push(nrp);
                }else{
                    top.node.right=null;
                }
                top.state++;
            }else{
                st.pop();
            }
        }
        display(root);
    }
}
