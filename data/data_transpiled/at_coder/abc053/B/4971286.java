public static void input ( ) {
  int [ ] indexA = new int [ S . length ( ) ] ;
  int [ ] indexZ = new int [ S . length ( ) ] ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'A' && indexA [ i ] == 0 ) indexA [ i ] = i + 1 ;
  }
  System . out . println ( max ( indexZ ) - indexA [ 0 ] + 1 ) ;
}
