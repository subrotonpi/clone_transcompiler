public static String print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int h = n / 3600 ;
  int m = ( n % 3600 ) / 60 ;
  int s = ( n % 3600 ) % 60 ;
  h = Integer . parseInt ( h ) ;
  m = Integer . parseInt ( m ) ;
  s = Integer . parseInt ( s ) ;
  return H + ':' + M + ':' + S ;
}
