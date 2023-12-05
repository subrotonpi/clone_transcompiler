public static int x ( int a , int b ) {
  if ( a >= b ) {
    System . out . println ( "delicious" ) ;
  }
  else if ( b - a <= x ) {
    System . out . println ( "safe" ) ;
  }
  else {
    System . out . println ( "dangerous" ) ;
  }
  return a ;
}
