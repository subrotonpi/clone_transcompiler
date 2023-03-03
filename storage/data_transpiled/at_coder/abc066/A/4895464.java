public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a + b <= b + c && a + b <= a + c ) {
    System . out . println ( a + b ) ;
  }
  else if ( b + c <= a + b && b + c <= a + c ) {
    System . out . println ( b + c ) ;
  }
  else {
    System . out . println ( a + c ) ;
  }
  return a ;
}
