public static double input ( ) {
  int S = input . nextInt ( ) ;
  double ans = Double . MIN_VALUE ;
  for ( int i = 0 ;
  i < S . length ( ) - 1 ;
  i ++ ) {
    if ( S . charAt ( i ) != S . charAt ( i + 1 ) ) {
      int k = Math . max ( i + 1 , S . length ( ) - i - 1 ) ;
      if ( k <= ans ) {
        ans = k ;
      }
    }
  }
  if ( ans != Double . MIN_VALUE ) {
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( S . length ) ;
  }
  return ans ;
}
