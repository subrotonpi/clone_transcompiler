public static void print ( int N ) {
  int [ ] height = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    height [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  height [ height . length - 1 ] = 0 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    while ( height [ i ] > 0 ) {
      int j = 0 ;
      while ( height [ i + j ] > 0 ) {
        height [ i + j ] = height [ i + j ] - 1 ;
        j = j + 1 ;
      }
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
