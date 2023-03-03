public static int n = Integer . parseInt ( input ) {
  String [ ] ans = new String [ n ] ;
  /*dfs(i, stack);
  if(i == n) {
  ans[i] = stack;
  return 0;
  }
  for(char j='a';j<'b';j++) {
  String stack1 = stack.concat(j);
  dfs(i+1, stack1);
  }*/
  /*dfs(0,"");
  Arrays.sort(ans);*/
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans . length ;
}
