public static int getInt ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n % k == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( 1 ) ;
  }
  return n ;
}
