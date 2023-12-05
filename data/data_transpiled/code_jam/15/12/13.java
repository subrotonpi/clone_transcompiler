static final int NCASE = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
{
  int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int mn = min ( A ) ;
  int mx = max ( A ) ;
  int kk = max ( k - A . length ( ) , 0 ) ;
  int bg = 0 , ed = mx * ( kk + 1 ) ;
  while ( ed - bg > 1 ) {
    int md = ( bg + ed ) / 2 ;
    int c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    if ( c >= k ) ed = md ;
    else bg = md ;
  }
  return bg ;
}
for ( int testCase = 1 ;
testCase <= NCASE ;
testCase ++ ) {
  N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int [ ] A = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int start = bsStartTime ( A , K ) ;
  int m = K - Integer . parseInt ( System . console ( ) . readLine ( ) ) - Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  Iterator < Integer > i = A . iterator ( ) ;
  while ( i . hasNext ( ) ) {
    int a = i . next ( ) ;
    if ( start % a == 0 ) {
      m -- ;
      if ( m == 0 ) break ;
    }
  }
  System . out . println ( "Case #" + testCase + ": " + ( i . hasNext ( ) ? i . next ( ) : m ) ) ;
}
