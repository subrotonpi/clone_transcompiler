static void print ( ) {
  final String input = System . console ( ) . readLine ( ) ;
  final int N = Integer . parseInt ( input ) ;
  final String [ ] S = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = input . charAt ( i ) ;
  }
  final int [ ] MARCHcnt = new int [ 5 ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    switch ( S [ i ] . charAt ( 0 ) ) {
      case 'M' : MARCHcnt [ 0 ] ++ ;
      break ;
      case 'A' : MARCHcnt [ 1 ] ++ ;
      break ;
      case 'R' : MARCHcnt [ 2 ] ++ ;
      break ;
      case 'C' : MARCHcnt [ 3 ] ++ ;
      break ;
      case 'H' : MARCHcnt [ 4 ] ++ ;
      break ;
    }
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < 4 ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < 5 ;
      k ++ ) {
        ans += MARCHcnt [ i ] * MARCHcnt [ j ] * MARCHcnt [ k ] ;
      }
    }
  }
  System . out . println ( ans ) ;
}
