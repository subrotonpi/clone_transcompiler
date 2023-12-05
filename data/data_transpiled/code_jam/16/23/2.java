private static void solve ( ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  Map < String , Integer > df = new HashMap < String , Integer > ( ) , ds = new HashMap < String , Integer > ( ) ;
  Map < String , List < String >> ef = new ArrayList < String , List < String >> ( ) , es = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < xrange ( n ) ;
  i ++ ) {
    String f = readLine ( ) ;
    String s = readLine ( ) ;
    if ( ! df . containsKey ( f ) ) {
      int j = df . size ( ) ;
      df . put ( f , j ) ;
      ef . add ( new ArrayList < String > ( ) ) ;
    }
    if ( ! ds . containsKey ( s ) ) {
      int j = ds . size ( ) ;
      ds . put ( s , j ) ;
      es . add ( new ArrayList < String > ( ) ) ;
    }
    f = df . get ( f ) ;
    s = ds . get ( s ) ;
    ef . get ( f ) . add ( s ) ;
    es . get ( s ) . add ( f ) ;
  }
  int m = ef . size ( ) ;
  pairf = new int [ m ] ;
  pairs = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    done [ i ] = true ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < ef . get ( i ) ;
  i ++ ) {
    done [ i ] = true ;
    for ( String x : ef . get ( i ) ) {
      String w = pairs [ x ] ;
      if ( w == null || ( done [ w ] == null && dfs ( w ) ) ) {
        pairf . put ( x , i ) ;
        pairs [ x ] = i ;
        return 1 ;
      }
    }
  }
  res = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    done [ i ] = true ;
    res += dfs ( i ) ;
  }
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = 0 ;
  t < xrange ( T ) ;
  t ++ ) {
    System . out . println ( "Case #" + ( t + 1 ) + ":" + solve ( ) ) ;
  }
}
