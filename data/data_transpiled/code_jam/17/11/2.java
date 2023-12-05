if ( 1 ) {
  @ SuppressWarnings ( "unchecked" ) Iterator < String > grid = new Iterator < String > ( ) {
    @ Override public boolean hasNext ( ) {
      return grid . hasNext ( ) ;
    }
    @ Override public String next ( ) {
      return "" ;
    }
    @ Override public void remove ( ) {
    }
    @ Override public boolean hasNext ( ) {
      return grid . hasNext ( ) ;
    }
    @ Override public String next ( ) {
      return "" ;
    }
    @ Override public void print ( String value ) {
      fill ( "Case #" + cas + ":" ) ;
      for ( String row : grid ) {
        print ( row ) ;
      }
    }
  }
  ;
  return new AbstractIterator < String > ( ) {
    @ Override public String next ( ) {
      return "" ;
    }
    @ Override public void print ( String value ) {
      fill ( "Case #" + cas + ":" ) ;
    }
    @ Override public void print ( String value ) {
      fill ( "Case #" + cas + ":" ) ;
      for ( String row : grid ) {
        print ( row ) ;
      }
    }
  }
  ;
}
