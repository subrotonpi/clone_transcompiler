static final String print ( ) {
  final BufferedReader ssr = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final BufferedWriter ssw = new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ;
  final String rdline = ssr . readLine ( ) . trim ( ) ;
  final String [ ] rdstrs = ssr . split ( " " ) ;
  final int [ ] rdints = ArrayUtil . toIntArray ( ssr . split ( " " ) ) ;
  doOneCase ( cnum ) ;
  final int N = rdints . length ;
  final int [ ] abi = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int a = rdints [ i ] ;
    abi [ i ] = new int [ a + 1 ] ;
    for ( int j = 0 ;
    j < a ;
    j ++ ) {
      abi [ i ] [ j ] = i ;
    }
  }
  final int [ ] d = new int [ N * 2 ] ;
  int s = 0 ;
  int n = 0 ;
  while ( s < 2 * N ) {
    final int b = Math . min ( Arrays . binarySearch ( abi , new int [ ] {
    }
    ) , N ) ;
    if ( b <= s ) {
      s += 2 - d [ i ] ;
      d [ i ] = 2 ;
      n ++ ;
      continue ;
    }
    final int [ ] bai = Arrays . binarySearch ( abi , new int [ ] {
    }
    ) ;
    if ( bai == 0 && a <= s ) {
      System . out . println ( "Case #" + cnum + ": Too Bad" ) ;
      return null ;
    }
    final int b = Math . max ( bai , 0 ) ;
    s ++ ;
    d [ i ] = 1 ;
    n ++ ;
  }
  System . out . println ( "Case #" + cnum + ": " + n ) ;
  final int N = Integer . parseInt ( rdline ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    doOneCase ( i + 1 ) ;
  }
  if ( __name__ == null ) {
    return null ;
  }
  return "" ;
}
