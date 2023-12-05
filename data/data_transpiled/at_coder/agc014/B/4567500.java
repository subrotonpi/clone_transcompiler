public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] K = new int [ 10 * 5 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int P = Integer . parseInt ( input ) ;
    int Q = Integer . parseInt ( input ) ;
    K [ P - 1 ] ++ ;
    K [ Q - 1 ] ++ ;
  }
  boolean flag = true ;
  for ( int i = 0 ;
  i < 10 * 5 ;
  i ++ ) {
    if ( K [ i ] % 2 != 0 ) {
      flag = false ;
      break ;
    }
  }
  if ( flag ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
