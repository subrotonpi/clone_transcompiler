@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] line ( ) {
  /* TODO Auto-generated method stub from java.util.Scanner */
  Scanner in = new Scanner ( System . in ) ;
  /* TODO Auto-generated method stub from java.util.Scanner */
  int T = in . nextInt ( ) ;
  /* TODO Auto-generated method stub from java.util.Scanner */
  int M = in . nextInt ( ) ;
  int N = in . nextInt ( ) ;
  String [ ] S = new String [ M ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) S [ i ] = in . next ( ) ;
  int [ ] [ ] X = new int [ M ] [ N ] ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    int [ ] Y = new int [ N ] ;
    for ( int x = 0 ;
    x < X . length ;
    x ++ ) for ( int n = 0 ;
    n < N ;
    n ++ ) Y [ m ] = X [ x ] [ n ] ;
    X = Y ;
  }
  Arrays . sort ( X ) ;
  int bestA = 0 , nA = 0 ;
  for ( int [ ] x : X ) {
    HashMap < String , Integer > V = new HashMap < String , Integer > ( ) ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) for ( int si = 0 ;
    si < N ;
    si ++ ) {
      int nn = x [ si ] ;
      if ( n == nn ) {
        String s = S [ si ] ;
        for ( int i = 0 ;
        i < Range . N ;
        i ++ ) {
          int prevV = V . getOrDefault ( s . substring ( 0 , i ) , ( int ) ( n - 1 ) ) ;
          if ( prevV != n ) V . put ( s . substring ( 0 , i ) , new Integer ( prevV + 1 ) ) ;
        }
      }
    }
  }
  int A = 0 ;
  for ( Map . Entry < String , Integer > e : V . entrySet ( ) ) {
    A += e . getValue ( ) ;
  }
  if ( A > bestA ) bestA = A ;
  nA = 0 ;
  if ( A == bestA ) nA ++ ;
  System . out . printf ( "Case #%d: %d %d%n" ,