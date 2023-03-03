public static double getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] cums = new int [ N ] ;
  int [ ] cumsP = new int [ N ] ;
  for ( int a : A ) {
    cums [ cums . length - 1 ] = cums [ cums . length - 1 ] + a ;
    cumsP [ cums . length - 1 ] = cumsP [ cums . length - 1 ] + Math . max ( 0 , a ) ;
  }
  double ans = - Double . MAX_VALUE ;
  for ( int l = 0 ;
  l < N - K + 1 ;
  l ++ ) {
    double free = cumsP [ l ] + cumsP [ cums . length - 1 ] - cumsP [ l + K ] ;
    double cont = cums [ l + K ] - cums [ l ] ;
    ans = Math . max ( ans , free , free + cont ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
