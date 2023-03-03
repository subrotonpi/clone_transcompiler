public static void print ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  s = String . valueOf ( ( n - 1 ) % 9 + 1 ) ;
  System . out . println ( s * ( ( n - 1 ) / 9 + 1 ) ) ;
}
