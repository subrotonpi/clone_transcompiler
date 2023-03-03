static final Map < String , Integer > _TYPE = new HashMap < String , Integer > ( ) {
  {
    put ( "d" , Integer . class ) ;
    put ( "l" , Long . class ) ;
    put ( "f" , Float . class ) ;
    put ( "s" , String . class ) ;
  }
  private final List < String > _buffer = new ArrayList < String > ( ) ;
  private String nextToken ( ) {
    if ( _buffer . isEmpty ( ) ) {
      String line = System . getProperty ( "line.separator" ) ;
      _buffer . addAll ( Arrays . asList ( line . split ( " " ) ) ) ;
    }
    return _buffer . remove ( 0 ) ;
  }
  private int [ ] scanf ( String format ) {
    if ( format . length ( ) % 2 != 0 ) throw new IllegalArgumentException ( ) ;
    for ( int i : xrange ( 0 , format . length ( ) , 2 ) ) {
      if ( format . charAt ( i ) != '%' ) throw new IllegalArgumentException ( ) ;
      if ( ! "dfs" . equals ( format . charAt ( i + 1 ) ) ) throw new IllegalArgumentException ( ) ;
    }
    List < Integer > result = new ArrayList < Integer > ( ) ;
    for ( int i : xrange ( 1 , format . length ( ) , 2 ) ) {
      String token = getNextToken ( ) ;
      Integer value = _TYPE . get ( format . charAt ( i ) ) . apply ( token ) ;
      result . add ( value ) ;
    }
    return result . toArray ( new Integer [ result . size ( ) ] ) ;
  }
  private static int printf ( String format , Object ... args ) {
    String message = String . format ( format , args ) ;
    System . out . print ( message ) ;
    return message . length ( ) ;
  }
  private static int solve ( ) {
    int numMilkshakes = scanf ( "%d" ) ;
    int numCustomers = scanf ( "%d" ) ;
    List < Customer > customers = new ArrayList < Customer > ( ) ;
    for ( int i = xrange ( numCustomers ) ;
    i < numMilkshakes ;
    i ++ ) {
      int numFlavors = scanf ( "%d" ) ;
      Customer customer = new Customer ( null , new ArrayList < String > ( ) ) ;
      for ( int j = xrange ( numFlavors ) ;
      j < numFlavors ;
      j ++ ) {
        int flavor = scanf ( "%d" , j ) ;
        int melted = scanf ( "%d" )