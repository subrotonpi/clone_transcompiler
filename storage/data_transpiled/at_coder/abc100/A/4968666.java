@ Parameters public static List < Integer > input ( ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = i > 0 ? 1 : 0 ;
  int B = i > 1 ? 1 : 0 ;
  if ( ( A - B > 1 ) || ( B - A > 1 ) ) {
    System . out . println ( ":(" ) ;
  }
  if ( ( ( A - B ) == 0 ) || ( ( A - B ) == 1 ) || ( ( B - A ) == 0 ) || ( ( B - A ) == 1 ) ) {
    System . out . println ( "Yay!" ) ;
  }
  return Arrays . asList ( i ) ;
}
