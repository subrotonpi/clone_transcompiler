public static void print ( int n ) {
  n = ( int ) input . nextInt ( ) ;
  m = n / 10 ;
  n -= m * 10 ;
  System . out . println ( m * 100 + min ( n * 15 , 100 ) ) ;
}
