public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( T ) ;
  int cnt = 1 ;
  int s = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( ( T [ i ] > T [ s ] + K ) || ( i == s + C ) ) {
      cnt ++ ;
      s = i ;
    }
  }
  System . out . println ( cnt ) ;
  return s ;
}
