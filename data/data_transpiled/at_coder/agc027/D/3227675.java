public static int [ ] [ ] a ( ) {
  int N = Integer . parseInt ( input ) ;
  int xzero = 3 ;
  int yzero = 5 ;
  int y = N + 1 ;
  int biggest = 8 * ( Integer . parseInt ( input ) / 4 ) + 1 ;
  int [ ] [ ] a = new int [ N + 4 ] [ N + 4 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      a [ i ] [ j ] = 0 ;
    }
  }
  int [ ] fours = new int [ ( Integer . parseInt ( input ) / 4 ) ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    fours [ i ] = 4 * i ;
  }
  int [ ] odds = new int [ ( Integer . parseInt ( input ) / 2 ) ] ;
  int [ ] evens = new int [ ( Integer . parseInt ( input ) / 2 ) ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    evens [ i ] = 2 * i + 1 ;
  }
  if ( N == 2 ) {
    System . out . println ( "4 7" ) ;
    System . out . println ( "23 10" ) ;
  }
  else {
    int x = xzero ;
    for ( int i = 0 ;
    i < fours . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < fours . length ;
      j ++ ) {
        a [ i ] [ j ] = x ;
        a [ i + 1 ] [ j + 1 ] = 2 * x ;
        a [ i ] [ j + 2 ] = biggest - x ;
        a [ i + 1 ] [ j + 3 ] = 2 * ( biggest - x ) ;
        a [ i + 2 ] [ j + 1 ] = biggest - x - ( Integer . parseInt ( input ) / 4 ) * 2 ;
        a [ i + 3 ] [ j + 2 ] = x + ( Integer . parseInt ( input ) / 4 ) * 2 ;
        a [ i + 3 ] [ j + 3 ] = 2 * ( x + ( Integer . parseInt ( input ) / 4 ) ) ;
        x += 2 ;
      }
      x += ( Integer . parseInt ( input ) / 4 ) * 2 ;
    }
  }
  for ( int i = 0 ;
  i < odds . length ;
  i ++ ) {
    for ( int j = 0 ;
    j <