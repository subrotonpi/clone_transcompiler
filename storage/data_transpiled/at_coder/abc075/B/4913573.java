public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , h ) ) ;
  int w = Integer . parseInt ( input . substring ( w + 2 , h + 1 ) ) ;
  String [ ] field = new String [ h + 2 ] ;
  field [ 0 ] = "%" + input . substring ( 0 , h + 2 ) + "%" ;
  for ( int i = 1 ;
  i <= h ;
  i ++ ) {
    for ( int j = 1 ;
    j <= w ;
    j ++ ) {
      int count = 0 ;
      if ( field [ i ] . charAt ( j ) == '.' ) {
        for ( int k = - 1 ;
        k <= 0 ;
        k ++ ) {
          for ( int l = - 1 ;
          l <= 0 ;
          l ++ ) {
            if ( field [ i + k ] . charAt ( j + l ) == '#' ) {
              count ++ ;
            }
          }
        }
        field [ i ] = field [ i ] . substring ( 0 , j ) + count + field [ i ] . substring ( j + 1 ) ;
      }
    }
  }
  for ( String line : field [ 1 : h + 1 ] . split ( " " ) ) {
    for ( char c : line . toCharArray ( ) ) {
      if ( c != '%' ) {
        System . out . print ( c ) ;
      }
    }
    System . out . println ( "" ) ;
  }
}
