public static String print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String h = String . valueOf ( n / 3600 ) ;
  String m = String . valueOf ( ( n - Integer . parseInt ( h ) * 3600 ) / 60 ) ;
  String s = String . valueOf ( ( n - Integer . parseInt ( m ) * 3600 ) ) ;
  return s ;
}
