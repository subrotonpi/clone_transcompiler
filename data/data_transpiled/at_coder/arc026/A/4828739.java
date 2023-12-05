public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n <= 5 ) {
    System . out . println ( n * b ) ;
  }
  else {
    System . out . println ( 5 * b + a * ( n - 5 ) ) ;
  }
  return a ;
}
