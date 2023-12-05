public static int n ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  return ( String . valueOf ( ( n - 1 ) % 9 + 1 ) * ( ( n - 1 ) / 9 + 1 ) ) ;
}
