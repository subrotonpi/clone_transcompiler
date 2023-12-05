static void print ( int n , int k , int x , int y ) {
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    x = input . nextInt ( ) ;
    y = input . nextInt ( ) ;
  }
  int ans = min ( k , n ) * x + max ( 0 , n - k ) * y ;
  System . out . println ( ans ) ;
}
