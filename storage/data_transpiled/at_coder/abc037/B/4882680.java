public static int [ ] [ ] getLines ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  int [ ] row = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) row [ i ] = 0 ;
  int [ ] [ ] lines = new int [ Q ] [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    lines [ i ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    for ( int j = 0 ;
    j < Q ;
    j ++ ) {
      for ( int j = 0 ;
      j < Q ;
      j ++ ) {
        for ( int j = 0 ;
        j < Q ;
        j ++ ) {
          row [ j ] += Integer . parseInt ( input ) ;
        }
      }
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    for ( int j = 0 ;
    j < Q ;
    j ++ ) {
      row [ j ] += Integer . parseInt ( input ) ;
    }
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    row [ i ] = row [ i ] ;
  }
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    System . out . println ( row [ i ] ) ;
  }
  return row ;
}
