public static String print ( String input ) {
  double m = input . nextDouble ( ) ;
  double km = m / 1000 ;
  String vv ;
  if ( km < 0.1 ) {
    vv = ( "00" ) ;
  }
  else if ( km <= 5 ) {
    if ( km < 1 ) {
      vv = "0" + Integer . toString ( km * 10 ) ;
    }
    else {
      vv = Integer . toString ( km * 10 ) ;
    }
  }
  else {
    vv = Integer . toString ( km ) ;
  }
  return vv ;
}
