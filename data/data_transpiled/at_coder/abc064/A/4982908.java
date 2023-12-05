public static void print ( String [ ] work ) {
  work = input . split ( "\\s+" ) ;
  int r = Integer . parseInt ( work [ 0 ] ) ;
  int b = Integer . parseInt ( work [ 1 ] ) ;
  int g = Integer . parseInt ( work [ 2 ] ) ;
  int num = r * 100 + b * 10 + g ;
  if ( ( num % 4 ) == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
