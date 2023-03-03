static final Map < String , Class < ? >> _TYPE = new HashMap < String , Class < ? >> ( ) {
  {
    put ( "d" , Integer . class ) ;
    put ( "l" , Long . class ) ;
    put ( "f" , Float . class ) ;
    put ( "s" , String . class ) ;
  }
  final List < String > _buffer = new ArrayList < String > ( ) ;
  {
    final StringTokenizer st = new StringTokenizer ( System . in ) ;
    private String nextToken ( ) {
      if ( _buffer . isEmpty ( ) ) {
        final String line = System . getProperty ( "line.separator" ) ;
        _buffer . addAll ( Arrays . asList ( line . split ( " " ) ) ) ;
      }
      return st . nextToken ( ) ;
    }
  }
  ;
  private int indexOf ( String format ) {
    if ( format . length ( ) % 2 != 0 ) {
      throw new IllegalArgumentException ( ) ;
    }
    for ( int i : xrange ( 0 , format . length ( ) , 2 ) ) {
      if ( format . charAt ( i ) != '%' ) {
        throw new IllegalArgumentException ( ) ;
      }
      if ( ! "dfs" . equals ( format . charAt ( i + 1 ) ) ) {
        throw new IllegalArgumentException ( ) ;
      }
    }
    final List < Integer > result = new ArrayList < Integer > ( ) ;
    for ( int i : xrange ( 1 , format . length ( ) , 2 ) ) {
      final String token = nextToken ( ) ;
      final Integer value = _TYPE . get ( format . charAt ( i ) ) . cast ( token ) ;
      result . add ( value ) ;
    }
    return result . size ( ) ;
  }
  private static int printf ( String format , Object ... args ) {
    final String message = String . format ( format , args ) ;
    System . out . print ( message ) ;
    return message . length ( ) ;
  }
  private static int solve ( ) {
    final int n = indexOf ( format ) ;
    final List < Integer > v1 = new ArrayList < Integer > ( n ) ;
    final List < Integer > v2 = new ArrayList < Integer > ( n ) ;
    Collections . sort ( v1 ) ;
    Collections . sort ( v2 ) ;
    final int msp = Math . pow ( v1 . size ( ) , v2 . size ( ) ) ;
    return msp ;
  }
  private static int num_cases = indexOf ( format , int case_num ) ;
  for ( int case_num : xrange ( num_cases ) ) {
    final int result = solve ( ) ;
    printf ( " Case ▁