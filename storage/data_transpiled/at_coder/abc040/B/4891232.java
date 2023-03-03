public static int rectDinder ( @ IntRange ( from = 0 , to = 1 ) int n ) {
  int h = 1 ;
  int minD = Integer . MAX_VALUE ;
  while ( h * h <= n ) {
    int w = n / h ;
    minD = Math . min ( Math . abs ( h - w ) + ( n - w * h ) , minD ) ;
    h ++ ;
  }
  return minD ;
}
