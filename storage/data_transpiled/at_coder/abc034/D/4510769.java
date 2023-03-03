public static int [ ] bisection ( int N , int K ) {
  int [ ] [ ] wp = new int [ N ] [ K ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) wp [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) wp [ i ] [ 0 ] = Integer . parseInt ( input ( ) . substring ( i , i + 1 ) ) ;
  int NGline = 100 ;
  int OKline = 0 ;
  /* bisection */
  int mid = ( sup + inf ) / 2 ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = wp [ i ] [ 0 ] * ( wp [ i ] [ 1 ] - mid ) / 100 ;
  Arrays . sort ( A , 0 , K ) ;
  int S = A [ N ] ;
  if ( S > 0 ) {
    inf = mid ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    NGline = sup ;
    OKline = inf ;
  }
  return A ;
}
