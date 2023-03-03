public static int x ( int t ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) , t = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( t >= x ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( x - t ) ;
  }
  return x ;
}
