public static int n ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) , n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x <= n / 2 ) {
    System . out . println ( x - 1 ) ;
  }
  else {
    System . out . println ( n - x ) ;
  }
  return x ;
}
