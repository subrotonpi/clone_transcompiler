static int toMinutes ( String str ) throws IOException {
  final String a = str . substring ( 0 , str . indexOf ( ':' ) ) ;
  final String b = str . substring ( str . indexOf ( ':' ) + 1 ) ;
  return Integer . parseInt ( a ) * 60 + Integer . parseInt ( b ) ;
}
