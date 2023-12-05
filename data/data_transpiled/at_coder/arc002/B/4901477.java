public static void main ( String input ) {
  int y = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  int s [ ] = {
    31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 30 , 31 , 30 , 31 }
    ;
    if ( m == 2 ) {
      if ( y % 4 == 0 ) {
        if ( y % 100 == 0 ) {
          if ( y % 400 == 0 ) {
            s [ 1 ] ++ ;
          }
        }
        else {
          s [ 1 ] ++ ;
        }
      }
    }
    for ( int i = m ;
    i < 13 ;
    i ++ ) {
      if ( y % i == 0 ) {
        for ( int j = ( i != m ? 1 : d ) ;
        j <= s [ i - 1 ] ;
        j ++ ) {
          if ( ( y / i ) % j == 0 ) {
            System . out . println ( String . valueOf ( y ) + "/" + "0" * ( 2 - String . valueOf ( i ) . length ( ) ) + String . valueOf ( i ) + "/" + "0" * ( 2 - String . valueOf ( j ) . length ( ) ) + String . valueOf ( j ) ) ;
            exit ( ) ;
          }
        }
      }
      else {
        System . out . println ( String . valueOf ( y + 1 ) + "/01/01" ) ;
      }
    }
  }
  