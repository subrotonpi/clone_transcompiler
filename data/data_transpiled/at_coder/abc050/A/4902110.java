public static String print ( char A , char op , char B ) {
  if ( op == '+' ) {
    c = Integer . parseInt ( A ) + Integer . parseInt ( B ) ;
  }
  if ( op == '-' ) {
    c = Integer . parseInt ( A ) - Integer . parseInt ( B ) ;
  }
  return String . valueOf ( c ) ;
}
