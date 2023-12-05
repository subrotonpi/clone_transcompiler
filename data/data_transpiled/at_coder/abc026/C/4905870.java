public static int [ ] [ ] getBuka ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] bl = new int [ N - 1 ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) bl [ i ] = ( Integer . parseInt ( input . nextLine ( ) ) - 1 ) ;
  int [ ] ll = new int [ N ] ;
  int [ ] checked = new int [ N ] ;
  buka = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] t = new int [ N ] ;
    for ( int j = 0 ;
    j < N - 1 ;
    j ++ ) {
      if ( bl [ j ] == i ) t [ j ] = j + 1 ;
    }
    buka [ i ] = t ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( buka [ i ] . length == 0 ) {
      checked [ i ] = 1 ;
      ll [ i ] = 1 ;
    }
  }
  while ( true ) {
    if ( min ( checked ) == 1 ) break ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      boolean flg = true ;
      for ( int bb : buka [ i ] ) {
        if ( checked [ bb ] == 0 ) flg = false ;
      }
      if ( flg == true ) {
        int mmax = 0 ;
        int mmin = 10 * 12 ;
        for ( int bb : buka [ i ] ) {
          mmax = Math . max ( mmax , ll [ bb ] ) ;
          mmin = Math . min ( mmin , ll [ bb ] ) ;
        }
        checked [ i ] = 1 ;
        ll [ i ] = mmax + mmin + 1 ;
      }
    }
  }
  System . out . println ( ll [ 0 ] ) ;
  return ll ;
}
