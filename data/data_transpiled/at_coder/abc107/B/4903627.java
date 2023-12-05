public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  String [ ] [ ] bd = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    bd [ i ] = input . split ( " " ) ;
  }
  Set < Integer > x = new HashSet < Integer > ( ) ;
  Set < Integer > y = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( bd [ i ] [ j ] . equals ( "#" ) ) {
        x . add ( j ) ;
        y . add ( i ) ;
      }
    }
  }
  for ( int i : y ) {
    for ( int j : x ) {
      System . out . print ( bd [ i ] [ j ] + " " ) ;
    }
    System . out . println ( ) ;
  }
}
