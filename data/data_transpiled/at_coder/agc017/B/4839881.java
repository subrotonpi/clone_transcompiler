public static void main ( String input , int n , int a , int b , int c , int d ) {
  int x , y , z , w ;
  int i ;
  int j ;
  int i ;
  int j ;
  x = ( a + c * i ) ;
  y = ( a + d * i ) ;
  j = n - i - 1 ;
  z = ( b + c * j ) ;
  w = ( b + d * j ) ;
  if ( x <= z && z <= y || x <= w && w <= y ) {
    System . out . println ( "YES" ) ;
    break ;
  }
}
