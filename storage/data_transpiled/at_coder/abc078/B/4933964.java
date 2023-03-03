public static int X ( int X , int Y , int Z ) {
  int n = 0 ;
  int ans = 0 ;
  while ( n <= X ) {
    if ( Y * n + ( 1 + n ) * Z <= X ) {
      ans = n ;
    }
    n ++ ;
  }
  return ans ;
}
