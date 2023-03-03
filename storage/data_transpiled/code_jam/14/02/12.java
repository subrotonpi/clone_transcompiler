static private String findsol ( double C , double F , double X ) throws IOException {
  final String s ;
  double t = 0.0 ;
  double tmax = X / 2 ;
  int N = 0 ;
  int jj ;
  double [ ] R ;
  String [ ] a ;
  String C ;
  String F ;
  double X ;
  double [ ] R ;
  double [ ] b ;
  /* Convert reals to doubles */
  a = new double [ s . length ( ) ] ;
  ii = 0 ;
  for ( jj = 0 ;
  jj < s . length ( ) ;
  jj ++ ) {
    if ( s . charAt ( jj ) == ' ' ) {
      if ( ( ii < jj ) && ( s . charAt ( ii ) == ' ' ) ) {
        a [ N ++ ] = Double . parseDouble ( s . substring ( ii , jj ) ) ;
        ii = jj + 1 ;
      }
    }
  }
  a [ N ] = Double . parseDouble ( s . substring ( ii , jj ) ) ;
  return a [ N ] ;
}
