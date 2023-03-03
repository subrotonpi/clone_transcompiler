static final int input ( ) {
  int a , b ;
  a = input . nextInt ( ) ;
  b = input . nextInt ( ) ;
  int x = ( int ) ( a + b ) ;
  if ( Math . sqrt ( x ) % 1 == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return x ;
}
