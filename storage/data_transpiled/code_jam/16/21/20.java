static final String solve ( String s ) throws IOException {
  char alpha [ ] = s . toCharArray ( ) ;
  assert alpha . length == 26 ;
  {
    int [ ] lcounts = new int [ s . length ( ) ] ;
    int [ ] ncounts = new int [ 10 ] ;
    for ( int l = 0 ;
    l < s . length ( ) ;
    l ++ ) {
      lcounts [ l ] = 1 ;
    }
    {
      int k = 0 ;
      String kstr = s . substring ( l ) ;
      int xxx = lcounts [ k ] ;
      ncounts [ k ] = xxx ;
      for ( int i = 0 ;
      i < s . length ( ) ;
      i ++ ) {
        String lete = kstr . substring ( i ) ;
        lcounts [ k ] -= xxx ;
      }
    }
    {
      int k = 0 ;
      String s = s . substring ( k ) ;
      int xxx = lcounts [ k ] ;
      ncounts [ k ] = xxx ;
      for ( int i = k ;
      i < s . length ( ) ;
      i ++ ) {
        String lete = s . substring ( k , k + i ) ;
        lcounts [ k ] -= xxx ;
      }
    }
    {
      int k = 0 ;
      String s = s . substring ( k ) ;
      int xxx = lcounts [ k ] ;
      ncounts [ k ] = xxx ;
      for ( int i = k + 1 ;
      i < s . length ( ) ;
      i ++ ) {
        String lete = s . substring ( k , k + i ) ;
        lcounts [ k ] -= xxx ;
      }
    }
    {
      int k = 0 ;
      String s = s . substring ( k ) ;
      ncounts [ k ] = ncounts [ k ] ;
      for ( int i = k + 1 ;
      i < s . length ( ) ;
      i ++ ) {
        String s = s . substring ( k , k + i ) ;
        ncounts [ k ] = ncounts [ k ] ;
      }
    }
  }
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int T = Integer . parseInt ( in . readLine ( ) . trim ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    String S = in . readLine ( ) . trim ( ) ;
    String ans = in . readLine ( ) ;
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return s ;
}
