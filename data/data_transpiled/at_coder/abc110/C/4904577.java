public static void input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  int F = 1 ;
  int [ ] DD = new int [ 1001 ] ;
  int [ ] NUM = new int [ 1001 ] ;
  int [ ] grid = new int [ S . length ( ) ] ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    grid [ i ] = i ;
  }
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( ( ! DD [ ( S . charAt ( i ) ) ] == ( T . charAt ( i ) ) ) && ( ! DD [ ( S . charAt ( i ) ) ] == 0 ) ) {
      F = 0 ;
    }
    if ( DD [ ( S . charAt ( i ) ) ] == 0 ) {
      NUM [ ( T . charAt ( i ) ) ] = NUM [ ( T . charAt ( i ) ) ] + 1 ;
    }
    DD [ ( S . charAt ( i ) ) ] = ( T . charAt ( i ) ) ;
  }
  for ( int i : NUM ) {
    if ( i >= 2 ) {
      F = 0 ;
    }
  }
  System . out . println ( F == 1 ? "Yes" : "No" ) ;
}
