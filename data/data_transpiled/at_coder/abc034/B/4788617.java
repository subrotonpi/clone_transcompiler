public static int x ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x % 2 == 0 ) {
    System . out . println ( x - 1 ) ;
  }
  else {
    System . out . println ( x + 1 ) ;
  }
  return x ;
}
