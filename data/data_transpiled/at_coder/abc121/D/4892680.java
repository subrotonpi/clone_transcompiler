public static String solve ( String string ) {
  int a = Integer . parseInt ( string ) ;
  int b = Integer . parseInt ( string ) ;
  /*if(a % 4 == 1) {
  return 1;
  }*/
  if ( a % 4 == 1 ) {
    return 1 ;
  }
  if ( a % 4 == 2 ) {
    return a + 1 ;
  }
  if ( a % 4 == 3 || a == 0 ) {
    return 0 ;
  }
  return String . valueOf ( a - 1 ^ b ) ;
}
