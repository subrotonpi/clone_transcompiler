public static int m ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  String vv = 0 ;
  if ( m < 100 ) {
    vv = "00" ;
  }
  else if ( 100 <= m && m <= 5000 ) {
    if ( m < 1000 ) {
      vv = "0" + Integer . toString ( m / 100 ) ;
    }
    else {
      vv = Integer . toString ( m / 100 ) ;
    }
  }
  else if ( 6000 <= m && m <= 30000 ) {
    vv = ( int ) ( ( m / 1000 ) + 50 ) ;
  }
  else if ( 35000 <= m && m <= 70000 ) {
    vv = ( int ) ( ( ( ( m / 1000 ) - 30 ) / 5 ) + 80 ) ;
  }
  else if ( 70000 <= m ) {
    vv = 89 ;
  }
  return vv ;
}
