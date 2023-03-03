static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) , B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  @ SuppressWarnings ( "unused" ) int t = Integer . parseInt ( H [ 0 ] ) ;
  /* enough */
  int lo = 0 ;
  for ( int h : H ) {
    r = Math . max ( Math . max ( h - t * B , 0 ) / ( A - B ) , t ) ;
  }
  return r <= t ;
}
