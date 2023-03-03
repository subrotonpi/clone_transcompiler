@ VisibleForTesting static void System ( Scanner in ) {
  final Function < String , String > inStrings = new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return in . nextLine ( ) . substring ( 0 , in . nextLine ( ) . length ( ) - 1 ) ;
    }
  }
  ;
  final Function < Integer , Integer > inInteger = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer input ) {
      return Integer . parseInt ( input ) ;
    }
  }
  ;
  final Function < List < Integer > , Integer > inIntList = new Function < List < Integer > , Integer > ( ) {
    @ Override public Integer apply ( List < Integer > input ) {
      return in . nextInt ( ) ;
    }
  }
  ;
  final int N = inIntList . apply ( ) ;
  final int A = inInteger . apply ( ) ;
  final int B = inInteger . apply ( ) ;
  final int K = inInteger . apply ( ) ;
  final int NUM = 998244353 ;
  final int [ ] Inv = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Inv [ i ] = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      Inv [ j ] = Math . pow ( i + 1 , NUM - 2 , NUM ) ;
    }
  }
  final int [ ] Comb = new int [ N + 1 ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    Comb [ j ] = 0 ;
    Comb [ j ] = 1 ;
  }
  Comb [ 0 ] = 1 ;
  for ( int j = 1 ;
  j < N ;
  j ++ ) {
    Comb [ j ] = ( Comb [ j ] * ( N - j + 1 ) * Inv [ j ] ) % NUM ;
  }
  ans = 0 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    if ( ( j == N ) && ( j == N ) ) ans = ( ans + Comb [ j ] * Comb [ ( K - j + 1 ) / B ] ) % NUM ;
  }
  System . out . println ( ans ) ;
}
