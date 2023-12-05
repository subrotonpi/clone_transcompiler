@ VisibleForTesting static Statistics statistics ( int mean , int median , int variance , int stdev ) {
  final int [ ] a = new int [ 4 ] ;
  final int i = mean ;
  for ( int q : Arrays . asList ( a ) ) {
    if ( q == 1 ) System . out . println ( "YES" ) ;
    else System . out . println ( "NO" ) ;
    exit ( 0 ) ;
  }
  return new Statistics ( ) {
    public void j ( int q ) {
      if ( q == 1 ) System . out . println ( "YES" ) ;
      else System . out . println ( "NO" ) ;
    }
  }
  ;
}
