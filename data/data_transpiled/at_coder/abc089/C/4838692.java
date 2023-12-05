@ VisibleForTesting static Iterable < String > combinations ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < String > S = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S . add ( input . nextLine ( ) ) ;
  }
  final Map < Character , Integer > firstChars = new HashMap < > ( ) ;
  for ( final String s : S ) {
    if ( s . length ( ) > 0 ) {
      firstChars . put ( s , s ) ;
    }
  }
  return combs ;
}
