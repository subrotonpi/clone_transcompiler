static final int getM ( ) {
  int m = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  double ans = 0 ;
  if ( 100 <= m && m <= 5000 ) {
    ans = m / 100 ;
  }
  else if ( 6000 <= m && m <= 30000 ) {
    ans = m / 1000 + 50 ;
  }
  else if ( m <= 70000 ) {
    ans = 89 ;
  }
  return ans ;
}
