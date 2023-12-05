@ VisibleForTesting static Iterable < String > combinations ( ) throws IOException {
  final int [ ] facts = new int [ 1 ] ;
  for ( int i : xrange ( 1 , 100 ) ) {
    facts [ i ] = facts [ facts . length - 1 ] * i ;
  }
  return new Iterable < String > ( ) {
    @ Override public String get ( int n , int k ) {
      return facts [ n ] / facts [ k ] / facts [ n - k ] ;
    }
  }
  ;
}
