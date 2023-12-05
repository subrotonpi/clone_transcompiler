static final String read ( ) {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final String [ ] readStrArray = br . readLine ( ) . split ( " " ) ;
  final String [ ] readIntArray = ArrayUtil . toArray ( readStrArray , new String [ 0 ] ) ;
  if ( getClass ( ) . equals ( String . class ) ) {
    for ( int i = 1 ;
    i <= Integer . MAX_VALUE ;
    i ++ ) {
      final int n = Integer . parseInt ( br . readLine ( ) ) ;
      final int [ ] v1 = readIntArray ( ) ;
      final int [ ] v2 = readIntArray ( ) ;
      Arrays . sort ( v1 ) ;
      Arrays . sort ( v2 ) ;
      Arrays . reverse ( v2 ) ;
      final int prod = v1 . length * v2 . length ;
      System . out . println ( "Case #" + i + ": " + prod ) ;
    }
  }
  return null ;
}
