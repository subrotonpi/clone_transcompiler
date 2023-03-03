static final String NAME = null ;
{
  /* OK */
  double prev = 0 ;
  for ( int i = 0 ;
  i < points . length ;
  i ++ ) {
    double x = points [ i ] [ 0 ] , cnt = points [ i ] [ 1 ] ;
    double minX = x - time ;
    if ( prev != 0 ) minX = Math . max ( minX , prev + D ) ;
    double next = minX + D * ( cnt - 1 ) ;
    if ( Math . abs ( x - next ) > time ) return false ;
    prev = next ;
  }
  /* get magic word */
  int numPoints = nextToken ( int . class ) ;
  int D = nextToken ( int . class ) * 2 ;
  Point [ ] p = new Point [ numPoints ] ;
  int pMin = 1000000 ;
  int pMax = - pMin ;
  int n = 0 ;
  for ( int i = 0 ;
  i < numPoints ;
  i ++ ) {
    double x = nextToken ( int . class ) * 2 ;
    int cnt = nextToken ( int . class ) ;
    p [ n ++ ] = new Point ( x , cnt ) ;
  }
  Arrays . sort ( p , new Comparator < Point > ( ) {
    int i = 0 ;
    public int compare ( Point o1 , Point o2 ) {
      return o1 . x - o2 . x ;
    }
  }
  ) ;
  int L = - 1 , R = 10 * 14 ;
  while ( R - L > 1 ) {
    int K = ( L + R ) / 2 ;
    if ( ok ( p , K , D ) ) R = K ;
    else L = K ;
  }
  /* Return the first line in the points */
  String res = "" ;
  while ( fin . ready ( ) ) {
    char c = ( char ) fin . read ( ) ;
    if ( Character . isWhitespace ( c ) ) break ;
    res += c ;
  }
  if ( func != null ) {
    /* Return the first line in the points */
    if ( res . length ( ) > 0 ) {
      /* Return the first line in the points */
      return res ;
    }
  }
  /* Return the first line out in the points */
  if ( NAME != null ) {
    BufferedReader in = new BufferedReader ( new FileReader ( NAME + ".in" ) ) , fout = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  }
  else {
    in = System . in ,