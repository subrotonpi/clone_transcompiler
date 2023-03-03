public static int solve ( int n , float [ ] a , float [ ] b ) {
  int i = 0 , j = 0 , ans = 0 ;
  while ( i < n && j < n ) {
    if ( a [ i ] < b [ j ] ) {
      i ++ ;
    }
    else {
      i ++ ;
      j ++ ;
      ans ++ ;
    }
  }
  return ans + n - i ;
}
