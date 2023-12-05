static final void main ( String [ ] args ) throws IOException {
  if ( args . length == 0 ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int t = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _t = xrange ( t ) ;
    _t < t ;
    ++ _t ) {
      int M = Integer . parseInt ( br . readLine ( ) ) ;
      int F = Integer . parseInt ( br . readLine ( ) ) ;
      int N = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] foods = new int [ N ] ;
      for ( int i = xrange ( N ) ;
      i < foods . length ;
      ++ i ) foods [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
      Arrays . sort ( foods ) ;
      int best = 0 ;
      for ( int norders = xrange ( 1 , M / F + 1 ) ;
      norders < M ;
      ++ norders ) {
        int meals = 0 ;
        int money = M - norders * F ;
        for ( int p = 0 ;
        p < foods . length ;
        ++ p ) {
          int s = foods [ p ] ;
          if ( p > money ) break ;
          int canBuy = Math . min ( norders * ( s + 1 ) - meals , money / p ) ;
          if ( canBuy >= 0 ) {
            meals += canBuy ;
            money -= p * canBuy ;
          }
        }
        best = Math . max ( meals , best ) ;
      }
      System . out . println ( "Case #" + ( _t + 1 ) + ": " + best ) ;
    }
  }
}
