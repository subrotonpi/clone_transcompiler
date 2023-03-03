public static void print ( double m ) {
  double km = m / 1000 ;
  String VV = 0 ;
  if ( 0.1 <= km && km <= 5 ) {
    VV = String . valueOf ( ( int ) ( km * 10 ) ) ;
    if ( VV . length ( ) == 1 ) {
      print ( 0 , Integer . parseInt ( VV ) , "" ) ;
    }
    else {
      print ( ( int ) ( km * 10 ) ) ;
    }
  }
  if ( 6 <= km && km <= 30 ) {
    print ( ( int ) ( km + 50 ) ) ;
  }
  if ( 35 <= km && km <= 70 ) {
    print ( ( int ) ( ( ( km - 30 ) / 5 ) + 80 ) ) ;
  }
  if ( km > 70 ) {
    print ( 89 ) ;
  }
  if ( km < 0.1 ) {
    print ( 0 , 0 , "" ) ;
  }
}
