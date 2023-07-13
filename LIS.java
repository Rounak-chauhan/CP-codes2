static int longestIncreasingSubsequence(int arr[], int n){
    
    int dp[]=new int[n];
    Arrays.fill(dp,1);
    
    for(int i=0; i<=n-1; i++){
        for(int prev_index = 0; prev_index <=i-1; prev_index ++){
            
            if(arr[prev_index]<arr[i]){
                dp[i] = Math.max(dp[i], 1 + dp[prev_index]);
            }
        }
    }
    
    int ans = -1;
    
    for(int i=0; i<=n-1; i++){
        ans = Math.max(ans, dp[i]);
    }
    
    return ans;
}
