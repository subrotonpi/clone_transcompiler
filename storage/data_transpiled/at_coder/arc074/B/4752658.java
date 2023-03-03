static final long [ ] resize ( long [ ] al ) {
  int n = Integer . parseInt ( input ( ) ) ;
  ArrayList < Integer > al = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    al [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  PriorityQueue < Integer > q = new PriorityQueue < > ( al . length ) ;
  heapify ( q ) ;
  long s = Long . MAX_VALUE ;
  ArrayList < Long > ll = new ArrayList < > ( ) ;
  ll . add ( s ) ;
  for ( int i = n ;
  i < 2 * n ;
  i ++ ) {
    long a = al [ i ] ;
    s += a ;
    a = heapify ( q , a ) ;
    s -= a ;
    ll . add ( s ) ;
  }
  s = 0 ;
  q = new PriorityQueue < > ( ) ;
  heapify ( q ) ;
  for ( int i = 2 * n - 1 ;
  i >= n ;
  i -- ) {
    long a = al [ i ] ;
    s += - a ;
    a = heapify ( q , - a ) ;
    s -= a ;
    rl . add ( s ) ;
  }
  rl . reverse ( ) ;
  long res = ll . get ( 0 ) - rl . get ( 0 ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    res = Math . max ( res , ll . get ( i ) - rl . get ( i ) ) ;
  }
  System . out . println ( res ) ;
  return ll . toArray ( ) ;
}
