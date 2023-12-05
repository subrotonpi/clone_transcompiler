@ SafeVarargs public static < T > String print ( T ... input ) {
  List < T > S = Arrays . asList ( input ) ;
  List < String > ans = new ArrayList < > ( ) ;
  ans . add ( String . valueOf ( S . size ( ) ) ) ;
  return ans ;
}
