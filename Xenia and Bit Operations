import java.util.*;
public class q240 {
    public static void main(String[] args) {
        solve1();
    }
    public static void solve1(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q= sc.nextInt();
        int no_of_element=(int)Math.pow(2,n);
        int arr[]=new int[no_of_element];
        int seg[]=new int[4*no_of_element];//basically yeh mera segment tree ka array hai
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        if(n%2==0){
            //even hai toh pehele xor hoga
            build(0,0,no_of_element-1,arr,seg,0);
        }else{
            build(0,0,no_of_element-1,arr,seg,1);
        }
        while(q-->0){
            int index= sc.nextInt();
            int value= sc.nextInt();
            //zero based indexing karne ke liye
            index--;
            if(n%2==0){
                update(0,0,no_of_element-1,index,value,0,seg);
            }else{
                update(0,0,no_of_element-1,index,value,1,seg);
            }
            System.out.println(seg[0]);
        }
    }
    public static void update(int idx,int low,int high,int point,int value,int p,int seg[]){
        if(low==high){
            seg[idx]=value;
            return;
        }
        int mid=(low+high)/2;
        //mujhe ab ulte p se update karna hoga
        int z=(p==1)?0:1;
        if(point<=mid){
            update(2*idx+1,0,mid,point,value,z,seg);
        }else{
            update(2*idx+2,mid+1,high,point,value,z,seg);
        }
        if(p==1){
            seg[idx]=(seg[2*idx+1]|seg[2*idx+2]);
        }else{
            seg[idx]=(seg[2*idx+1]^seg[2*idx+2]);
        }
    }
    public static void build(int idx,int low,int high,int arr[],int seg[],int p){
        if(low==high){
            seg[idx]=arr[low];
            return;
        }
        int mid=(low+high)/2;
        if(p==1){
            //matlab mera OR sahi hai
            //matlab mera OR hoga
            build(2*idx+1,low,mid,arr,seg,0);
            build(2*idx+2,mid+1,high,arr,seg,0);
            seg[idx]=(seg[2*idx+1]|seg[2*idx+2]);
        }else{
            //matlab me xor karoonga
            build(2*idx+1,low,mid,arr,seg,1);
            build(2*idx+2,mid+1,high,arr,seg,1);
            seg[idx]=(seg[2*idx+1]^seg[2*idx+2]);
        }
    }
}
