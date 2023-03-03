static final int P = 1000002013 ;
if ( __name__ . equals ( "__main__" ) ) {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  if ( args . length >= 2 ) {
    String fn = args [ 1 ] ;
    if ( fn != null ) {
      br = new BufferedReader ( new FileReader ( fn ) ) ;
    }
  }
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int _T = xrange ( T ) ;
  _T < T ;
  _T ++ ) {
    int N = Integer . parseInt ( br . readLine ( ) ) ;
    int M = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] [ ] peep = new int [ N ] [ M ] ;
    Set < Stop > stops = new HashSet < Stop > ( ) ;
    for ( int i = xrange ( M ) ;
    i < N ;
    i ++ ) {
      peep [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
      stops . add ( peep [ i ] [ 0 ] ) ;
      stops . add ( peep [ i ] [ 1 ] ) ;
    }
    assert Arrays . equals ( peep , peep ) ;
    stops = Collections . unmodifiableSet ( stops ) ;
    Arrays . sort ( stops ) ;
    int loss = 0 ;
    int totalLoss = 0 ;
    Map < Stop , Stop > tickets = new HashMap < Stop , Stop > ( ) ;
    {
      int p = 0 ;
      int l = 0 ;
      for ( Map . Entry < Stop , Stop > e : tickets . entrySet ( ) ) {
        Stop x = Math . min ( e . getValue ( ) , p ) ;
        t += ( l - e . getKey ( ) ) * x ;
        p -= x ;
        tickets . put ( e . getKey ( ) , x ) ;
        if ( tickets . get ( e . getKey ( ) ) == null ) {
          tickets . remove ( e . getKey ( ) ) ;
        }
        if ( p == 0 ) break ;
      }
      return t ;
    }
    int prev = 0 ;
    for ( Stop s : stops ) {
      totalLoss += ( s - prev ) * loss ;
      tickets . clear ( ) ;
      tickets . put ( s + ( s - prev ) , tickets . get ( 0 ) ) ;
      for ( int o = 0 ;
      o < peep . length ;
      o ++ ) {
        if ( peep [ o ] == p ) {
          tickets . put ( 0 , tickets . get ( 0 ) + p ) ;
        }
      }
      for ( int o