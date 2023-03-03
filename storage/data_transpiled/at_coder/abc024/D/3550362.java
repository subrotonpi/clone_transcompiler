public static int mod ( int mod ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  /*INV*/
  return ( ( C * B - C * A ) * INV ( A * B - C * B + C * A ) ) % mod ;
}
