public static int [ ] getSummarine ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  Map < Point , Integer > m = new HashMap < Point , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      m . put ( new Point ( a + i - 1 , b + j - 1 ) , m . get ( ( a + i - 1 ) + j ) ) ;
    }
  }
  int [ ] ans = new int [ 10 ] ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
