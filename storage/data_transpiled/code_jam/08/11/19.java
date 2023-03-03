static private void debug ( String ... msg ) throws IOException {
  final boolean DEBUG = ! DEBUG ;
  if ( DEBUG ) {
    for ( int i = 0 ;
    i < msg . length - 1 ;
    i ++ ) {
      System . out . println ( msg [ i ] ) ;
    }
    System . out . println ( msg [ msg . length - 1 ] ) ;
  }
  {
    final int n = Integer . parseInt ( System . console ( ) . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
    final int [ ] v = System . console ( ) . readLine ( ) . split ( " " ) ;
    Arrays . sort ( v ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      v [ i ] = Integer . parseInt ( v [ i ] ) ;
    }
  }
  {
    final int n = System . console ( ) . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
    final int [ ] x = new int [ n ] ;
    System . out . println ( x ) ;
    final int [ ] y = new int [ n ] ;
    System . out . println ( y ) ;
    Arrays . sort ( x ) ;
    Arrays . sort ( y ) ;
    Arrays . reverse ( x ) ;
    int s = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      s += x [ i ] * y [ i ] ;
    }
    printResult ( n , "" + s ) ;
  }
  {
    final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    final int n = in . read ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      doTestCase ( in , i + 1 ) ;
    }
    in . close ( ) ;
  }
  if ( className . equals ( "org.junit.runner.TestCase" ) ) {
    if ( args . length < 2 ) {
      System . err . println ( "usage: java org.junit.runner.TestCase <input>" ) ;
      System . exit ( 1 ) ;
    }
    Main . main ( args [ 0 ] ) ;
  }
}
