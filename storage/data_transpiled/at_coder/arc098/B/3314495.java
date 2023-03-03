public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int cnt = 0 ;
  int r = 0 ;
  int tmp = 0 ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    while ( r < N && ( tmp & A [ r ] ) == 0 ) {
      tmp |= A [ r ] ;
      r ++ ;
    }
    cnt += ( r - l ) ;
    tmp ^= A [ l ] ;
  }
  System . out . println ( cnt ) ;
}
