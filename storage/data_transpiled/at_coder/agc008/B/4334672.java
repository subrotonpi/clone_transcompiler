public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] cums = new int [ A . length ] ;
  int [ ] cump = new int [ A . length ] ;
  for ( int a : A ) {
    cums [ cums . length - 1 ] = cums [ cums . length - 1 ] + a ;
    cump [ cump . length - 1 ] = cump [ cump . length - 1 ] + Math . max ( 0 , a ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    int tmp = cump [ i ] + cump [ cump . length - 1 ] - cump [ i + K ] ;
    tmp += Math . max ( 0 , cums [ i + K ] - cums [ i ] ) ;
    ans = Math . max ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
