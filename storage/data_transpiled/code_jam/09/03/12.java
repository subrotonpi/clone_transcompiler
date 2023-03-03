private static final Map < String , Integer > table = new HashMap < String , Integer > ( ) {
  private static final long serialVersionUID = - 5743705263738203615L ;
  {
    if ( t == null ) return 1 ;
    String k = s , t = t ;
    if ( table . containsKey ( k ) ) return table . get ( k ) ;
    long r = 0 ;
    for ( int i : xrange ( s . length ( ) ) ) {
      if ( s . charAt ( i ) == t . charAt ( 0 ) ) r += count ( s . substring ( i + 1 ) , t . substring ( 1 ) ) ;
    }
    r = r % 10000 ;
    table . put ( k , r ) ;
    return r ;
  }
}
