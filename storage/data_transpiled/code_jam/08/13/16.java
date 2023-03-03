static final void setOut ( PrintStream out ) {
  final int pos = 0 ;
  psyco . full ( ) ;
  class EOF extends Exception {
  }
  class CodeJam extends Exception {
  }
  public CodeJam ( String file , boolean debug ) {
    if ( file == null ) {
      if ( args . length > 0 ) file = args [ 0 ] ;
      else throw new IllegalArgumentException ( "You MUST specify one input file" ) ;
    }
  }
  {
    _debug = debug ;
    _file = new FileReader ( file ) ;
    _out = new PrintStream ( file + ".out" ) ;
    currentCase = - 1 ;
    pos = 0 ;
  }
  public List < String > getLines ( int count ) {
    try {
      List < String > value = new ArrayList < String > ( xrange ( count ) ) ;
      for ( int i = 0 ;
      i < xrange ( count ) ;
      i ++ ) value . add ( _file . next ( ) . substring ( 0 , - 1 ) ) ;
      debug ( "Getting " + count + " line(s)" ) ;
    }
    catch ( IOException e ) {
      throw new EOF ( "End of file" ) ;
    }
    pos ++ ;
    return value ;
  }
  public int getInt ( ) {
    try {
      int value = Integer . parseInt ( _file . next ( ) ) ;
      int pos = 1 ;
      debug ( "Getting int: " + value ) ;
      return value ;
    }
    catch ( IOException e ) {
      throw new EOF ( "End of file" ) ;
    }
  }
  public void writeCase ( String text , String tpl ) {
    assert currentCase > - 1 : String . format ( tpl , currentCase + 1 , text ) ;
    out . println ( text ) ;
    debug ( "Writing " + text + " into output file" ) ;
  }
  public void debug ( String text ) {
    if ( _debug ) {
      System . out . println ( text ) ;
    }
  }
  public List < String > getCases ( ) {
    for ( int i = xrange ( count ) ;
    i < xrange ( pos ) ;
    i ++ ) {
      StringBuilder sb = new StringBuilder ( ) ;
      sb . append ( text ) ;
      sb . append ( "\n" ) ;
      sb . append ( "\n" ) ;
      sb . append ( "\n" ) ;
    }
  }
}
