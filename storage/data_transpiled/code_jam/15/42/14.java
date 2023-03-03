public static int tests = Integer . parseInt ( input ) {
  final double EPS = 1e-12 ;
  for ( int t = 1 ;
  t <= tests ;
  t ++ ) {
    String [ ] s = input . split ( " " ) ;
    int n = Integer . parseInt ( s [ 0 ] ) ;
    final double V = Double . parseDouble ( s [ 1 ] ) ;
    final double X = Double . parseDouble ( s [ 2 ] ) ;
    double [ ] r = new double [ n ] , c = new double [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      double ri = Double . parseDouble ( input . substring ( 0 , i ) ) ;
      double ci = Double . parseDouble ( input . substring ( i + 1 , i + 1 ) ) ;
      r [ i ] = ri ;
      c [ i ] = ci ;
    }
    return t == 0 ? 1 : ( 1 - t ) / n ;
  }
  private double take ( double [ ] a ) {
    double sumvx = 0. , sumv = 0. ;
    double remain = V ;
    for ( double x = 0 ;
    x < a . length ;
    x ++ ) {
      double v = a [ x ] ;
      double here = Math . min ( v , remain ) ;
      remain -= here ;
      sumvx += x * here ;
      sumv += here ;
    }
    return sumvx / sumv ;
  }
  private boolean can ( double time ) {
    double [ ] v = new double [ r . length ] ;
    for ( int ri = 0 ;
    ri < r . length ;
    ri ++ ) v [ ri ] = r [ ri ] * time ;
    if ( Math . abs ( v ) < V ) return false ;
    ArrayList < Double > a = new ArrayList < Double > ( Collections . nCopies ( c . length , v ) ) ;
    double tmin = take ( a ) ;
    double tmax = take ( a , 0 , a . length - 1 ) ;
    return tmin - EPS <= X && tmax + EPS ;
  }
  double left = 0. , right = 1e15 ;
  for ( int i = 0 ;
  i < 200 ;
  i ++ ) {
    double mid = ( left + right ) / 2 ;
    if ( can ( a ) ) right = mid ;
    else left = mid ;
  }
  boolean possible = any ( ci <= X && ci >= X ) ;
  if ( ! possible ) System . out . println ( "Case #" + t + ": IMPOSSIBLE" ) ;
  else System . out . println ( " Case ▁