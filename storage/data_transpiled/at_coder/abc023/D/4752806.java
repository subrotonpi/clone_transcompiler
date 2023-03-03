public static void solve ( int n ) {
  int [ ] [ ] info = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) info [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  long maxTime = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) maxTime = Math . max ( maxTime , info [ i ] [ 0 ] + info [ i ] [ 1 ] * ( n - 1 ) ) ;
  /*solve(mid)*/
  long [ ] time = new long [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    time [ i ] = ( mid - info [ i ] [ 0 ] ) / info [ i ] [ 1 ] ;
  }
  Arrays . sort ( time ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( time [ i ] < i ) {
      /*return;*/
    }
  }
  long ng = 0 ;
  long ok = maxTime + 1 ;
  while ( Math . abs ( ok - ng ) > 1 ) {
    long mid = ( ok + ng ) / 2 ;
    if ( solve ( mid ) ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  System . out . println ( ok ) ;
}
