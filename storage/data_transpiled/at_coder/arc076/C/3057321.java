public static String [ ] [ ] getStrings ( ) {
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] a = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = new int [ 3 ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      a [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  ArrayList < int [ ] > iru = new ArrayList < int [ ] > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( ( a [ i ] [ 0 ] == 0 || a [ i ] [ 0 ] == r || a [ i ] [ 1 ] == 0 || a [ i ] [ 1 ] == c ) && ( a [ i ] [ 2 ] == 0 || a [ i ] [ 2 ] == r || a [ i ] [ 3 ] == 0 || a [ i ] [ 3 ] == c ) ) ) {
      int [ ] b = a [ i ] ;
      int [ ] b1 = new int [ 3 ] ;
      int [ ] b2 = new int [ 3 ] ;
      int [ ] tmp = new int [ 4 ] ;
      tmp [ 0 ] = b [ 0 ] ;
      tmp [ 1 ] = b [ 1 ] ;
      tmp [ 2 ] = b [ 2 ] ;
      tmp [ 3 ] = b [ 3 ] ;
      if ( b1 [ 0 ] == 0 ) {
        b1 = b1 [ 1 ] ;
      }
      else if ( b1 [ 1 ] == c ) {
        b1 = b1 [ 0 ] + b1 [ 1 ] ;
      }
      else if ( b1 [ 0 ] == r ) {
        b1 = c + r + c - b1 [ 1 ] ;
      }
      else {
        b1 = c * 2 + r * 2 - b1 [ 0 ] ;
      }
      if ( b2 [ 0 ] == 0 ) {
        b2 = b2 [ 1 ] ;
      }
      else if ( b2 [ 1 ] == c ) {
        b2 = b2 [ 0 ] + b2 [ 1 ] ;
      }
      else if ( b2 [ 0 ] == r ) {
        b2 = c * 2 + r - b2 [ 1 ] ;
      }
      else {
        b2 = c * 2 + r * 2 - b2 [ 0 ] ;
      }
      if ( b1