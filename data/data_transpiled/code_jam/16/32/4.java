public static void main ( String input ) {
  for ( int i = 1 ;
  i <= input . length ( ) ;
  i ++ ) {
    int B = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
    int M = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
    if ( M > 2 * ( B - 2 ) ) {
      System . out . println ( "Case #" + i + ": IMPOSSIBLE" ) ;
    }
    else {
      System . out . println ( "Case #" + i + ": POSSIBLE" ) ;
      List < Edge > edges = new ArrayList < > ( ) ;
      edges . add ( new Edge ( 1 , B ) ) ;
      M -- ;
      for ( int i = 0 ;
      i < Integer . SIZE ;
      i ++ ) {
        if ( Integer . toBinaryString ( Integer . valueOf ( M ) . substring ( i , i + 2 ) ) . equals ( "1" ) ) {
          edges . add ( new Edge ( 1 , i + 2 ) ) ;
        }
      }
      int [ ] [ ] ans = new int [ range ( B + 1 , i + 1 ) ] [ range ( B , i + 1 ) ] ;
      for ( int j = range ( 2 , i + 1 ) ;
      j < range ( i + 1 , j + 1 ) ;
      j ++ ) {
        ans [ i ] [ j ] = 1 ;
      }
      for ( Edge edge : edges ) {
        ans [ edge . ordinal ( ) ] [ edge . ordinal ( ) ] = 1 ;
      }
      for ( int j = range ( 1 , i + 1 ) ;
      j < range ( 1 , j + 1 ) ;
      j ++ ) {
        ans [ i ] [ j ] = 1 ;
      }
      for ( int j = range ( 1 , i + 1 ) ;
      j < range ( 1 , j + 1 ) ;
      j ++ ) {
        ans [ i ] [ j ] = 1 ;
      }
      for ( int j = range ( 1 , i + 1 ) ;
      j < range ( 1 , j + 1 ) ;
      j ++ ) {
        ans [ i ] [ j ] = 1 ;
      }
      for ( int j = range ( 1 , i + 1 ) ;
      j < range ( 1 , j + 1 ) ;
      j ++ ) {
        ans [ i ] [ j ] = 1 ;
      }
    }
  }
}
