static int max1 ( int [ ] r ) {
  final int [ ] z = new int [ r . length ] ;
  for ( int i = 0 ;
  i < r . length ;
  i ++ ) {
    z [ i ] = r [ i ] ;
  }
  if ( ( z == null ) || ( z . length == 0 ) ) {
    return 0 ;
  }
  else {
    return max ( z ) ;
  }
  /* solve the input array */
  final int [ ] in = new int [ r . length ] ;
  for ( int s : r ) {
    in [ s ] = max1 ( s ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    final int z = min ( in [ i ] , in [ i ] ) ;
    for ( int q = 0 ;
    q < in . length ;
    q ++ ) {
      if ( q >= i && in [ q ] <= i ) {
        final int [ ] r = new int [ z ] ;
        for ( int j = i ;
        j < z ;
        j ++ ) {
          r [ q ] = in [ q ] ;
        }
        r [ q ] = in [ q + 1 ] ;
        ans ++ ;
      }
    }
  }
  /* return ans; */
  final BufferedReader rdln = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( rdln . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    final int N = Integer . parseInt ( rdln . readLine ( ) ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + " " + solve ( new int [ ] [ ] {
      Integer . parseInt ( rdln . readLine ( ) . trim ( ) ) }
      ) + " " + " " + " " ) ;
    }
    return ans ;
  }
  