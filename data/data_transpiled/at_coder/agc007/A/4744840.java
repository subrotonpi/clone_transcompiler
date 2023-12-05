public static void print ( int h , int w ) {
  int c = 0 ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    String [ ] a = input . split ( " " ) ;
    StringBuilder b = new StringBuilder ( ) ;
    for ( int j = 0 ;
    j < w ;
    j ++ ) b . append ( a [ j ] ) ;
    c += b . toString ( ) . indexOf ( "#" ) ;
  }
  System . out . println ( h + w - 1 == c ? "Possible" : "Impossible" ) ;
}
