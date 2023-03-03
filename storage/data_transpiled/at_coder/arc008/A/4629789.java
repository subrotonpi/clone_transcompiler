public static int n ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n % 10 < 7 ) System . out . println ( ( Math . round ( n / 10 ) * 100 ) + ( ( n % 10 ) * 15 ) ) ;
  else System . out . println ( 100 * ( Math . round ( n / 10 ) + 1 ) ) ;
}
