public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > As = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) As . add ( Integer . parseInt ( input ) ) ;
  int maxA = Collections . max ( As ) ;
  int minA = Collections . min ( As ) ;
  String flg ;
  if ( minA >= 0 ) {
    flg = "GE" ;
    System . out . println ( N - 1 ) ;
  }
  else if ( maxA <= 0 ) {
    flg = "LE" ;
    System . out . println ( N - 1 ) ;
  }
  else {
    if ( - minA <= maxA ) {
      flg = "GE" ;
      System . out . println ( 2 * N - 1 ) ;
      int iMax = As . indexOf ( maxA ) + 1 ;
      for ( int i = 1 ;
      i <= N ;
      i ++ ) System . out . println ( iMax + " " + i ) ;
    }
    else {
      flg = "LE" ;
      System . out . println ( 2 * N - 1 ) ;
      int iMin = As . indexOf ( minA ) + 1 ;
      for ( int i = 1 ;
      i <= N ;
      i ++ ) System . out . println ( iMin + " " + i ) ;
    }
  }
  if ( flg . equals ( "GE" ) ) {
    for ( int i = 1 ;
    i <= N ;
    i ++ ) System . out . println ( i + " " + i ) ;
  }
  else {
    for ( int i = 1 ;
    i <= N ;
    i ++ ) System . out . println ( i + " " + i ) ;
  }
}
