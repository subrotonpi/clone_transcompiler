static final int [ ] [ ] LINES = new int [ LINES . length ] [ LINES [ 0 ] ] ;
String line = new String ( line ) ;
int cases = Integer . parseInt ( line ) ;
for ( int testCase = 0 ;
testCase < cases ;
testCase ++ ) {
  final int n = Integer . parseInt ( line ) ;
  final int A = Integer . parseInt ( line ) ;
  final int B = Integer . parseInt ( line ) ;
  final int C = Integer . parseInt ( line ) ;
  final int D = Integer . parseInt ( line ) ;
  final int x0 = Integer . parseInt ( line ) ;
  final int y0 = Integer . parseInt ( line ) ;
  final int M = Integer . parseInt ( line ) ;
  final int [ ] [ ] buckets = new int [ n ] [ n ] ;
  for ( int y = 0 ;
  y < n ;
  y ++ ) buckets [ y ] [ X % 3 ] [ Y % 3 ] ++ ;
  int X = x0 ;
  int Y = y0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    buckets [ X % 3 ] [ Y % 3 ] ++ ;
    X = ( A * X + B ) % M ;
    Y = ( C * Y + D ) % M ;
  }
  int count = 0 ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) {
    for ( int y = 0 ;
    y < n ;
    y ++ ) {
      int n = buckets [ x ] [ y ] ;
      count += n * ( n - 1 ) * ( n - 2 ) / 6 ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    count += buckets [ i ] [ 0 ] * buckets [ i ] [ 1 ] * buckets [ i ] [ 2 ] ;
    count += buckets [ 0 ] [ i ] * buckets [ 1 ] [ i ] * buckets [ 2 ] [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    count += buckets [ 0 ] [ i ] * buckets [ 1 ] [ ( i + 1 ) % 3 ] * buckets [ 2 ] [ ( i + 2 ) % 3 ] ;
    count += buckets [ 0 ] [ i ] * buckets [ 1 ] [ ( i - 1 ) % 3 ] * buckets [ 2 ] [ ( i - 2 ) % 3 ] ;
  }
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + count ) ;
}
