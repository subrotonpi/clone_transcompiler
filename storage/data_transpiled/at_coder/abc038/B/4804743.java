public static int getOne ( ) {
  int H1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int W1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int H2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int W2 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( H1 == H2 || H1 == W2 || W1 == H2 || W1 == W2 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return H1 ;
}
