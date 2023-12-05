public static void num ( ) {
  num = list ( map . get ( input ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  num . sort ( ) ;
  System . out . println ( num [ 0 ] + num [ 1 ] + num [ 2 ] * ( 2 * K ) ) ;
}
