public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , input . length ( ) - 1 ) ) ;
  int w = Integer . parseInt ( input . substring ( input . length ( ) - 1 ) ) ;
  String [ ] s = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    s [ i ] = input . substring ( i , i + 1 ) ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    String l = "" ;
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s [ i ] . charAt ( j ) == '#' ) {
        l += "#" ;
      }
      else {
        int x = 0 ;
        for ( int dh = - 1 ;
        dh <= 0 ;
        dh += 1 ) {
          for ( int dw = - 1 ;
          dw <= 0 ;
          dw += 1 ) {
            if ( 0 <= i + dh && i + dh < h && 0 <= j + dw && s [ i + dh ] . charAt ( j + dw ) == '#' ) {
              x ++ ;
            }
          }
        }
        l += Integer . toString ( x ) ;
      }
    }
    System . out . println ( l ) ;
  }
}
