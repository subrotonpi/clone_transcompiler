@ GwtIncompatible ( "Doubles" ) public static int Worst ( int n ) {
  int Cost = 1 ;
  int Time = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    if ( Cost == 0 || Cost % i != 0 ) {
      int k = Cost ;
      while ( ( Cost % i ) != 0 ) {
        Cost += k ;
      }
      Time ++ ;
    }
  }
  int [ ] P = new int [ n + 1 ] ;
  P [ 0 ] = 2 ;
  int k = 3 ;
  while ( ( k = StdIn . readIntInRange ( P , 0 , n ) ) < 1000 ) {
    boolean isP = true ;
    for ( int p : P ) {
      if ( k % p == 0 ) {
        isP = false ;
      }
    }
    if ( isP ) {
      P [ p ] = k ;
    }
    k += 2 ;
  }
  int T = Integer . parseInt ( StdIn . readString ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    int N = Integer . parseInt ( StdIn . readString ( ) ) ;
    boolean Bad = Worst ( N ) ;
    if ( N == 1 ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( Worst ( N ) - Best ( N ) ) ;
    }
  }
  return Time ;
}
