public static int W ( int a , int b ) {
  if ( a + W < b ) {
    System . out . println ( b - a - W ) ;
  }
  else if ( b + W < a ) {
    System . out . println ( a - b - W ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return a ;
}
