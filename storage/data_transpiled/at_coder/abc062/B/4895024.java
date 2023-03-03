public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  int w = Integer . parseInt ( input . substring ( 1 , 2 ) ) ;
  char [ ] [ ] ans = new char [ w + 2 ] [ h + 2 ] ;
  char [ ] [ ] a = new char [ h ] [ w + 1 ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      ans [ i + 1 ] [ j + 1 ] = a [ i ] [ j ] ;
    }
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      System . out . print ( ans [ i ] [ j ] + " " ) ;
    }
    System . out . println ( ) ;
  }
}
