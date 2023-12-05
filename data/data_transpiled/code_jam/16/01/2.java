static final int [ ] getMath ( final int R , final Reader reader , final String fn ) {
  final int T = R ;
  final String in = fn + ".in" ;
  if ( fn == null ) {
    fn = fn + ".out" ;
  }
  final String out = devtools . build ( fn + ".out" ) ;
  final int N = R ;
  final Set < Integer > d = new HashSet < > ( 10 ) ;
  for ( int i = 1 ;
  i < 10001 ;
  i ++ ) {
    d . addAll ( Arrays . asList ( Integer . valueOf ( i * N ) ) ) ;
    if ( d . isEmpty ( ) ) {
      return i * N ;
    }
  }
  return "INSOMNIA" ;
}
