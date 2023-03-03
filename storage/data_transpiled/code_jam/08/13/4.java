static final Map < String , Class < ? >> _TYPE = new HashMap < String , Class < ? >> ( ) {
  {
    put ( "d" , Integer . class ) ;
    put ( "l" , Long . class ) ;
    put ( "f" , Float . class ) ;
    put ( "s" , String . class ) ;
  }
  final List < String > _buffer = new ArrayList < String > ( ) ;
  @ Override public String nextToken ( ) {
    if ( _buffer . isEmpty ( ) ) {
      String line = System . getProperty ( "line.separator" ) ;
      _buffer . addAll ( Arrays . asList ( line . split ( " " ) ) ) ;
    }
    return _buffer . remove ( 0 ) ;
  }
  @ Override public String format ( String format ) {
    if ( format . length ( ) % 2 != 0 ) {
      throw new IllegalArgumentException ( ) ;
    }
    for ( int i = xrange ( 0 , format . length ( ) , 2 ) ;
    i < xrange ( 1 , format . length ( ) , 2 ) ;
    i ++ ) {
      if ( format . charAt ( i ) != '%' ) {
        throw new IllegalArgumentException ( ) ;
      }
      if ( ! "dfs" . equals ( format . charAt ( i + 1 ) ) ) {
        throw new IllegalArgumentException ( ) ;
      }
    }
    final List < String > result = new ArrayList < String > ( ) ;
    for ( int i = xrange ( 1 , format . length ( ) , 2 ) ;
    i < xrange ( 2 , format . length ( ) , 2 ) ;
    i ++ ) {
      final String token = getNextToken ( ) ;
      final String value = _TYPE . get ( format . charAt ( i ) ) . cast ( token ) ;
      result . add ( value ) ;
    }
    return tuple ( result ) ;
  }
  @ Override public int printf ( String format , Object ... args ) {
    final String message = String . format ( format , args ) ;
    System . out . print ( message ) ;
    return message . length ( ) ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
}
