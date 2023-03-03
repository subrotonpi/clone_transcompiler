public static int [ ] getN ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = new int [ M ] ;
  float [ ] A = new float [ M ] ;
  float [ ] B = new float [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    String p = input . nextLine ( ) ;
    String a = input . nextLine ( ) ;
    String b = input . nextLine ( ) ;
    P [ i ] = Integer . parseInt ( p ) ;
    A [ i ] = Float . parseFloat ( a ) ;
    B [ i ] = Float . parseFloat ( b ) ;
  }
  N = new Integer [ N ] ;
  int N2 = 2 * ( ( N - 1 ) . bitLength ( ) ) ;
  int [ ] AD = new int [ N2 * 2 + 1 ] ;
  int [ ] BD = new int [ N2 * 2 + 1 ] ;
  /* update the index of the range */
  int x = N2 - 1 ;
  AD [ x ] = a ;
  BD [ x ] = b ;
  while ( x > 0 ) {
    x = ( x - 1 ) / 2 ;
    AD [ x ] = AD [ 2 * x + 1 ] * AD [ 2 * x + 2 ] ;
    BD [ x ] = BD [ 2 * x + 2 ] * BD [ x ] ;
  }
  /* update the index of the range */
  * P = new Integer [ N ] ;
  int ans [ ] = new int [ M ] ;
  int mi = 0 ;
  int ma = 1 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    update ( P [ i ] , A [ i ] , B [ i ] ) ;
    int res = AD [ 0 ] + BD [ 0 ] ;
    mi = Math . min ( res , mi ) ;
    ma = Math . max ( res , ma ) ;
  }
  System . out . println ( "" + mi ) ;
  System . out . println ( "" + ma ) ;
  return ans ;
}
