public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  char [ ] [ ] L = new char [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = input . toCharArray ( ) ;
  }
  int tmp1 = 0 ;
  int tmp2 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( L [ i ] [ j ] == 'R' ) {
        tmp1 ++ ;
      }
      if ( L [ i ] [ j ] == 'B' ) {
        tmp2 ++ ;
      }
    }
  }
  if ( tmp1 > tmp2 ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else if ( tmp1 < tmp2 ) {
    System . out . println ( "AOKI" ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
}
