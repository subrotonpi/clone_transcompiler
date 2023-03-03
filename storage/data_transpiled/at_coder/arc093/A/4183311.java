public static int A = Integer . parseInt ( input ) {
  int [ ] B = Lists . newArrayList ( ) . stream ( ) . filter ( i -> i >= 0 ) . toArray ( ) ;
  int a = 0 ;
  int S = 0 ;
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    S += Math . abs ( B [ i ] - a ) ;
    a = B [ i ] ;
  }
  S += Math . abs ( B [ B . length - 1 ] ) ;
  for ( int j = 0 ;
  j < B . length ;
  j ++ ) {
    if ( j == 0 ) {
      if ( 0 <= B [ 0 ] && B [ 1 ] <= B [ 1 ] || 0 >= B [ 0 ] && B [ 1 ] >= B [ 1 ] ) System . out . println ( S ) ;
      else if ( B [ 0 ] <= 0 && B [ 1 ] <= B [ 0 ] || B [ 0 ] >= 0 && B [ 1 ] >= B [ 1 ] ) System . out . println ( S - 2 * Math . abs ( B [ 0 ] ) ) ;
      else System . out . println ( S - 2 * Math . abs ( B [ 1 ] - B [ 0 ] ) ) ;
    }
    else if ( j == B . length - 1 ) {
      if ( 0 <= B [ B . length - 1 ] && B [ B . length - 2 ] <= B [ B . length - 2 ] || 0 >= B [ B . length - 1 ] && B [ B . length - 2 ] >= B [ B . length - 2 ] ) System . out . println ( S ) ;
      else if ( B [ B . length - 1 ] <= 0 && B [ B . length - 2 ] <= B [ B . length - 1 ] || B [ B . length - 2 ] >= B [ B . length - 2 ] ) System . out . println ( S ) ;
      else System . out . println ( S - 2 * Math . abs ( B [ B . length - 1 ] - B [ B . length - 2 ] ) ) ;
    }
    else {
      if ( B [ j - 1 ] <= B [ j ] && B [ j + 1 ] <= B [ j ] || B [ j - 1 ] >= B [ j ] ) System . out . println ( S ) ;
      else if ( B [ j ] <= B [ j ] && B [ j + 1 ] >= B [ j ] )