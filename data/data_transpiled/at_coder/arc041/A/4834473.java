public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( b >= k ) {
    System . out . println ( a + k ) ;
  }
  else {
    System . out . println ( a - ( k - b ) + b ) ;
  }
  return k ;
}
