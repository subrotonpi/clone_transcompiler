public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] bd = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    bd [ i ] = input . toCharArray ( ) ;
  }
  Set < Integer > x = new HashSet < Integer > ( ) ;
  Set < Integer > y = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( bd [ i ] [ j ] == '#' ) {
        x . add ( j ) ;
        y . add ( i ) ;
      }
    }
  }
  for ( int i : y ) {
    for ( int j : x ) {
      System . out . print ( bd [ i ] [ j ] ) ;
    }
    System . out . println ( ) ;
  }
}
