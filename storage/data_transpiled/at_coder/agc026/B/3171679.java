public static int [ ] [ ] getBigIntegerArray ( int t ) {
  int [ ] [ ] abcd = new int [ t ] [ ] ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    abcd [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Calculate the gcd of the two integers */
  if ( t < 0 ) {
    t = 0 ;
  }
  if ( t == 0 ) {
    return abcd ;
  }
  int z = t % t ;
  for ( int i = 0 ;
  i < abcd . length ;
  i ++ ) {
    int a = abcd [ i ] [ 0 ] ;
    int b = abcd [ i ] [ 1 ] ;
    int c = abcd [ i ] [ 2 ] ;
    int d = abcd [ i ] [ 3 ] ;
    if ( b > a || b > d ) {
      System . out . println ( "No" ) ;
      continue ;
    }
    else if ( c >= b ) {
      System . out . println ( "Yes" ) ;
      continue ;
    }
    int g = abcd [ i ] [ 0 ] ;
    if ( b - g + ( a % g ) > c ) {
      System . out . println ( "No" ) ;
    }
    else {
      System . out . println ( "Yes" ) ;
    }
  }
  return abcd ;
}
