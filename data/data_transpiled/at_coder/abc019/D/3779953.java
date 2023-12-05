public static int N = Integer . parseInt ( input ) {
  int D = 0 , E = 1 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    System . out . print ( "? 1 " + i ) ;
    int d = Integer . parseInt ( input ) ;
    if ( d > D ) D = d ;
    E = i ;
  }
  return D ;
}
