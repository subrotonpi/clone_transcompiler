static final int [ ] getSortedKeys ( ) {
  final int CBG = 0 , CED = 100 ;
  if ( args . length > 0 ) {
    CBG = Integer . parseInt ( args [ 0 ] ) ;
    CED = Integer . parseInt ( args [ 1 ] ) ;
  }
  final int NCASE = Integer . parseInt ( System . in . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= NCASE ;
  testCase ++ ) {
    final int N = Integer . parseInt ( System . in . readLine ( ) ) ;
    final String [ ] SB = Arrays . stream ( xrange ( N ) ) . mapToObj ( String :: split ) . toArray ( ) ;
    if ( testCase < CBG || testCase > CED ) continue ;
    final String [ ] S = SB . subList ( 2 , SB . length ) . toArray ( String [ ] :: new ) ;
    final Map < String , Integer > LB = new LinkedHashMap < String , Integer > ( ) ;
    for ( int w : SB [ 0 ] . split ( " " ) ) LB . put ( w , 1 ) ;
    for ( int w : SB [ 1 ] . split ( " " ) ) LB . put ( w , 2 ) ;
    int mn = 100000 ;
    for ( int b : xrange ( 1 << ( N - 2 ) ) ) {
      final Map < String , Integer > L = new HashMap < String , Integer > ( LB ) ;
      for ( int i : xrange ( N - 2 ) ) {
        final int m = ( b & ( 1 << i ) ) > 0 ? 1 : 2 ;
        for ( int w : S [ i ] . split ( " " ) ) L . put ( w , L . getOrDefault ( w , 0 ) | m ) ;
      }
      final int cnt = L . size ( ) ;
      mn = Math . min ( mn , cnt ) ;
    }
    System . out . println ( "Case #" + testCase + ": " + mn ) ;
  }
  return new int [ ] {
    mn }
    ;
  }
  