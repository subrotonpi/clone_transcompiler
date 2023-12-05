static final Iterator < String > CASE_ITERATOR = new Iterator < String > ( ) {
  private BufferedReader reader = null ;
  private Iterator < String > lines ;
  private int n ;
  @ Override public boolean hasNext ( ) {
    return reader != null ;
  }
  @ Override public String next ( ) {
    try {
      reader = new BufferedReader ( new FileReader ( file ) ) ;
      lines = new LineIterator ( reader ) ;
      n = Integer . parseInt ( reader . readLine ( ) ) ;
      for ( int i = 1 ;
      i <= 1 + n ;
      i ++ ) {
        yield ( i , readCase ( reader ) ) ;
      }
    }
    catch ( IOException e ) {
      System . err . println ( "usage: java " + e . getMessage ( ) + " <input file>" ) ;
      System . exit ( 1 ) ;
    }
    return true ;
  }
  private String [ ] lineToStr ( String line ) {
    String [ ] ret = new String [ n ] ;
    for ( int i = 0 ;
    i < line . length ( ) ;
    i ++ ) {
      char c = line . charAt ( i ) ;
      if ( c == '.' ) ret [ i ] = null ;
      else ret [ i ] = Integer . parseInt ( line . substring ( i , i + 1 ) ) ;
    }
    return ret ;
  }
  private static String [ ] readCase ( String line ) {
    int n = Integer . parseInt ( line . substring ( 0 , line . indexOf ( '.' ) ) ) ;
    return new String [ ] {
      lineToStr ( line . substring ( line . indexOf ( '.' ) + 1 ) . trim ( ) ) }
      ;
    }
    private static double [ ] calcWPs ( String [ ] matrix ) {
      int n = matrix . length ;
      double [ ] wp = new double [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int numWw = Integer . parseInt ( matrix [ i ] ) ;
        int total = Integer . parseInt ( matrix [ i ] ) ;
        wp [ i ] = ( double ) numWw / total ;
      }
      return wp ;
    }
    private static String solve ( String testCase ) {
      String [ ] other ;
      int n = matrix . length ;
      double [ ] owp = new double [ n ] ;
      double [ ] oowp = new double [ n ] ;
      double [ ] rpi = new double [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        other = matrix [ i ] ;
      }
      return ow @ @