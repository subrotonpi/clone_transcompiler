public static int N = Integer . parseInt ( input ) {
  Map < Integer , Integer > A = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( A . containsKey ( a ) ) {
      A . put ( a , 1 ) ;
    }
    else {
      A . put ( a , 1 ) ;
    }
  }
  int ans = 0 ;
  for ( Integer key : A . keySet ( ) ) {
    ans += A . get ( key ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
