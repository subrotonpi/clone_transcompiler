static final String getExample ( ) {
  final BufferedReader ssr = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final BufferedWriter ssw = new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ;
  final String rdline = ssr . readLine ( ) . trim ( ) ;
  final String [ ] rdstrs = ssr . split ( " " ) ;
  final int [ ] rdints = ArrayUtil . toIntArray ( ssr . split ( " " ) ) ;
  final int [ ] rd1int = new int [ rdline . length ( ) ] ;
  doOneCase ( cnum ) ;
  final int N = rdints [ 0 ] ;
  final int X = rdints [ 1 ] ;
  final List < Integer > S = new ArrayList < Integer > ( ) ;
  final int N2 = N / 2 ;
  final int N1 = 2 * N2 ;
  assert S . size ( ) == N ;
  Collections . sort ( S ) ;
  int m = 0 ;
  while ( S . size ( ) > 0 ) {
    m ++ ;
    final int a = S . remove ( 0 ) ;
    if ( S . size ( ) > 0 && S . get ( 0 ) + a <= X ) {
      final int i = Arrays . binarySearch ( S , X - a ) ;
      if ( i > 0 ) {
        assert a + S . get ( i - 1 ) <= X ;
        S . remove ( i - 1 ) ;
      }
    }
  }
  System . out . println ( "Case #" + cnum + ": " + m ) ;
  final int N = rd1int [ 0 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    doOneCase ( i + 1 ) ;
  }
  if ( __name__ . equals ( "main" ) ) {
    main ( ) ;
  }
  else {
    System . out . println ( "main" ) ;
  }
  return "" ;
}
