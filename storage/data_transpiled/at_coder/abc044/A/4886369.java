public static int [ ] get3 ( int n , int k , int x , int y ) {
  int n = input ( ) ;
  int k = input ( ) ;
  int x = input ( ) ;
  int y = input ( ) ;
  if ( n <= k ) {
    System . out . println ( n * x ) ;
  }
  else {
    System . out . println ( k * x + ( n - k ) * y ) ;
  }
  return y ;
}
