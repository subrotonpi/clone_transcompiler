static void print ( ) {
  final String [ ] [ ] list = new String [ 4 ] [ ] ;
  for ( int a = 0 ;
  a < 4 ;
  a ++ ) {
    list [ a ] = input . split ( " " ) ;
  }
  for ( int a = 0 ;
  a < list . length ;
  a ++ ) {
    String string = "" ;
    for ( int b = 0 ;
    b < list [ 0 ] . length ;
    b ++ ) {
      if ( b == list [ 0 ] . length - 1 ) {
        string += list [ list . length - a - 1 ] [ list . length - b - 1 ] ;
      }
      else {
        string += list [ list . length - a - 1 ] [ list . length - b - 1 ] + " " ;
      }
    }
    System . out . println ( string ) ;
  }
}
