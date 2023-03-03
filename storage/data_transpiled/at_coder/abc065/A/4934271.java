public static int X = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A - B >= 0 ) {
    System . out . println ( "delicious" ) ;
  }
  else if ( X + A - B >= 0 ) {
    System . out . println ( "safe" ) ;
  }
  else {
    System . out . println ( "dangerous" ) ;
  }
  return A ;
}
