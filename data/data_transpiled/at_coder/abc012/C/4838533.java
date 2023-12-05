public static int N = Integer . parseInt ( input ) {
  int SUM = 2025 ;
  int diff = SUM - N ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    if ( diff % ( i + 1 ) == 0 && diff / ( i + 1 ) <= 9 ) {
      System . out . println ( i + 1 + " x " + diff / ( i + 1 ) ) ;
    }
  }
  return 0 ;
}
