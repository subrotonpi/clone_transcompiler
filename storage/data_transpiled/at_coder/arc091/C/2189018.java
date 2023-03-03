public static int [ ] [ ] solve ( int N , int A , int B ) {
  if ( N - B + 1 < A || A < ( N + B - 1 ) / B ) {
    System . out . println ( - 1 ) ;
    exit ( 0 ) ;
  }
  ArrayList < Integer > res = new ArrayList < > ( ) ;
  Integer [ ] r = new Integer [ N ] ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    r [ i ] = N - i ;
    if ( N - i <= A - cnt || r . length == B ) {
      res . add ( r ) ;
      r = new Integer [ N ] ;
      cnt ++ ;
    }
  }
  if ( r . length > 0 ) res . add ( r ) ;
  return res . toArray ( ) ;
}
