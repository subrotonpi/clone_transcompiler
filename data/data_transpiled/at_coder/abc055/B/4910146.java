public static void print ( int n ) {
  int power = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    power = power * ( i + 1 ) % 1000000007 ;
    power %= 1000000007 ;
  }
  System . out . println ( power ) ;
}
