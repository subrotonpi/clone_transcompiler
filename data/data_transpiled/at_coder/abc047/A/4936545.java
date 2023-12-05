public static int a ( ) throws IOException {
  int b = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  int c = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  if ( a + b == c || a + c == b || b + c == a ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return a ;
}
