public static void main ( int n , int k , int x , int y ) {
  x = [ int . valueOf ( input . nextInt ( ) ) ] ;
  y = [ int . valueOf ( input . nextInt ( ) ) ] ;
  System . out . println ( x * min ( n , k ) + y * max ( n - k , 0 ) ) ;
}
