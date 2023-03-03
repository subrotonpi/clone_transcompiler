static final int CONVERT = 10000 ;
int [ ] [ ] splits = new int [ K + 1 ] [ K ] ;
for ( int i = 0 ;
i < K ;
i ++ ) {
  for ( int j = 0 ;
  j < power ;
  j ++ ) {
    splits [ nums . indexOf ( Math . min ( nums , j ) ) ] ++ ;
  }
  int ans = 1 ;
  for ( int n : splits ) ans *= n / CONVERT ;
  return ans ;
}
{
  double logs = 0 ;
  if ( nums [ 0 ] == 0 ) return - 100000 ;
  return Math . log ( nums [ 0 ] ) ;
}
{
  double logadd = 0 ;
  double a = 0 ;
  double b = 0 ;
  if ( a < b ) a = b ;
  return a + logs ( 1 + Math . exp ( b - a ) ) ;
}
{
  int [ ] [ ] store = new int [ K + 1 ] [ K + 1 ] ;
  for ( int i = 0 ;
  i < K + 1 ;
  i ++ ) {
    store [ i ] = new int [ nums . length ] ;
  }
  for ( int k = 0 ;
  k < K + 1 ;
  k ++ ) {
    for ( int i = 0 ;
    i < nums . length ;
    i ++ ) {
      if ( k == 0 ) {
        store [ k ] [ i ] = 0 ;
      }
      else if ( i == 0 ) {
        store [ k ] [ i ] = - 100000 ;
      }
      else {
        store [ k ] [ i ] = logadd ( store [ k - 1 ] [ i - 1 ] + logs ( nums [ i ] ) , store [ k ] [ i - 1 ] + logs ( 1 - nums [ i ] ) ) ;
      }
    }
  }
  return store [ K ] [ nums . length - 1 ] ;
}
int T = Integer . parseInt ( input ( ) ) ;
for ( int testCase = 1 ;
testCase <= T ;
testCase ++ ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  double power = Double . parseDouble ( input ( ) ) ;
  power *= CONVERT ;
  power = Math . round ( power ) ;
  List < Integer > starts = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < starts . size ( ) ;
  i ++ ) {
    starts . set ( i , Math . round ( starts . get ( i ) * CONVERT ) ) ;
  }
  int ans = splits [ k ] [ n ]