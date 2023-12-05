static double foo ( BufferedReader iReader ) throws IOException {
  final int X = Integer . parseInt ( iReader . readLine ( ) ) ;
  final int S = Integer . parseInt ( iReader . readLine ( ) ) ;
  final double R = Double . parseDouble ( iReader . readLine ( ) ) ;
  final double t = Double . parseDouble ( iReader . readLine ( ) ) ;
  final int N = iReader . read ( ) ;
  final int [ ] [ ] aa = new int [ N ] [ ] ;
  final HashMap < Integer , Double > bb = new HashMap < Integer , Double > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    aa [ i ] = Integer . parseInt ( iReader . readLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int [ ] a = aa [ i ] ;
    if ( ! bb . containsKey ( a [ 2 ] ) ) bb . put ( a [ 2 ] , 0 ) ;
    bb . put ( a [ 0 ] , t2 ) ;
  }
  double t2 = X - X ;
  final double res = 0.0 ;
  final TreeSet < Map . Entry < Integer , Double >> set = bb . entrySet ( ) ;
  for ( final Map . Entry < Integer , Double > e : set ) {
    final double v = e . getValue ( ) ;
    if ( ( R + e . getKey ( ) ) * t > v ) {
      res += v / ( R + e . getKey ( ) ) ;
      t -= v / ( R + e . getKey ( ) ) ;
    }
    else {
      t2 = v - ( R + e . getKey ( ) ) ;
    }
  }
  return res ;
}
