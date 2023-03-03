public static int input ( int n , int x ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) . split ( " " ) ;
  int MIN = Integer . MAX_VALUE ;
  int ans = MIN + 0 ;
  int [ ] tori = a . clone ( ) ;
  tori [ 0 ] = 0 ;
  tori [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      int ido = i + j ;
      if ( ido >= n ) ido -= n ;
      if ( tori [ j ] > a [ ido ] ) {
        ans -= ( tori [ j ] - a [ ido ] ) ;
        tori [ j ] = a [ ido ] ;
      }
    }
    MIN = Math . min ( ans + i * x , MIN ) ;
  }
  return MIN ;
}
