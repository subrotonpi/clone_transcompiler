public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a + b >= c ) {
    System . out . println ( b + c ) ;
  }
  else {
    int ans = a + b + 1 + b ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
