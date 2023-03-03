public static int n ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( 0 < n % 10 && n < 7 ) System . out . println ( 100 * ( n / 10 ) + 15 * ( n % 10 ) ) ;
  else System . out . println ( 100 * ( ( ( n - 1 ) / 10 ) + 1 ) ) ;
}
