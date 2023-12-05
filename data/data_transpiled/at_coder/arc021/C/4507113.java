static final int input ( ) {
  int K = Integer . parseInt ( input ( ) ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  ArrayList < Integer > a = new ArrayList < > ( ) ;
  for ( String l : System . console ( ) . readLine ( ) . split ( " " ) ) {
    a . add ( Integer . parseInt ( l ) ) ;
  }
  int ok = 10 * 12 , ng = 0 ;
  int ans = 0 ;
  while ( ok - ng > 1 ) {
    int mid = ( ok + ng ) / 2 ;
    int count = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int a1 = a . get ( i ) ;
      int d = a . get ( i ) ;
      if ( a1 <= mid ) {
        count += ( mid + d - a1 ) / d ;
      }
      else {
        break ;
      }
    }
    if ( count >= K ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  ans = 0 , count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a1 = a . get ( i ) ;
    int d = a . get ( i ) ;
    if ( a1 <= ok ) {
      int n = ( ok + d - a1 ) / d ;
      if ( a1 + d * ( n - 1 ) == ok ) {
        n -- ;
      }
      count += n ;
      ans += ( n * ( 2 * a1 + ( n - 1 ) * d ) ) / 2 ;
    }
  }
  if ( count < K ) {
    ans += ( K - count ) * ok ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
