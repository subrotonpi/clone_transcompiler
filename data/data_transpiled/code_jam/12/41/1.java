public static void testCount ( Scanner in ) {
  int testCount = in . nextInt ( ) ;
  for ( int testIndex = 0 ;
  testIndex < testCount ;
  testIndex ++ ) {
    String ans = "Case #" + ( testIndex + 1 ) + ": " ;
    int n = in . nextInt ( ) ;
    int [ ] [ ] v = new int [ n ] [ 2 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      v [ i ] [ 0 ] = in . nextInt ( ) ;
    }
    int g = in . nextInt ( ) ;
    int [ ] p = new int [ n ] ;
    Arrays . fill ( p , 0 ) ;
    p [ 0 ] = v [ 0 ] [ 0 ] ;
    boolean res = false ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( p [ i ] + v [ i ] [ 0 ] >= g ) {
        res = true ;
        break ;
      }
      for ( int j = i + 1 ;
      j < n ;
      j ++ ) {
        if ( p [ i ] + v [ i ] [ 0 ] < v [ j ] [ 0 ] ) {
          break ;
        }
        else {
          int pp = Math . min ( v [ j ] [ 1 ] , v [ j ] [ 0 ] - v [ i ] [ 0 ] ) ;
          p [ j ] = Math . max ( p [ j ] , pp ) ;
        }
      }
    }
    if ( res ) {
      ans += "YES" ;
    }
    else {
      ans += "NO" ;
    }
    System . out . println ( ans ) ;
  }
}
