private static int N = Integer . parseInt ( input ) {
  int Z = Integer . parseInt ( input . nextLine ( ) ) ;
  int * A , W ;
  Z = Integer . parseInt ( input . nextLine ( ) ) ;
  W = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 ) {
    System . out . println ( Math . abs ( A [ 0 ] - W ) ) ;
  }
  else {
    System . out . println ( Math . max ( Math . abs ( A [ A - 1 ] - W ) , Math . abs ( A [ A - 2 ] - A [ A - 1 ] ) ) ) ;
  }
  return Z ;
}
