public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] disk = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    disk [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] result = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    result [ i ] = ( i + 1 ) ;
  }
  int n = 0 ;
  for ( int i = 0 ;
  i < disk . length ;
  i ++ ) {
    if ( disk [ i ] != n ) {
      int i = result [ i ] ;
      result [ i ] = n ++ ;
      n = i ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( result [ i ] ) ;
  }
  return result ;
}
