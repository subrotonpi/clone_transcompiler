@ VisibleForTesting static double getPi ( Scanner in ) {
  int tnum = in . nextInt ( ) ;
  for ( int ti = 0 ;
  ti < tnum ;
  ti ++ ) {
    int n = in . nextInt ( ) , k = in . nextInt ( ) ;
    int [ ] [ ] ps = new int [ n ] [ k ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) ps [ i ] = in . nextInt ( ) ;
    Arrays . sort ( ps , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer o1 , Integer o2 ) {
        return o2 . intValue ( ) - o1 . intValue ( ) ;
      }
    }
    ) ;
    double ans = 0 ;
    for ( int i = k - 1 ;
    i < n ;
    i ++ ) {
      double cur = sum ( 2 * r * h ) ;
      cur += 2 * ps [ i ] [ 0 ] * ps [ i ] [ 1 ] ;
      cur += ps [ i ] [ 0 ] * ps [ i ] [ 1 ] ;
      ans = Math . max ( ans , cur ) ;
    }
    print ( "Case #" + ( ti + 1 ) + ": " + ( ans * Math . PI ) ) ;
  }
  return ans * Math . PI ;
}
