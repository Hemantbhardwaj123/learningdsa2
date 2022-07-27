package generictree;
import java.util.*;
public class introduction {
    private static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();
    }
    public static void display(Node node){
        String str=node.data+"->";
        for(Node child : node.children){
            str +=child.data + ",";
        }
        str +=".";
        System.out.println(str);
        for(Node child : node.children){
               display(child);
        }
    }
    public static void main(String[] args) {
        int[] arr={7,5,8,-1,8,-1,4,3,2,-1,-1,6,9,-1,10};
        Node root=null;
        Stack<Node> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }else{
                Node t=new Node();
                t.data=arr[i];
                if(st.size()>0){
                    st.peek().children.add(t);
                }else{
                    root=t;
                }
                st.push(t);
            }
        }
        display(root);
    }
}
