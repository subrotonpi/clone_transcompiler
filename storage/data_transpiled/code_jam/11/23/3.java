static final Iterator < String > CASE_ITERATOR = new Iterator < String > ( ) {
  @ Override public String next ( String path ) {
    try ( BufferedReader br = new BufferedReader ( new FileReader ( path ) ) ) {
      Iterator < String > lines = br . lines ( ) ;
      int n = Integer . parseInt ( br . readLine ( ) ) ;
      for ( int i = 1 ;
      i <= 1 + n ;
      i ++ ) {
        yield ( i , readCase ( br ) ) ;
      }
    }
    catch ( IOException e ) {
      System . err . println ( "usage: " + e . getClass ( ) . getName ( ) + " <input file>" ) ;
      return null ;
    }
    StringBuilder ret = new StringBuilder ( ) ;
    for ( String c : line ) {
      if ( c . equals ( "." ) ) {
        ret . append ( null ) ;
      }
      else {
        ret . append ( Integer . toString ( c ) ) ;
      }
    }
    return ret . toString ( ) ;
  }
  @ Override public String next ( String path ) {
    int n , edges ;
    Set < Integer > rooms = new HashSet < Integer > ( ) ;
    for ( Integer i : rooms ) {
      rooms . add ( i ) ;
    }
    Integer found = null ;
    for ( Integer r : rooms ) {
      if ( colors . contains ( r ) ) {
        found = r ;
      }
    }
    assert found != null ;
    rooms . remove ( found ) ;
    Set < Integer > roomA = new HashSet < Integer > ( ) ;
    for ( Integer i : rooms ) {
      rooms . add ( i ) ;
    }
    Integer [ ] values = new Integer [ 2 ] ;
    for ( int i : rooms ) {
      values [ i ] = Integer . parseInt ( i ) ;
    }
    Integer max = 0 ;
    for ( Integer i : values ) {
      edges [ i ] = values [ i ] - 1 ;
    }
    max = 0 ;
    return n ;
  }
  private Set < Integer > choose ( Set < Integer > colors , Set < Integer > rooms ) {
    Integer minSatisfy = null ;
    Set < Integer > tosatisfy = new HashSet < Integer > ( ) ;
    for ( Integer i : rooms ) {
      Integer numTosatisfy = Integer . parseInt ( i ) ;
      if ( colors . contains ( colors . get ( i ) ) ) {
        tosatisfy . add ( i ) ;
      }
    }
    Integer toColor = max ( 0 , numTosatisfy - roomA . size ( ) ) ;
    for ( final Integer i : tosatisfy ) {
      Integer node = i ;
      if ( colors