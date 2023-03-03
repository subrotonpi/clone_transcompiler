public static void dfs ( String s ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < String > ans = new ArrayList < String > ( ) ;
  /* dfs(s);
  if(s.length() == N) {
  ans.add(s);
  return;
  }
  for(int i=0;i<N;i++) {
  dfs(s+i);
  }*/
  dfs ( "" ) ;
  for ( int i = 0 ;
  i < ans . size ( ) ;
  i ++ ) {
    System . out . println ( ans . get ( i ) ) ;
  }
}
