private static String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
for ( int testCase : xrange ( 1 , input ) ) {
  int n = input . nextInt ( ) ;
  int [ ] cnt = ArrayUtil . fromIntArray ( readLine ( ) . split ( " " ) ) ;
  System . out . println ( "Case #" + testCase + ":" + n ) ;
  while ( Arrays . binarySearch ( cnt , n ) > 0 ) {
    int [ ] x = new int [ cnt . length ] ;
    int [ ] y = new int [ cnt . length ] ;
    for ( int i = 0 ;
    i < cnt . length ;
    i ++ ) {
      x [ i ] = cnt [ i ] ;
      y [ i ] = cnt [ i ] ;
    }
    if ( Arrays . binarySearch ( cnt , x ) % 2 == 0 ) {
      System . out . println ( s [ x [ 1 ] ] + s [ y [ 1 ] ] ) ;
      cnt [ x [ 1 ] ] -- ;
      cnt [ y [ 1 ] ] -- ;
    }
    else {
      System . out . println ( s [ y [ 1 ] ] + " " + s [ y [ 1 ] ] ) ;
      cnt [ y [ 1 ] ] -- ;
    }
  }
  System . out . println ( ) ;
}
