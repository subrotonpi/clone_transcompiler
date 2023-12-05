static final private Map < String , Integer > _TYPE = new HashMap < String , Integer > ( ) {
  {
    put ( "d" , Integer . class ) ;
    put ( "l" , Long . class ) ;
    put ( "f" , Float . class ) ;
    put ( "s" , String . class ) ;
    final List < String > _buffer = new ArrayList < String > ( ) ;
    {
      if ( _buffer . isEmpty ( ) ) {
        final String line = System . console ( ) . readLine ( ) ;
        _buffer . addAll ( line . split ( " " ) ) ;
      }
    }
    int numCases = xrange ( numCases ) ;
    final List < Integer > result = solve ( ) ;
    printf ( "Case #%d: %s\n" , numCases + 1 , result ) ;
    return result ;
  }
  private int xrange ( String format ) {
    if ( format . length ( ) % 2 != 0 ) {
      throw new IllegalArgumentException ( ) ;
    }
    for ( int i = xrange ( 0 , format . length ( ) , 2 ) ;
    i < xrange ( 1 , format . length ( ) , 2 ) ;
    i ++ ) {
      final String token = getNextToken ( ) ;
      final Integer value = _TYPE . get ( format . charAt ( i ) ) . apply ( token ) ;
      result . add ( value ) ;
    }
    return Integer . valueOf ( result . size ( ) ) ;
  }
  private static int printf ( String format , Object ... args ) {
    final String message = String . format ( format , args ) ;
    System . out . print ( message ) ;
    System . err . println ( message ) ;
    return message . length ( ) ;
  }
  @ SuppressWarnings ( "unchecked" ) final List < Integer > enums = ( List < Integer > ) Arrays . asList ( ) ;
  final List < Integer > enum = new ArrayList < Integer > ( enums . size ( ) ) ;
  final List < Integer > enums = new ArrayList < Integer > ( enums . size ( ) ) ;
  final List < Integer > permutations = new ArrayList < Integer > ( enums . size ( ) ) ;
  for ( int i = 0 ;
  i < permutations . size ( ) ;
  i ++ ) {
    final int length = 0 ;
    int last = 0 ;
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      final int c = S . charAt ( j ) ;
      if ( c != last ) {
        last = c ;
        length ++ ;
      }
    }
  }
  return permutations . get ( 0 ) ;
}
