static final String getExample ( ) {
  final BufferedReader ssr = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final BufferedWriter ssw = new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ;
  final String rdline = ssr . readLine ( ) . trim ( ) ;
  final String [ ] rdstrs = ssr . split ( " " ) ;
  final int [ ] rdints = map ( Integer . parseInt , ssr . split ( " " ) ) ;
  final int cnum = cnum ;
  do {
    final int A = rdints [ cnum ] ;
    final int B = rdints [ cnum ] ;
    final double [ ] p = map ( Double . parseDouble , ssr . split ( " " ) ) ;
    assert p . length == A ;
    int m = B + 2 ;
    double pp = 1.0 ;
    for ( int i = 0 ;
    i < A ;
    i ++ ) {
      final int k = A - i - 1 ;
      pp *= p [ i ] ;
      final int x = 2 * k + B - A + 1 + ( 1 - pp ) * ( B + 1 ) ;
      m = Math . min ( m , x ) ;
    }
    System . out . println ( "Case #" + cnum + ": " + m ) ;
  }
  while ( cnum < N ) ;
  final int N = Integer . parseInt ( rdline ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) doOneCase ( i + 1 ) ;
  if ( __name__ . equals ( "main" ) ) {
    main ( ) ;
  }
  else {
    final int N = Integer . parseInt ( rdline ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) doOneCase ( i + 1 ) ;
  }
  if ( __name__ . equals ( "main" ) ) {
    main ( ) ;
  }
  else {
    main ( ) ;
  }
  return "" ;
}
