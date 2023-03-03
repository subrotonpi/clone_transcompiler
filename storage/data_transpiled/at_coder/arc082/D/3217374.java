public static int [ ] [ ] X = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] rs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < rs . length ;
  i ++ ) {
    rs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] qs = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    qs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int dx = - 1 ;
  int ri = 0 ;
  int offset = 0 ;
  int upper = X , lower = 0 ;
  int prevR = 0 ;
  int [ ] [ ] ans = new int [ Q ] [ ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int t = qs [ i ] ;
    while ( ri < rs . length && rs [ ri ] <= t ) {
      int tmpOffset = dx * ( rs [ ri ] - prevR ) ;
      if ( dx == 1 ) {
        upper = Math . min ( X , upper + tmpOffset ) ;
        lower = Math . min ( X , lower + tmpOffset ) ;
      }
      else {
        upper = Math . max ( 0 , lower + tmpOffset ) ;
      }
      prevR = rs [ ri ] ;
      ri ++ ;
    }
    a = Math . max ( lower , Math . min ( upper , a + offset ) ) ;
    int dt = t - prevR ;
    a = Math . max ( 0 , Math . min ( X , a + dx * dt ) ) ;
    ans [ ri ] = a ;
  }
  System . out . println ( ( int [ ] [ ] ) ans ) ;
  return ans ;
}
