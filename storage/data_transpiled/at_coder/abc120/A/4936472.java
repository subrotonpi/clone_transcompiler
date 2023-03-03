@ Parameters public static List < Integer > input ( ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = i > 1 / i > 0 ? 1 : 0 ;
  int c = i > 2 ? 1 : 0 ;
  if ( a < c ) {
    System . out . println ( a ) ;
  }
  else {
    System . out . println ( c ) ;
  }
  return i ;
}
