public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] a = new char [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    a [ i ] = input . charAt ( 0 ) ;
  }
  boolean [ ] row = new boolean [ H ] ;
  boolean [ ] col = new boolean [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( a [ i ] [ j ] == '#' ) {
        row [ i ] = true ;
        col [ j ] = true ;
      }
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    if ( row [ i ] ) {
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        if ( col [ j ] ) {
          System . out . print ( a [ i ] [ j ] ) ;
        }
      }
      System . out . println ( ) ;
    }
  }
}
