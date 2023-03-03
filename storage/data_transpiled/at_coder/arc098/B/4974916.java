public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int l = 1 ;
  int r = 1 ;
  int XOR = A [ 0 ] ;
  int SUM = A [ 0 ] ;
  int answer = 0 ;
  while ( true ) {
    if ( r < N ) {
      if ( XOR ^ A [ r ] == SUM + A [ r ] ) {
        XOR = XOR ^ A [ r ] ;
        SUM = SUM + A [ r ] ;
        r ++ ;
        continue ;
      }
      else {
        if ( l == r ) {
          answer ++ ;
          XOR = A [ r ] ;
          SUM = A [ r ] ;
          l ++ ;
          r ++ ;
        }
        else {
          answer += r - ( l - 1 ) ;
          XOR = XOR ^ A [ l - 1 ] ;
          SUM = SUM - A [ l - 1 ] ;
          l ++ ;
        }
      }
    }
    else {
      answer += ( N - ( l - 1 ) ) * ( N - ( l - 1 ) + 1 ) / 2 ;
      break ;
    }
  }
  System . out . println ( answer ) ;
}
