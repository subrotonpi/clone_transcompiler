public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int rn [ ] = new int [ n ] ;
  int hn [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int r , h ;
    r = Integer . parseInt ( input . nextLine ( ) ) ;
    h = Integer . parseInt ( input . nextLine ( ) ) ;
    rn [ i ] = r ;
    hn [ i ] = h ;
  }
  int [ ] [ ] handCount = new int [ 100000 + 1 ] [ ] ;
  for ( int r = 0 ;
  r < n ;
  r ++ ) {
    handCount [ r ] [ r ] = 0 ;
    handCount [ r ] [ h - 1 ] ++ ;
  }
  int [ ] accCount = new int [ 100000 + 1 ] ;
  for ( int r = 1 ;
  r <= 100000 ;
  r ++ ) {
    accCount [ r ] = accCount [ r - 1 ] ;
    for ( int h0 = 0 ;
    h0 < 3 ;
    h0 ++ ) {
      accCount [ r ] += handCount [ r ] [ h0 ] ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int r = rn [ i ] ;
    int h = hn [ i ] ;
    int nWin = accCount [ r - 1 ] + handCount [ r ] [ handLoses ( h ) - 1 ] ;
    int nEven = handCount [ r ] [ h - 1 ] - 1 ;
    int nLose = n - accCount [ r ] + handCount [ r ] [ handWins ( h ) - 1 ] ;
    System . out . println ( nWin + " " + nLose + " " + nEven ) ;
  }
}
