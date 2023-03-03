public static String print ( int N ) {
  String S = input . next ( ) ;
  int unclosedBra = 0 ;
  int unclosedKet = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == '(' ) {
      unclosedBra ++ ;
    }
    else {
      if ( unclosedBra > 0 ) {
        unclosedKet -- ;
      }
    }
  }
  return S ;
}
