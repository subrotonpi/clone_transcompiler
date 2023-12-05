static final String solve ( int n , int k , double u , double [ ] ps ) {
  final int MOD = 10 * 9 + 7 ;
  final double INF = Double . POSITIVE_INFINITY ;
  if ( System . getSecurityManager ( ) == null ) {
    final ByteArrayOutputStream baos = new ByteArrayOutputStream ( ) ;
    final PrintStream ps = new PrintStream ( baos ) ;
    System . setSecurityManager ( new SecurityManager ( ) {
      @ Override public void checkExit ( int arg0 ) {
        System . out . println ( "enter #" + ( arg0 + 1 ) + ": " + ( arg0 + 1 ) ) ;
      }
    }
    ) ;
    System . setSecurityManager ( new SecurityManager ( ) {
      @ Override public void checkExit ( int arg0 ) {
        System . out . println ( "enter #" + arg0 + ": " + ( arg0 + 1 ) ) ;
      }
    }
    ) ;
    final PrintStream pr = new PrintStream ( baos ) ;
    final PrintStream epr = new PrintStream ( System . out ) ;
    final PrintStream die = new PrintStream ( System . err ) ;
    final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    final String readLine = in . readLine ( ) ;
    assert readLine != null ;
    pr . println ( readLine ) ;
    in . close ( ) ;
    final Scanner die = new Scanner ( System . in ) ;
    final String readLine = in . readLine ( ) ;
    assert readLine != null ;
    pr . println ( readLine ) ;
    in . close ( ) ;
    final Scanner epr = new Scanner ( System . in ) ;
    final double [ ] die = new double [ 1 ] ;
    System . err . println ( readLine ) ;
    final String readLine = in . readLine ( ) ;
    assert readLine != null ;
    int [ ] res = null ;
    Arrays . sort ( ps ) ;
    int curn = 1 ;
    double curp = ps [ 0 ] ;
    epr . println ( u ) ;
    for ( int i = 1 ;
    i < ps . length ;
    i ++ ) {
      if ( res == null ) {
        if ( u >= ( ps [ i ] - curp ) * curn ) {
          u -= ( ps [ i ] - curp ) * curn ;
          curp = ps [ i ] ;
          curn ++ ;
        }
        else {
          curp += u / curn ;
          res = new double [ i ] ;
          res [ i ] = curp ;
          res [ i ] = p ;
        }
      }
      else res [ i ] = p ;
    }
    epr . println ( cur ) ;
    in . close ( ) ;
    return res