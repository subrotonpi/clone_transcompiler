public static void main ( Scanner in ) {
  int tnum = in . nextInt ( ) ;
  for ( int tcou = 0 ;
  tcou < tnum ;
  tcou ++ ) {
    int n = in . nextInt ( ) ;
    int [ ] s = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) s [ i ] = in . nextInt ( ) ;
    int ans1 = 0 ;
    int r = 0 ;
    int ans2 = 0 ;
    for ( int i = s . length - 1 , j = 0 ;
    i < s . length ;
    i ++ , j ++ ) {
      if ( s [ i ] < s [ j ] ) ans1 += s [ j ] - s [ i ] ;
      r = Math . max ( r , s [ j ] - s [ j ] ) ;
    }
    for ( int i = s . length - 1 , j = 0 ;
    i < s . length ;
    j ++ , j ++ ) ans2 += Math . min ( r , s [ j ] ) ;
    System . out . println ( "Case #" + ( tcou + 1 ) + ": " + ans1 + " " + ans2 ) ;
  }
}
