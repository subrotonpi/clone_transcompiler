public static String meter ( ) {
  String vv ;
  double meter = Double . parseDouble ( input . nextLine ( ) ) ;
  if ( 0 <= meter && meter < 100 ) {
    vv = "00" ;
  }
  else if ( 100 <= meter && meter < 1000 ) {
    vv = "0" + Double . toString ( meter / 100 ) ;
  }
  else if ( 1000 <= meter && meter <= 5000 ) {
    vv = ( int ) ( meter / 100 ) ;
  }
  else if ( 6000 <= meter && meter <= 30000 ) {
    vv = ( int ) ( ( meter / 1000 ) + 50 ) ;
  }
  else if ( 35000 <= meter ) {
    vv = ( int ) ( ( meter / 1000 ) + 50 ) ;
  }
  else if ( 70000 < meter ) {
    vv = 89 ;
  }
  return vv ;
}
