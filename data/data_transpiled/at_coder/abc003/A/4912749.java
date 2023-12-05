public static void print ( int n ) {
  int i = 0 ;
  long k = 10000 ;
  long sum = 0 ;
  while ( i < n ) {
    sum += k / n ;
    k += 10000 ;
    i ++ ;
  }
  System . out . println ( ( int ) sum ) ;
}
