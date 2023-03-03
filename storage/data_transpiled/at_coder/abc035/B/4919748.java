public static int drone ( @ Nonnull String S , int T ) {
  HashMap < Character , Integer > map = new HashMap < Character , Integer > ( ) ;
  map . put ( 'L' , 0 ) ;
  map . put ( 'R' , 0 ) ;
  map . put ( 'U' , 0 ) ;
  map . put ( 'D' , 0 ) ;
  map . put ( '?' , 0 ) ;
  for ( char c : S . toCharArray ( ) ) {
    map . put ( c , ++ i ) ;
  }
  int dx = Math . abs ( map . get ( 'L' ) - map . get ( 'R' ) ) ;
  int dy = Math . abs ( map . get ( 'U' ) - map . get ( 'D' ) ) ;
  if ( T == 1 ) {
    return dx + dy + map . get ( '?' ) ;
  }
  int minD = dx + dy - map . get ( '?' ) ;
  if ( minD >= 0 ) {
    return minD ;
  }
  return ( - minD ) % 2 ;
}
