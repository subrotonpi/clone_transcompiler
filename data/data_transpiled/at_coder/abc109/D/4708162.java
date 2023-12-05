public static String print ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int [ ] [ ] lists = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    lists [ i ] = new int [ w ] ;
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      lists [ i ] [ j ] = Integer . parseInt ( input ) ;
    }
  }
  int count = 0 ;
  String operations = "" ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    int [ ] l = lists [ i ] ;
    for ( int j = 0 ;
    j < l . length ;
    j ++ ) {
      int a = l [ j ] ;
      if ( j == w - 1 ) {
        break ;
      }
      if ( a % 2 == 1 ) {
        lists [ i ] [ j ] -- ;
        lists [ i + 1 ] [ j ] ++ ;
        count ++ ;
        operations += String . valueOf ( i + 1 , " " + j + 1 ) + " " + i + 2 + " " + j + 1 ;
      }
    }
  }
  System . out . println ( count ) ;
  System . out . println ( operations ) ;
  return operations ;
}
