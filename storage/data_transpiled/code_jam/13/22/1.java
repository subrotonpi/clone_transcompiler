@ GwtIncompatible ( "java.lang.ref.WeakReference" ) public static double findout ( int n , int x , int y ) {
  final IntStack vstup = new IntStack ( ) ;
  vstup . push ( x ) ;
  final int t = vstup . pop ( ) ;
  final int n = Math . abs ( x ) ;
  int numfull = 0 ;
  int fullsize = 1 ;
  while ( fullsize <= n ) {
    numfull ++ ;
    n -= fullsize ;
    fullsize += 4 ;
  }
  if ( level ( n , x , y ) <= numfull ) return 1.0 ;
  if ( n == 0 ) return 0.0 ;
  if ( level ( n , x , y ) != numfull + 1 || x == 0 ) return 0.0 ;
  fullsize -- ;
  final int half = fullsize / 2 ;
  final int want = y + 1 ;
  final double [ ] [ ] dp = new double [ half + 1 ] [ half ] ;
  dp [ 0 ] [ 0 ] = 1.0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int oi = i % 2 ;
    final int ni = 1 - oi ;
    dp [ ni ] = new double [ i ] ;
    dp [ ni ] [ 0 ] = 0.0 ;
    for ( int on = 0 ;
    on < half ;
    on ++ ) {
      final int off = i - on ;
      if ( on == half ) dp [ ni ] [ on ] += dp [ oi ] [ on ] ;
      else if ( off == half ) dp [ ni ] [ on + 1 ] += dp [ oi ] [ on ] ;
      else {
        dp [ ni ] [ on ] += dp [ oi ] [ on ] / 2 ;
        dp [ ni ] [ on + 1 ] += dp [ oi ] [ on ] / 2 ;
      }
    }
  }
  double res = 0.0 ;
  for ( int on : xrange ( half + 1 ) ) {
    if ( on >= want ) res += dp [ n % 2 ] [ on ] ;
  }
  return res ;
}
