public static void print ( int n ) {
  int salary = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    salary += i * 10000 * ( 1 / n ) ;
  }
  System . out . println ( ( int ) salary ) ;
}
