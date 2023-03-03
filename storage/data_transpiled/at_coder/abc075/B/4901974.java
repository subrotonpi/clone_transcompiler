public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , h ) ) ;
  int w = Integer . parseInt ( input . substring ( w , h ) ) ;
  String [ ] s = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s [ i ] . charAt ( j ) == '.' ) {
        int count = 0 ;
        for ( int i_ = i - 1 ;
        i_ < i + 2 ;
        i_ ++ ) {
          for ( int j_ = j - 1 ;
          j_ < j + 2 ;
          j_ ++ ) {
            if ( 0 <= i_ && i_ < h && 0 <= j_ && j_ < w ) {
              if ( s [ i_ ] . charAt ( j_ ) == '#' ) {
                count ++ ;
              }
            }
          }
        }
        s [ i ] = s [ i ] . substring ( 0 , j ) + count + s [ i ] . substring ( j + 1 ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    System . out . println ( s [ i ] ) ;
  }
}
