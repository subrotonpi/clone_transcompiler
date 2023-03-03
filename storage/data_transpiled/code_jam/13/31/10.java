public static int T = input . nextInt ( ) {
  String vowels = "aeiou" ;
  /* good */
  int run = 0 ;
  int bestrun = 0 ;
  for ( char c : st ) {
    if ( vowels . indexOf ( c ) != - 1 ) {
      bestrun = Math . max ( run , bestrun ) ;
      run = 0 ;
    }
    else {
      run ++ ;
    }
  }
  bestrun = Math . max ( run , bestrun ) ;
  /* cnt */
  if ( bestrun >= n ) {
    return 0 ;
  }
  int x = b - a + 1 ;
  /* cnt */
  if ( x < n ) {
    return 0 ;
  }
  int [ ] s = new int [ s . length ] ;
  int n = Integer . parseInt ( s [ n ] ) ;
  int [ ] ends = new int [ s . length ] ;
  boolean [ ] ed = new boolean [ s . length ] ;
  int run = 0 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( vowels . indexOf ( s [ i ] ) != - 1 ) {
      run = 0 ;
    }
    else {
      run ++ ;
    }
    if ( run >= n ) {
      ends [ i ] = s [ i ] ;
      ed [ i ] = true ;
    }
  }
  int B = 0 ;
  int le = 0 ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    if ( ed [ i ] ) {
      le = i ;
    }
    if ( le != 0 ) {
      B += le + 2 - n ;
    }
  }
  System . out . println ( "Case #" + testCase + ": " + B ) ;
  return B ;
}
