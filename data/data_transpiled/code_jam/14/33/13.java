public static int ttt = Integer . parseInt ( input ) {
  int ttt = input . nextInt ( ) ;
  for ( int tti = 0 ;
  tti < ttt ;
  tti ++ ) {
    System . out . print ( "Case #" + ( tti + 1 ) + ": " ) ;
    String [ ] buf = input . split ( "\\s+" ) ;
    int n = Integer . parseInt ( buf [ 0 ] ) ;
    int m = Integer . parseInt ( buf [ 1 ] ) ;
    int k = Integer . parseInt ( buf [ 2 ] ) ;
    int wyn = k ;
    for ( int i = 3 ;
    i <= n ;
    i ++ ) {
      for ( int j = 3 ;
      j <= m ;
      j ++ ) {
        int kam = i * j - 4 ;
        int obw = ( i - 2 ) * 2 + ( j - 2 ) * 2 ;
        int poz = Math . max ( 0 , k - kam ) ;
        if ( obw + poz < wyn ) {
          wyn = obw + poz ;
        }
        if ( kam - k >= 2 && obw + poz - 1 < wyn ) {
          wyn = obw + poz - 1 ;
        }
      }
    }
    System . out . println ( wyn ) ;
  }
  return ttt ;
}
