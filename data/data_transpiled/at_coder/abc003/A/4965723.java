public static void print ( int n ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    sum += i * 10000 ;
  }
  System . out . println ( sum / n ) ;
}
