public static int N = Integer . parseInt ( input ) {
  List < String > Sn = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Sn . add ( input . next ( ) ) ;
  }
  @ SuppressWarnings ( "unchecked" ) Counter < String > c = new Counter < > ( ) ;
  for ( String S : Sn ) {
    c . incrementCount ( S ) ;
  }
  int t = 0 ;
  String [ ] d = d ;
  @ SuppressWarnings ( "rawtypes" ) Enumeration combi = d . elements ( ) ;
  while ( combi . hasMoreElements ( ) ) {
    int v = 1 ;
    for ( String k : combi ) {
      v *= c . getCount ( k ) ;
    }
    t += v ;
  }
  return t ;
}
