static final private Map < String , Integer > _TYPE = new HashMap < String , Integer > ( ) {
  {
    put ( "d" , Integer . class ) ;
    put ( "l" , Long . class ) ;
    put ( "f" , Double . class ) ;
    put ( "s" , String . class ) ;
  }
  private final List < String > _buffer = new ArrayList < String > ( ) ;
  private String nextToken ( ) {
    if ( _buffer . isEmpty ( ) ) {
      String line = System . console ( ) . readLine ( ) ;
      _buffer . addAll ( line . split ( " " ) ) ;
    }
    return _buffer . remove ( 0 ) ;
  }
  private String scanf ( String format ) {
    if ( format . length ( ) % 2 != 0 ) throw new IllegalArgumentException ( ) ;
    for ( int i = xrange ( 0 , format . length ( ) , 2 ) ;
    i < xrange ( 1 , format . length ( ) , 2 ) ;
    i ++ ) {
      if ( format . charAt ( i ) != '%' ) throw new IllegalArgumentException ( ) ;
      if ( ! "dfs" . equals ( format . charAt ( i + 1 ) ) ) throw new IllegalArgumentException ( ) ;
    }
    List < String > result = new ArrayList < String > ( ) ;
    for ( int i = xrange ( 1 , format . length ( ) , 2 ) ;
    i < xrange ( 2 , format . length ( ) , 2 ) ;
    i ++ ) {
      String token = getNextToken ( ) ;
      String value = _TYPE . get ( format . charAt ( i ) ) . apply ( token ) ;
      result . add ( value ) ;
    }
    return result ;
  }
  private static int printf ( String format , Object ... args ) {
    String message = String . format ( format , args ) ;
    System . out . print ( message ) ;
    System . err . println ( message ) ;
    return message . length ( ) ;
  }
  @ SuppressWarnings ( "unchecked" ) public static List < Enumeration < String >> enumerations ( final int elements , final int length ) {
    return ( Enumeration < String > ) Enumeration . enumeration ( elements ) ;
  }
  public static List < Enumeration < String >> generateEnums ( ) {
    final List < Enumeration < String >> enums = new ArrayList < Enumeration < String >> ( ) ;
    Enumeration < String > e = e . elements ( ) ;
    int s = e . hasMoreElements ( ) ? e . nextElement ( ) : 0 ;
    Enumeration < String > perm = e . hasMoreElements ( ) ? e . nextElement ( ) :