static void print ( int n , int k , int x , int y ) {
  x = map ( Integer . valueOf ( 0 ) , open ( ) ) ;
  System . out . println ( min ( n , k ) * x + max ( n - k , 0 ) * y ) ;
}
