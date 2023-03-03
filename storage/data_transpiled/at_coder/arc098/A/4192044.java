@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int solve ( int N , String S ) {
  Counter c = new Counter ( S ) ;
  int ans = 3 * 10 * 5 + 1 ;
  int rightE = c . getCount ( "E" ) ;
  int leftW = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == 'E' ) rightE -- ;
    ans = Math . min ( ans , leftW + rightE ) ;
    if ( S . charAt ( i ) == 'W' ) leftW ++ ;
  }
  return ans ;
}
