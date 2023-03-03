public static int tt = Integer . parseInt ( Scanner in ) {
  for ( int t = xrange ( 1 , tt + 1 ) ;
  t < xrange ( tt + 1 ) ;
  t ++ ) {
    String s = in . nextLine ( ) . trim ( ) ;
    String ans = s . substring ( 0 , s . length ( ) ) ;
    int [ ] signat = new int [ s . length ( ) + 1 ] ;
    signat [ 0 ] = s . substring ( 0 , s . length ( ) ) ;
    for ( int i : xrange ( 1 , s . length ( ) ) ) {
      if ( s . charAt ( i ) < signat [ i - 1 ] . charAt ( 0 ) ) {
        ans = ans + s . charAt ( i ) ;
        signat [ i ] = signat [ i - 1 ] ;
      }
      else if ( s . charAt ( i ) > signat [ i - 1 ] . charAt ( 0 ) ) {
        ans = s . charAt ( i ) + ans ;
        signat [ i ] = s . charAt ( i ) + signat [ i - 1 ] . charAt ( 0 ) ;
      }
      else if ( s . charAt ( i ) < signat [ i - 1 ] . charAt ( 1 ) ) {
        ans = ans + s . charAt ( i ) ;
        signat [ i ] = signat [ i - 1 ] ;
      }
      else {
        ans = s . charAt ( i ) + ans ;
        signat [ i ] = signat [ i - 1 ] ;
      }
    }
    System . out . println ( "Case #" + t + ": " + ans ) ;
  }
  return tt ;
}
