public static void print ( int n , int a , int b ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    int sum = 0 ;
    int ans_i = i ;
    for ( int j = 0 ;
    j < 5 ;
    j ++ ) {
      sum += i % 10 ;
      i = i / 10 ;
    }
    if ( a <= sum && sum <= b ) {
      ans += ans_i ;
    }
  }
  System . out . println ( ans ) ;
}
