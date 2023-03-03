public static int k ( ) {
  k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( k % 2 == 0 ) {
    System . out . println ( ( int ) ( k / 2 * k / 2 ) ) ;
  }
  else {
    System . out . println ( ( int ) ( ( k + 1 ) / 2 * ( k - 1 ) / 2 ) ) ;
  }
  return k ;
}
