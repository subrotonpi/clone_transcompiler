public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input ) ;
  }
  if ( 0 == S [ N ] ) {
    System . out . println ( N ) ;
    exit ( ) ;
  }
  int j = 0 ;
  int answer = 0 ;
  int s = 1 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    if ( i >= 1 ) {
      s = s / S [ i - 1 ] ;
    }
    if ( j <= i ) {
      s = S [ i ] ;
      j = i ;
      if ( s > K ) {
        continue ;
      }
    }
    while ( j <= N - 2 ) {
      if ( s * S [ j + 1 ] <= K ) {
        s = s * S [ j + 1 ] ;
        j ++ ;
      }
      else {
        break ;
      }
    }
    answer = Math . max ( answer , j - i + 1 ) ;
  }
  System . out . println ( answer ) ;
}
