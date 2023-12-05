public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = n % ( a + b ) ;
  if ( c == 0 ) {
    System . out . println ( "Bug" ) ;
  }
  else if ( c - a > 0 ) {
    System . out . println ( "Bug" ) ;
  }
  else {
    System . out . println ( "Ant" ) ;
  }
}
