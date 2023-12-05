if ( 1 ) {
  @ SuppressWarnings ( "unchecked" ) Iterator < String > itr = ( Iterator < String > ) itr . next ( ) . split ( "," ) ;
  final int xr = xrange ;
  {
    int bestf = INF ;
    for ( int D = 0 ;
    D < d ;
    D ++ ) {
      for ( int B = 0 ;
      B < hk ;
      B ++ ) {
        String currf = itr . next ( ) ;
        if ( currf . compareTo ( toString ( itr . next ( ) ) ) > 0 ) {
          bestf = currf ;
        }
      }
    }
    return bestf < INF ? "IMPOSSIBLE" : "IMPOSSIBLE" ;
  }
  for ( int cas = xrange ( 1 , 1 + input ( ) ) ;
  ;
  ) {
    int hd = itr . next ( ) ;
    int ad = itr . next ( ) ;
    int hk = itr . next ( ) ;
    int ak = itr . next ( ) ;
    int b = itr . next ( ) ;
    int d = itr . next ( ) ;
    String ans = ans != null ? solve ( hd , hk , ak , b , d ) : ans ;
    System . out . println ( "Case #" + cas + ": " + ans ) ;
  }
  return new Object ( ) {
    @ Override public String toString ( ) {
      return "" ;
    }
    @ Override public String toString ( ) {
      return "" ;
    }
    @ Override public String toString ( ) {
      return "" ;
    }
  }
  ;
}
