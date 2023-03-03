public static int n ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( n % 2 ) == 0 ) {
    System . out . println ( n - 1 ) ;
  }
  else {
    System . out . println ( n + 1 ) ;
  }
  return n ;
}
