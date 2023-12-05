static final private class OutFile {
  private final PrintStream console = new PrintStream ( new OutputStream ( ) {
    private final File file ;
    private final PrintStream console = new PrintStream ( System . out ) ;
    @ Override public InputStream getInputStream ( ) throws IOException {
      return new FileInputStream ( file ) ;
    }
    @ Override public PrintStream getOutputStream ( ) throws IOException {
      return console ;
    }
    @ Override public PrintStream getOutputStream ( ) throws IOException {
      return console ;
    }
    @ Override public void write ( char [ ] x ) {
      console . print ( x ) ;
      file . write ( x ) ;
    }
  }
  class InFile {
    private final int readInt ;
    private final int [ ] getLineInt ;
    private final int [ ] getLineStr ;
    private final String nextLine ;
    @ Override public void write ( char [ ] x ) {
      console . print ( x ) ;
      file . write ( x ) ;
    }
  }
  class InFile {
    private final int readInt ;
    private final int [ ] getLineInt ;
    private final int [ ] getLineStr ;
    private final String nextLine ;
    @ Override public void close ( ) {
      nextLine = System . out ;
    }
    @ Override public void doAll ( String fileName ) {
      String fileName1 = fileName . substring ( 0 , fileName . lastIndexOf ( '.' ) ) + ".out" ;
      try {
        f1 = new InFile ( fileName ) ;
        try {
          f2 = new OutFile ( fileName1 ) ;
          for ( int i = xrange ( 1 , f1 . nextInt ( ) + 1 ) ;
          i < xrange ( 1 , f2 . nextInt ( ) + 1 ) ;
          i ++ ) {
            System . out . println ( "Case #" + i + ":" ) ;
            calculation ( f1 ) ;
          }
        }
        catch ( IOException e ) {
          e . printStackTrace ( ) ;
        }
      }
    }
    @ Override public void calculation ( InFile fIn ) {
      String string = fIn . getLineStr ( ) ;
      int n = Integer . parseInt ( string ) ;
      int count = 0 ;
      int before = 0 ;
      int total = 0 ;
      String vowel = "aeiou" ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( vowel . contains ( string . charAt ( i ) ) ) {
          count = 0 ;
          total += before ;
        }
        else {
          count ++ ;
          if ( count >= n ) {
            before = i - n + 2 ;
          }
          total += before ;
        }
      }
      System . out . println ( total ) ;
    }
  }
  if ( getClass ( ) . getName ( ) . equals ( "java.io.ConsolePrintStream" ) ) {
    doAll (