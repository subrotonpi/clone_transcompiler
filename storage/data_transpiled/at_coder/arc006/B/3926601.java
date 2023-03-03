public static int amida ( int n , int l ) {
  char [ ] a = new char [ l ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    a [ i ] = Character . charValue ( input . charAt ( i ) ) ;
  }
  int goal = input . indexOf ( 'o' ) ;
  int [ ] s = {
    l - 1 , goal }
    ;
    /* amida */
    if ( s [ 0 ] == - 1 ) {
      return s [ 1 ] / 2 + 1 ;
    }
    if ( s [ 1 ] >= 0 && s [ 1 ] == '-' ) {
      return s [ 1 ] ;
    }
    else if ( s [ 2 ] == '-' ) {
      return s [ 2 ] ;
    }
  }
  