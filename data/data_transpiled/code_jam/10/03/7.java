@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static < T > T [ ] solve ( final T [ ] args ) {
  final GCJ gcj = new GCJ ( ) ;
  final InputStream IN = new InputStream ( System . in ) ;
  int number = 0 ;
  @ SuppressWarnings ( "resource" ) final T [ ] line = new int [ args . length ] ;
  int number = 0 ;
  @ SuppressWarnings ( "resource" ) final T [ ] line = new int [ args . length ] ;
  for ( int i = 0 ;
  i < args . length ;
  i ++ ) line [ i ] = IN . read ( ) ;
  return Arrays . copyOf ( line , number ) ;
  @ SuppressWarnings ( "resource" ) final T [ ] line = new int [ args . length ] ;
  for ( int i = 0 ;
  i < args . length ;
  i ++ ) line [ i ] = IN . read ( ) ;
  return line ;
}
