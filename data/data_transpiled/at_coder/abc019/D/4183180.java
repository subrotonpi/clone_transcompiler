public static int n = Integer . parseInt ( input ) {
  int a = 1 ;
  int b = 2 ;
  int c = 3 ;
  int ma = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    System . out . println ( "?" + a + " " + i ) ;
    int t = Integer . parseInt ( input ) ;
    if ( t >= ma ) {
      ma = t ;
      c = i ;
    }
  }
  System . out . println ( "!" + ma ) ;
  return ma ;
}
