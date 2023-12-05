public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int c4 = 0 ;
  int c2 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] % 4 == 0 ) {
      c4 ++ ;
    }
    else if ( A [ i ] % 2 == 0 ) {
      c2 ++ ;
    }
  }
  int a , b ;
  if ( c4 > 0 ) {
    a = c4 * 2 + 1 ;
  }
  else {
    a = 0 ;
  }
  if ( c2 > 1 ) {
    b = c2 ;
    if ( a > 0 ) {
      a -- ;
    }
  }
  else {
    b = 0 ;
  }
  if ( a + b >= N ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
