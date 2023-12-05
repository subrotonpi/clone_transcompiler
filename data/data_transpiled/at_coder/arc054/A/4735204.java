public static double d ( int l , int x , int y , int s , int d ) {
  double ans1 = ( ( d - s ) % l ) / ( y + x ) ;
  double ans2 ;
  if ( y - x > 0 ) ans2 = Double . NaN ;
  return ans1 ;
}
