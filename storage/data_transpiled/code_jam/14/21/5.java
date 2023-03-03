public static String minify ( String s ) {
  String r = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( i == 0 || s . charAt ( i - 1 ) != s . charAt ( i ) ) {
      r += s . charAt ( i ) ;
    }
  }
  /* toString */
  int [ ] a = new int [ s . length ( ) ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( i == 0 || s . charAt ( i - 1 ) != s . charAt ( i ) ) {
      a [ i ] += 1 ;
    }
    else {
      a [ a . length - 1 ] ++ ;
    }
  }
  /* solve the solution */
  if ( new HashSet < Integer > ( ) . add ( minify ( s ) ) . size ( ) > 1 ) {
    return "Fegla Won" ;
  }
  int [ ] [ ] A = new int [ s . length ( ) ] [ s . length ( ) ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    A [ i ] = toString ( S [ i ] ) ;
  }
  int ans = 0 ;
  for ( int p = 0 ;
  p < A [ 0 ] . length ;
  p ++ ) {
    int a = 99999999 ;
    for ( int x = Math . min ( a , a ) ;
    x <= Math . max ( a , a ) ;
    x ++ ) {
      a = Math . min ( a , Math . pow ( Math . abs ( a [ p ] - x ) , 2 ) ) ;
    }
    ans += a ;
  }
  return ans ;
}
