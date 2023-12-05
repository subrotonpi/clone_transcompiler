static final void setIn ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  {
    final int li = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int li_ = Integer . parseInt ( stdin . readLine ( ) ) - 1 ;
    final float lf = Float . parseFloat ( stdin . readLine ( ) ) ;
    final int ls = stdin . read ( ) ;
    final String ns = stdin . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
    final int lc = list ( ns ) ;
    final int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
    final int nf = Float . parseFloat ( stdin . readLine ( ) ) ;
    final int n = li ;
    final int m = li ;
    final int [ ] a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) a [ i ] = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) a [ i ] = ni ++ ;
    final int [ ] pat = new int [ n + 1 ] ;
    pat [ 1 ] = 1 ;
    final int [ ] pat_cum = new int [ n + 1 ] ;
    pat_cum [ 0 ] = 0 ;
    pat_cum [ 1 ] = 1 ;
    final int MOD = 10 * 9 + 7 ;
    int left = 0 ;
    final Set < Integer > sup = new HashSet < Integer > ( ) ;
    sup . add ( a [ 1 ] ) ;
    for ( int i = 2 ;
    i < a . length ;
    i ++ ) {
      final int ai = a [ i ] ;
      final int j = i + 2 ;
      if ( ! sup . contains ( ai ) ) sup . add ( ai ) ;
      else {
        int idx = left + 1 ;
        while ( a [ idx ] != ai ) sup . remove ( a [ idx ] ) ;
        idx ++ ;
        left = idx ;
      }
      pat [ j ] = pat_cum [ j - 1 ] - ( left == 0 ? - 1 : pat_cum [ left - 1 ] ) ;
      pat [ j ] %= MOD ;
      pat_cum [ j ] = pat_cum [ j - 1 ] + pat [ j ] ;
      pat_cum [ j ] %= MOD ;
    }
    System . out . println ( pat [ n ] ) ;
  }
}
