public static void bBouquet ( int R , int B , int X , int Y ) {
  /* can make bouquet */
  if ( k > R || k > B ) {
    return ;
  }
  /* (R-k)/(X-1)+(B-k)/(Y-1) */
  int lower = 0 , upper = R + B ;
  while ( upper - lower > 1 ) {
    int mid = ( lower + upper ) / 2 ;
    if ( canMakeBouquet ( mid ) ) {
      lower = mid ;
    }
    else {
      upper = mid ;
    }
  }
}
