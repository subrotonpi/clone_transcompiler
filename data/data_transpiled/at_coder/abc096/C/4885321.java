public static void print ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  String [ ] s = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    s [ i ] = input . substring ( 0 , i ) ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s [ i ] . charAt ( j ) == '#' ) {
        if ( ( i + 1 < h && s [ i + 1 ] . charAt ( j ) == '#' ) || ( 0 <= i - 1 && s [ i - 1 ] . charAt ( j ) == '#' ) || ( j + 1 < w && s [ i ] . charAt ( j + 1 ) == '#' ) ) continue ;
        else {
          System . out . println ( "No" ) ;
          exit ( ) ;
        }
      }
      else continue ;
    }
  }
  System . out . println ( "Yes" ) ;
}
