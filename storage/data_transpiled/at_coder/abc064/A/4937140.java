public static String input ( ) {
  int x = input . nextInt ( ) ;
  int y = input . nextInt ( ) ;
  int z = input . nextInt ( ) ;
  int a = ( int ) ( x + y + z ) ;
  if ( a % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return "" ;
}
