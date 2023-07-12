#include <bits/stdc++.h>
  using namespace std;
#include<ext/pb_ds/assoc_container.hpp>
#include<ext/pb_ds/tree_policy.hpp>
using namespace __gnu_pbds;
#define ordered_set tree<int,null_type,less<int>,rb_tree_tag,tree_order_statistics_node_update>


  int main() {
    int t;
    cin>>t;
    while(t--){
      int n,q;
      cin>>n>>q;
      
      ordered_set os;
      for(int i=1;i<=n;i++) os.insert(i);
      
      while(q--){
        int type,x;
        cin>>type>>x;
        
        if(type==1){
          auto it=os.find_by_order(x-1);
          os.erase(*it);
        }
        else{
          cout<<*os.find_by_order(x-1)<<endl;
        }
      }
    }
    return 0;

  }
