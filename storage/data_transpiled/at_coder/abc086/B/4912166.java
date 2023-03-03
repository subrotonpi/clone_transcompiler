public static void input ( ) {
  int a = input . nextInt ( ) ;
  int b = input . nextInt ( ) ;
  int n = ( int ) ( a + b ) ;
  double m = n * 0.5 ;
  int i = ( int ) m ;
  int f = m - ( int ) m ;
  if ( f == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
