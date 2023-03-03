@ GwtIncompatible ( "java.io.BufferedReader" ) public static void main ( final String strLine ) throws IOException {
  final int [ ] ints = strLine . split ( "\\s+" ) ;
  final int [ ] strings = strLine . split ( "\\s+" ) ;
  final float [ ] floats = strLine . split ( "\\s+" ) ;
  final String rsBufferedReader = new String ( readLine ( ) ) ;
  main ( strings ) ;
  final int cCase = Integer . parseInt ( rsBufferedReader . readLine ( ) ) ;
  for ( int iCase = 0 ;
  iCase <= cCase ;
  ++ iCase ) {
    final int [ ] digits = ArrayUtil . fromStrings ( readLine ( ) . split ( "\\s+" ) ) ;
    if ( digits . length == 1 ) {
      System . out . println ( "Case #" + ( iCase + 1 ) + ": " + ( digits [ 0 ] * 10 ) ) ;
      continue ;
    }
    Arrays . reverse ( digits ) ;
    final HashMap < Integer , String > h = new HashMap < Integer , String > ( ) ;
    for ( int i : xrange ( 0 , digits . length - 1 ) ) {
      if ( digits [ i + 1 ] >= digits [ i ] ) {
        h . put ( digits [ i ] , digits [ i ] ++ ) ;
      }
      else {
        h . put ( digits [ i ] , digits [ i ] ++ ) ;
        break ;
      }
    }
    else {
      h . put ( digits [ i + 1 ] , digits [ i ] ++ ) ;
      h . put ( 0 , digits [ i ] ++ ) ;
      String st = "" ;
      final String m = Integer . toString ( Math . min ( Splitter . on ( "," ) . splitValues ( digits [ i ] ) , Integer . MAX_VALUE ) ) ;
      st += m ;
      h . put ( Integer . parseInt ( m ) , -- digits [ i ] ) ;
      if ( h . get ( Integer . parseInt ( m ) ) == 0 ) {
        -- h . remove ( Integer . parseInt ( m ) ) ;
      }
      for ( int c : new ArrayList < Integer > ( h ) ) {
        for ( int q : xrange ( 0 , h . get ( c ) ) ) {
          st += c ;
        }
      }
      System . out . println ( "Case #" + ( iCase + 1 ) + ": " + st ) ;
      stdout . flush ( ) ;
      continue ;
    }
    ++ i ;
    final int k = Math . min ( Splitter . on (