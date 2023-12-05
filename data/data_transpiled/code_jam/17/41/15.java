static final String getDoubleOutput ( ) {
  String inname = "input.txt" ;
  String outname = "output.txt" ;
  try {
    BufferedReader br = new BufferedReader ( new FileReader ( inname ) ) ;
    int cases = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int tc = 1 ;
    tc <= cases ;
    tc ++ ) {
      String [ ] line = br . readLine ( ) . trim ( ) . split ( "\\s+" ) ;
      int N = Integer . parseInt ( line [ 0 ] ) ;
      int P = Integer . parseInt ( line [ 1 ] ) ;
      int [ ] Pi = new int [ P ] ;
      int [ ] R = new int [ P ] ;
      line = br . readLine ( ) . trim ( ) . split ( "\\s+" ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        Pi [ i ] = Integer . parseInt ( line [ i ] ) ;
        R [ Pi [ i ] % P ] ++ ;
      }
      int ans = 0 ;
      if ( P == 2 ) {
        ans = R [ 0 ] + ( R [ 1 ] + 1 ) / 2 ;
      }
      else if ( P == 3 ) {
        ans = R [ 0 ] ;
        int a , b ;
        if ( R [ 1 ] < R [ 2 ] ) {
          a = R [ 1 ] ;
          b = R [ 2 ] ;
        }
        else {
          a = R [ 2 ] ;
          b = R [ 1 ] ;
        }
        ans += a ;
        b -= a ;
        ans += ( b + 2 ) / 3 ;
      }
      else {
        ans = R [ 0 ] ;
        int a , b ;
        if ( R [ 1 ] < R [ 3 ] ) {
          a = R [ 1 ] ;
          b = R [ 3 ] ;
        }
        else {
          a = R [ 3 ] ;
          b = R [ 1 ] ;
        }
        int c = R [ 2 ] ;
        ans += c / 2 ;
        c %= 2 ;
        ans += a ;
        b -= a ;
        if ( c == 1 && b >= 2 ) {
          c -- ;
          b -= 2 ;
          ans ++ ;
        }
        ans += b / 4 ;
        b %= 4 ;
        if ( c + b > 0 ) ans ++ ;
      }
      System . out . println ( "Case #" + tc + ": " + ans ) ;
    }
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
  return outname ;
}
