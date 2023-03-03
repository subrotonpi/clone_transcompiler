static String print ( ) {
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    final int veins = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int [ ] d = new int [ veins ] ;
    final int [ ] l = new int [ veins ] ;
    for ( int i = 0 ;
    i < veins ;
    i ++ ) {
      final int di = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      final int li = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      d [ i ] = di ;
      l [ i ] = li ;
    }
    d [ veins ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    l [ veins ] = 1 ;
    final int [ ] reachable = new int [ veins + 1 ] ;
    reachable [ 0 ] = - 1 ;
    reachable [ 0 ] = d [ 0 ] ;
    for ( int veinI = 0 ;
    veinI < veins + 1 ;
    veinI ++ ) {
      final int upTo = d [ veinI ] + reachable [ veinI ] ;
      int nextVein = veinI + 1 ;
      while ( nextVein < veins + 1 && d [ nextVein ] <= upTo ) {
        reachable [ nextVein ] = Math . max ( reachable [ nextVein ] , Math . min ( l [ nextVein ] , d [ nextVein ] - d [ veinI ] ) ) ;
        nextVein ++ ;
      }
    }
    String ans ;
    if ( reachable [ veins ] > 0 ) {
      ans = "YES" ;
    }
    else {
      ans = "NO" ;
    }
    System . out . println ( "Case #" + t + ": " + ans ) ;
  }
  return "" ;
}
