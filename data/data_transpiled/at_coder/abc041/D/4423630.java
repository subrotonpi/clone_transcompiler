@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( int [ ] [ ] ints ) {
  final int n = ints . length ;
  final int [ ] [ ] ints = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ints [ i ] = ints [ i ] ;
  final int I = ints [ i ] [ 0 ] ;
  final int LS = ints [ i ] [ 1 ] ;
  final int S = ints [ i ] [ 1 ] ;
  final LinkedHashMap < Integer , Integer > IR = new LinkedHashMap < > ( ) ;
  final LinkedHashMap < Integer , Integer > LIR = new LinkedHashMap < > ( ) ;
  final LinkedHashMap < Integer , Integer > SR = new LinkedHashMap < > ( ) ;
  final LinkedHashMap < Integer , Integer > LS = new LinkedHashMap < > ( ) ;
  final LinkedHashMap < Integer , Integer > S = new LinkedHashMap < > ( ) ;
  final int mod = 1000000007 ;
  final int n = ints [ n ] ;
  final int m = ints [ n ] ;
  final ArrayList < Integer > out = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    out . add ( ints [ i ] [ 0 ] ) ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      int x = ints [ i ] [ j ] ;
      int y = ints [ i ] [ j ] ;
      x -- ;
      y -- ;
      out . get ( x ) . add ( y ) ;
    }
  }
  final int k = Math . pow ( 2 , n ) ;
  final int [ ] dp = new int [ k ] ;
  dp [ 0 ] = 1 ;
  final ArrayList < ArrayList < Integer >> l = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    dp [ i ] = 0 ;
    dp [ i ] = 1 ;
    final ArrayList < Integer > l = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < l . size ( ) ;
    j ++ ) {
      l . get ( l . get ( i ) ) . add ( ints [ j ] ) ;
    }
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      for ( int j = 0 ;
      j < n - l . get ( i ) . size ( ) ;
      j ++ ) {
        l . get ( i ) . add ( ints [ j ] ) ;
      }
      l . get ( i ) . add ( sum ( l .