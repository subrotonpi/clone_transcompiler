public static void input ( ) {
  S = list ( input ) ;
  B = 0 ;
  W = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'B' ) B ++ ;
    else W ++ ;
  }
  int Num = 0 ;
  int Count = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'W' ) {
      Count += ( i - Num ) ;
      Num ++ ;
    }
  }
  System . out . println ( Count ) ;
}
