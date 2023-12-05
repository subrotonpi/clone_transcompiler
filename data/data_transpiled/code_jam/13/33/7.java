static final String print = System . getProperty ( "java.io.PrintStream" ) ;
class OutFile implements PrintStream {
  private final String fileName ;
  private final PrintStream console ;
  private final String fileName ;
  private PrintStream subpath ;
  private final String fileName ;
  private PrintStream end ;
  public PrintStream getOut ( String fileName ) {
    this . fileName = fileName ;
    this . console = System . out ;
  }
  public PrintStream entering ( String ... argv ) {
    System . out = this ;
    return this ;
  }
  public PrintStream entering ( String arg0 ) {
    System . out = this ;
    return this ;
  }
  public PrintStream nextOut ( ) {
    System . out = this ;
    return this ;
  }
  public PrintStream nextOut ( ) {
    System . out = this ;
    return this ;
  }
  public PrintStream print ( String arg0 ) {
    System . out . println ( arg0 ) ;
    return this ;
  }
  public PrintStream nextOut ( ) {
    System . out = this ;
    return this ;
  }
  public int getInt ( ) {
    return Integer . parseInt ( arg0 ) ;
  }
  public int [ ] getLineInt ( ) {
    return ArrayUtil . toInt ( arg0 ) ;
  }
  public String getLineStr ( ) {
    return fileName ;
  }
  public PrintStream nextOut ( ) {
    return System . out ;
  }
  public PrintStream doAll ( String fileName ) {
    String fileName1 = fileName . substring ( 0 , fileName . lastIndexOf ( "." ) ) + ".out" ;
    try {
      InFile f1 = new InFile ( fileName ) ;
      try {
        OutFile f2 = new OutFile ( fileName1 ) ;
        for ( int i : xrange ( 1 , f1 . nextInt ( ) + 1 ) ) {
          System . out . println ( "Case #" + i + ":" ) ;
          calculation ( f1 ) ;
        }
      }
      catch ( Exception e ) {
        e . printStackTrace ( ) ;
      }
      return null ;
    }
  }
  public int count ( int x , int y ) {
    int i = 1 ;
    int c = 0 ;
    int [ ] L = new int [ 2 ] ;
    L [ 0 ] = abs ( y ) ;
    L [ 1 ] = abs ( x ) ;
    while ( L . length > 0 ) {
      if ( L [ L . length - 1 ] >= i ) {
        L [ L . length - 1 ] -= i ;
        c ++ ;
        i ++ ;
      }
      else {
        i += L [ L . length - 1 ] * 2 ;
        c += L [ L . length - 1 ] * 2 ;
      }
    }
    return c ;
  }
  public PrintStream calculation ( PrintStream fIn ) {
    int X = fIn . getLineInt ( ) ;
    