public static int n ( int x , int n ) {
  x = Math . min ( x , n - x ) ;
  n = n - x ;
  int ans = 0 ;
  do {
    int new_x = n % x ;
    int new_n = n / x ;
    if ( new_x == 0 ) {
      System . out . println ( ans + x * new_n * 3 ) ;
      exit ( ) ;
    }
    else {
      ans = ans + x * new_n * 3 ;
      n = x ;
      x = new_x ;
    }
  }
  while ( n != 0 ) ;
  return ans ;
}
