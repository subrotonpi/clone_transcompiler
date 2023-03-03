public static double getDouble ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  double sum = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String x = input . nextLine ( ) ;
    String u = input . nextLine ( ) ;
    if ( u . equals ( "JPY" ) ) sum += ( ( float ) x ) ;
    else sum += ( ( float ) x * 380000 ) ;
  }
  return sum ;
}
