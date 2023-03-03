public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int h = n / 3600 ;
  n = n - h * 3600 ;
  int m = n / 60 ;
  int s = n - m * 60 ;
  if ( h < 10 ) System . out . print ( "0" + h + ":" ) ;
  else System . out . print ( h ) ;
}
