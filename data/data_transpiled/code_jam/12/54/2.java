static final String findCycle ( ) throws IOException {
  if ( __name__ == "__main__" ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) br = new BufferedReader ( new FileReader ( fn ) ) ;
    }
    int t = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _t = xrange ( t ) ;
    _t > 0 ;
    ) {
      int k = Integer . parseInt ( br . readLine ( ) ) ;
      assert k == 2 ;
      String s = br . readLine ( ) . trim ( ) ;
      Set < String > pairs = new HashSet < String > ( ) ;
      String mult = "oieastbg" ;
      for ( int i : xrange ( s . length ( ) - 1 ) ) pairs . add ( s . substring ( i , i + 2 ) ) ;
      _edges . clear ( ) ;
      _rev_edges . clear ( ) ;
      for ( String [ ] p : pairs ) {
        String c1 ;
        String c2 ;
        if ( mult . contains ( p [ 0 ] ) ) c1 = ( p [ 0 ] ) ;
        else c1 = ( p [ 0 ] ) ;
        String c2 ;
        if ( mult . contains ( p [ 1 ] ) ) c2 = ( p [ 1 ] ) ;
        else c2 = ( p [ 1 ] ) ;
        for ( String _c1 : c1 ) for ( String _c2 : c2 ) _edges . computeIfAbsent ( _c1 , new ArrayList < String > ( ) ) . add ( _c2 ) ;
        _rev_edges . computeIfAbsent ( _c2 , new ArrayList < String > ( ) ) . add ( _c1 ) ;
      }
    }
    return null ;
  }
  else {
    Map < Integer , String > paths = new HashMap < Integer , String > ( ) ;
    paths . put ( start , start ) ;
    Queue < Integer > queue = new LinkedList < Integer > ( ) ;
    while ( queue . size ( ) > 0 ) {
      int c = queue . poll ( ) ;
      if ( c < 0 ) continue ;
      for ( Integer next : edges . get ( c ) ) {
        if ( next == start ) return paths . get ( c ) ;
        if ( queue . isEmpty ( ) || paths . containsKey ( next ) ) continue ;
        paths . put ( next , paths . get ( c ) + next ) ;
        queue . add ( next ) ;
      }
    }
    return null ;
  }
}
