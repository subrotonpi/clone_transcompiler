public static int K = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] vs = new String [ N ] ;
  String [ ] ws = new String [ N ] ;
  int [ ] num = new int [ K ] ;
  int cur = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    vs [ i ] = null ;
    ws [ i ] = null ;
  }
  /* solve the solution */
  String [ ] ans = new String [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans [ i ] = null ;
  }
  /* dfs the solution */
  return ans . length ;
}
