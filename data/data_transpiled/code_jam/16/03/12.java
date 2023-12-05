static final int [ ] getDigits ( ) {
  int N = 32 ;
  int J = 500 ;
  String s = "1" + ( "0" * ( N - 2 ) ) + "1" ;
  System . out . println ( "Case #1:" ) ;
  while ( ( J > 0 ) && ( s . length ( ) > J ) ) {
    int [ ] a = new int [ 10 ] ;
    for ( int base = 2 ;
    base < 11 ;
    base ++ ) {
      int num = Integer . parseInt ( s , base ) ;
      int i = 2 ;
      while ( ( i <= 1000000 ) && ( ( num % i ) == 0 ) ) {
        a [ i ] = i ;
        break ;
      }
      i = i + 1 ;
    }
    if ( ( i > 1000000 ) && ( ( num % i ) == 0 ) ) {
      break ;
    }
    if ( ( a . length == 9 ) && ( a [ 0 ] == 9 ) ) {
      System . out . println ( s + " " + a [ 0 ] + " " + a [ 1 ] + " " + a [ 2 ] + " " + a [ 3 ] + " " + a [ 4 ] + " " + a [ 5 ] + " " + a [ 6 ] + " " + a [ 7 ] + " " + a [ 8 ] ) ;
      J = J - 1 ;
      System . err . println ( J + " to go!" ) ;
    }
    int k = N - 2 ;
    while ( ( s . charAt ( k ) == '1' ) && ( s . charAt ( k ) == '2' ) ) {
      k = k - 1 ;
    }
    s = s . substring ( 0 , k ) + "1" + ( "0" * ( N - 2 - k ) ) + "1" ;
  }
  return a ;
}
