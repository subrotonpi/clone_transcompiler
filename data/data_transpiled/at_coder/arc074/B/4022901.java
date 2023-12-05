@ VisibleForTesting static int [ ] a ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] * a = Integer . parseInt ( input . nextLine ( ) ) ;
  float inf = Float . POSITIVE_INFINITY ;
  int pos = n ;
  long [ ] q = new long [ n ] , r = new long [ n ] ;
  long [ ] u = new long [ 3 * n ] , d = new long [ 3 * n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heapq . add ( a [ i ] ) ;
    u [ i ] = u [ i - 1 ] > 0 ? 1 : 0 ;
    u [ i ] += a [ i ] ;
  }
  for ( int i = n ;
  i < 2 * n ;
  i ++ ) {
    heapq . add ( a [ i ] ) ;
    long b = heapq . get ( q ) ;
    u [ i ] = u [ i - 1 ] + a [ i ] - b ;
  }
  for ( int i = 2 * n ;
  i < 3 * n ;
  i ++ ) {
    heapq . add ( r ) ;
    long b = heapq . get ( r ) ;
    d [ i ] = d [ i + 1 ] != 3 * n - 1 ? 1 : 0 ;
    d [ i ] += a [ i ] ;
  }
  for ( int i = n ;
  i < 2 * n ;
  i ++ ) {
    heapq . add ( r ) ;
    long b = heapq . get ( r ) ;
    d [ i ] = d [ i + 1 ] + a [ i ] + b ;
  }
  int ans = - inf ;
  for ( int i = n - 1 ;
  i < 2 * n ;
  i ++ ) {
    ans = Math . max ( ans , u [ i ] - d [ i + 1 ] ) ;
  }
  System . out . println ( ans ) ;
  return q ;
}
