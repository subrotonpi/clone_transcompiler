@ Nonnull public static String calc ( int D , String d ) {
  class Cheaters extends Exception {
  }
  @ Override public int calc ( int D , String d ) throws Cheaters {
    if ( StringUtils . isEmpty ( d ) ) {
      throw new Cheaters ( ) ;
    }
    if ( d . length ( ) > 2 * D ) {
      if ( d . substring ( 2 * D ) . length ( ) != d . length ( ) - 2 * D ) {
        throw new Cheaters ( ) ;
      }
    }
    d = d . substring ( 0 , 2 * D ) ;
    int [ ] e = new int [ D ] ;
    for ( int i = 0 ;
    i < D ;
    i ++ ) {
      e [ i ] = d . charAt ( i ) - d . charAt ( D + i ) ;
    }
    e = Arrays . copyOf ( e , e . length ) ;
    Arrays . sort ( e ) ;
    for ( int i = 0 ;
    i < D - 1 ;
    i ++ ) {
      e [ i ] = e [ i ] + e [ i + 1 ] - e [ i ] ;
    }
    if ( StringUtils . isEmpty ( e ) ) {
      throw new Cheaters ( ) ;
    }
    e = Arrays . copyOf ( e , e . length / 2 ) ;
    int res = Integer . valueOf ( Math . abs ( e ) ) ;
    e = Collections . copyOf ( accumulate ( e , e . length ) , e . length ) ;
    int m = - Math . min ( e , e . length ) ;
    e = Arrays . copyOf ( e , e . length ) ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      e [ i ] = e [ i ] + m ;
    }
    d = Arrays . copyOf ( d , d . length ) ;
    if ( D > 1 ) {
      return res + calc ( D / 2 , d ) ;
    }
    else {
      return res ;
    }
  }
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int N = Integer . parseInt ( input ( ) ) ;
    int D = Integer . parseInt ( input ( ) ) ;
    String ans ;
    try {
      ans = calc ( D , d ) ;
    }
    catch ( Cheaters e ) {
      ans = "CHEATERS!" ;
    }
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return N ;
}
