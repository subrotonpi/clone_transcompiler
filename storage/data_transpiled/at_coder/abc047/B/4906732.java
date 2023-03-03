public static void main ( String input , int w , int h , int n ) {
  int x1 = 0 , x2 = w , y1 = 0 , y2 = h ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    int a = input . nextInt ( ) ;
    if ( a == 1 ) x1 = Math . max ( x1 , x ) ;
    if ( a == 2 ) x2 = Math . min ( x2 , x ) ;
    if ( a == 3 ) y1 = Math . max ( y1 , y ) ;
    if ( a == 4 ) y2 = Math . min ( y2 , y ) ;
  }
  if ( y2 <= y1 || x2 <= x1 ) System . out . println ( 0 ) ;
  else System . out . println ( Math . max ( 0 , ( y2 - y1 ) * ( x2 - x1 ) ) ) ;
}
