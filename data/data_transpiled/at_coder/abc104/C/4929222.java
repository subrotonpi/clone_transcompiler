static final int [ ] getStdDev ( ) {
  int D = Integer . parseInt ( input ( ) ) ;
  int G = Integer . parseInt ( input ( ) ) ;
  int [ ] P = new int [ D ] ;
  int [ ] C = new int [ D ] ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) {
    int p = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    P [ i ] = p ;
    C [ i ] = c ;
  }
  int answer = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < 2 * D ;
  i ++ ) {
    int point = 0 ;
    int x = - 1 ;
    int nowAnswer = 0 ;
    for ( int j = 0 ;
    j < D ;
    j ++ ) {
      if ( i >> j & 1 ) {
        point += P [ j ] * ( j + 1 ) * 100 + C [ j ] ;
        nowAnswer += P [ j ] ;
      }
      else {
        x = j ;
      }
    }
    if ( G <= point ) {
      answer = Math . min ( nowAnswer , answer ) ;
    }
    else {
      int n = Math . ceil ( ( G - point ) / ( ( x + 1 ) * 100 ) ) ;
      if ( n < P [ x ] ) {
        nowAnswer += n ;
        answer = Math . min ( nowAnswer , answer ) ;
      }
    }
  }
  System . out . println ( answer ) ;
  return P ;
}
