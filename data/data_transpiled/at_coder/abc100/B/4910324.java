public static void main ( String input , int d , int n ) {
  if ( d == 0 && n == 100 ) {
    System . out . println ( 101 ) ;
  }
  else if ( d == 0 ) {
    System . out . println ( n ) ;
  }
  if ( d == 1 && n == 100 ) {
    System . out . println ( 10100 ) ;
  }
  else if ( d == 1 ) {
    System . out . println ( 100 * n ) ;
  }
  if ( d == 2 && n == 100 ) {
    System . out . println ( 1010000 ) ;
  }
  else if ( d == 2 ) {
    System . out . println ( 10000 * n ) ;
  }
}
