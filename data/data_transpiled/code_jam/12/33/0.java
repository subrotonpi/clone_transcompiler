@ Sys public static void print ( String seq ) {
  int i = 0 ;
  while ( ( i = 2 * i + 3 ) < seq . length ( ) ) {
    if ( seq . charAt ( 2 * i + 1 ) == seq . charAt ( 2 * i + 3 ) ) {
      seq = seq . substring ( 0 , 2 * i ) + seq . substring ( 2 * i ) + seq . substring ( 2 * i + 2 ) ;
    }
    else {
      i ++ ;
    }
  }
  System . out . println ( "Case #" + cn + ": " + W [ - 1 ] [ - 1 ] ) ;
}
