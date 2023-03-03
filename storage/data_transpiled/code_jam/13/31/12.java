static final Scanner in = new Scanner ( System . in ) {
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int cas : xrange ( 1 , T + 1 ) ) {
    System . out . println ( "Case #" + cas + ":" ) ;
    String s = in . nextLine ( ) ;
    String n = in . nextLine ( ) ;
    n = Integer . parseInt ( n ) ;
    int L = s . length ( ) ;
    int ans = 0 ;
    int t = 0 ;
    int c = 0 ;
    int k = 0 ;
    for ( int i : xrange ( L ) ) {
      String l = s . substring ( i ) ;
      if ( l . contains ( "aeiou" ) ) {
        c = 0 ;
      }
      else {
        c ++ ;
      }
      if ( c >= n ) {
        int nk = i + 1 - n ;
        t += nk - k + 1 ;
        k = nk + 1 ;
      }
      ans += t ;
    }
    System . out . println ( ans ) ;
  }
}
