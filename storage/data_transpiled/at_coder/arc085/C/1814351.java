@ VisibleForTesting static final LinkedHashMap < Integer , Integer > Dinic = new LinkedHashMap < Integer , Integer > ( ) {
  private static final long serialVersionUID = - 574370526379253939L ;
  {
    this . n = n ;
    this . links = new ArrayList < int [ ] [ ] > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      this . links [ i ] = new ArrayList < int [ ] > ( ) ;
    }
    this . depth = null ;
    this . progress = null ;
  }
  @ Override protected void addLink ( int _from , int to , int cap ) {
    this . links [ _from ] [ 0 ] = new int [ cap ] ;
    this . links [ to ] [ 0 ] = new int [ cap ] ;
    this . links [ to ] [ 0 ] = new int [ cap ] ;
    this . progress = null ;
  }
  @ Override protected void bfs ( int s ) {
    int [ ] depth = new int [ n ] ;
    Arrays . fill ( depth , - 1 ) ;
    depth [ s ] = 0 ;
    Queue < Integer > q = new LinkedList < Integer > ( ) ;
    q . add ( s ) ;
    while ( q . size ( ) > 0 ) {
      int v = q . poll ( ) ;
      for ( int cap = 0 ;
      cap < this . links [ v ] . length ;
      cap ++ ) {
        int to = links [ v ] [ 0 ] ;
        int rev = links [ v ] [ 1 ] ;
        if ( cap > 0 && depth [ to ] < 0 ) {
          depth [ to ] = depth [ v ] + 1 ;
          q . add ( to ) ;
        }
      }
    }
    this . depth = depth ;
  }
  @ Override protected int dfs ( int v , int t , int flow ) {
    if ( v == t ) return flow ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int [ ] link = links [ v ] ;
      if ( i < progress [ v ] ) continue ;
      progress [ v ] = i ;
      int cap = link [ 0 ] ;
      int to = link [ 1 ] ;
      int rev = link [ 2 ] ;
      if ( cap == 0 || depth [ v ] >= depth [ to ] ) continue ;
      int d = dfs ( to , t , Math . min ( flow , cap ) ) ;
      if ( d == 0 ) continue ;
      link [ 0 ] -= d ;
      this . links [ to ] [ rev ] [ 0 ] += d