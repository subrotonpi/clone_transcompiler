@ SafeVarargs public static void main ( String ... args ) {
  long [ ] l = new long [ 2 * * 20 ] ;
  for ( final String s : args ) {
    long a = Long . parseLong ( s ) ;
    long b = Long . parseLong ( s ) ;
    l [ a ] ++ ;
    l [ b + 1 ] -- ;
  }
  System . out . println ( max ( cumsum ( l ) ) ) ;
}
