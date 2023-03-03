public static void input ( ) {
  int a = input . nextInt ( ) ;
  int b = input . nextInt ( ) ;
  int num = ( int ) ( a + b ) ;
  if ( ( num * 0.5 ) . isInteger ( ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
