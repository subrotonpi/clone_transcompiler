@ VisibleForTesting static void bisect ( ) {
  String s = input . nextLine ( ) ;
  int [ ] x = new int [ 26 ] , y = new int [ 26 ] , k = 1 , p = new int [ 26 ] ;
  for ( int i = s . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    int n = ( s . charAt ( i ) - 97 ) ;
    x [ n ] = 0 ;
    p [ n ] [ 0 ] = - i ;
    if ( Integer . bitCount ( x [ n ] ) == 0 ) {
      k = k + 1 ;
      x = new int [ 26 ] ;
      y [ k ] = i ;
    }
  }
  y = new int [ k ] , num = 0 , ans = "" ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    for ( int j = 97 ;
    j < 123 ;
    j ++ ) {
      if ( ! s . regionMatches ( ( char ) j , num , y [ i ] , 0 , y [ i ] ) ) break ;
      ans += ( char ) j ;
      int b = Integer . bitCount ( p [ j - 97 ] [ b ] ) - 1 ;
      num = - p [ j - 97 ] [ b ] + 1 ;
    }
  }
  System . out . println ( ans ) ;
}
