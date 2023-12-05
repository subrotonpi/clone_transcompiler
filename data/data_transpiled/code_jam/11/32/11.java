public static final int getCase ( String args [ ] ) throws IOException {
  BufferedReader is = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int numCases = Integer . parseInt ( is . readLine ( ) ) ;
  for ( int i = 0 ;
  i <= numCases ;
  i ++ ) {
    String [ ] words = is . readLine ( ) . split ( " " ) ;
    int L = Integer . parseInt ( words [ 0 ] ) , t = Integer . parseInt ( words [ 1 ] ) , N = Integer . parseInt ( words [ 2 ] ) , C = Integer . parseInt ( words [ 3 ] ) ;
    String [ ] aI = words . split ( " " ) ;
    Arrays . sort ( aI ) ;
    int [ ] path = new int [ N ] ;
    int k = 0 ;
    for ( int j = 0 ;
    j <= N ;
    j ++ ) {
      path [ j ] = 2 * aI [ k ] ;
      k = ( k + 1 ) % C ;
    }
    int [ ] pathOpt = path . clone ( ) ;
    for ( int j = 0 ;
    j <= N ;
    j ++ ) {
      if ( t >= pathOpt [ j ] ) {
        pathOpt [ j ] = 0 ;
        t -= path [ j ] ;
      }
      else {
        pathOpt [ j ] -= t ;
        path [ j ] = t ;
        path = Arrays . copyOf ( path , j + 1 ) ;
        pathOpt = Arrays . copyOf ( pathOpt , j ) ;
        break ;
      }
    }
    Arrays . sort ( pathOpt ) ;
    int [ ] speedup = null ;
    if ( L > pathOpt . length ) {
      speedup = pathOpt ;
      pathOpt = new int [ L ] ;
    }
    else {
      speedup = Arrays . copyOf ( pathOpt , pathOpt . length - L ) ;
      pathOpt = Arrays . copyOf ( pathOpt , pathOpt . length - L ) ;
    }
    int ans = 0 ;
    for ( int p : path ) ans += p ;
    for ( int p : pathOpt ) ans += p ;
    for ( int p : speedup ) ans += p / 2.0 ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ( int ) ans ) ;
  }
  return numCases ;
}
