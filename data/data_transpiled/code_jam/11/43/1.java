@ VisibleForTesting static synchronized void go ( ) {
  final Class < ? > gcj = Class . forName ( "gcj" ) ;
  final InputStream IN = gcj . getResourceAsStream ( "primes.txt" ) ;
  final StringBuffer buf = new StringBuffer ( ) ;
  int curCase = 0 ;
  @ VisibleForTesting static int id ( int x ) {
    return x ;
  }
  @ VisibleForTesting static String readLine ( ) {
    String res ;
    int n = gcj . token ( Integer . MIN_VALUE ) ;
    for ( ;
    n > 0 ;
    ) {
      int t = xrange ( t ) ;
      int n = gcj . token ( Integer . MAX_VALUE ) ;
      System . out . println ( gcj . case ( ) + ": " + solve ( n , primes ) ) ;
    }
    return res ;
  }
  @ VisibleForTesting static String readLine ( ) {
    String line = readLine ( ) ;
    return conv ( line . replaceAll ( "\n" , "" ) ) ;
  }
  @ Override static String [ ] splitLine ( ) {
    String line = readLine ( ) ;
    return Arrays . asList ( line . split ( " " ) ) ;
  }
  @ Override public String [ ] tokens ( ) {
    String line = null ;
    while ( line == null ) line = readLine ( ) . intern ( ) ;
    buf . setLength ( 0 ) ;
    return line . split ( " " ) ;
  }
  @ Override public String token ( ) {
    return "" ;
  }
  @ Override public int token ( String token ) {
    return token ;
  }
  @ Override public int tokens ( int cnt , String conv ) {
    return xrange ( cnt , conv ) ;
  }
  @ Override public String toString ( ) {
    return "Case #" + curCase + ":" ;
  }
}
