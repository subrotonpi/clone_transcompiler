public static int print ( int a , int b ) {
  double x = ( a + b ) / 2 ;
  if ( x - ( int ) x >= 0.5 ) {
    System . out . println ( ( int ) x + 1 ) ;
  }
  else {
    System . out . println ( ( int ) x ) ;
  }
  return x ;
}
