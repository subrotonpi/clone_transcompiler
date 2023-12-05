static final int solve ( ) {
  int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int P = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int Ingr = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int [ ] Pkg = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Pkg [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int [ ] [ ] canMake = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int m = Ingr [ i ] ;
    Arrays . sort ( Pkg [ i ] ) ;
    for ( int p : Pkg [ i ] ) {
      int x = ( 10 * p + m * 11 - 1 ) / ( m * 11 ) ;
      int y = ( 10 * p ) / ( m * 9 ) ;
      if ( x <= y ) canMake [ i ] [ p ] = new int [ x ] [ y ] ;
    }
  }
  int ans = 0 ;
  while ( true ) {
    if ( ! Arrays . equals ( canMake , N ) ) break ;
    List < Integer > firsts = Arrays . asList ( canMake ) ;
    int x = firsts . get ( 0 ) ;
    int y = firsts . get ( 1 ) ;
    if ( max ( x ) <= min ( y ) ) {
      ans ++ ;
      canMake = Arrays . copyOf ( canMake , x + 1 ) ;
    }
    else {
      int i = firsts . indexOf ( min ( firsts ) ) ;
      canMake [ i ] = canMake [ i ] . clone ( ) ;
    }
  }
  return ans ;
}
