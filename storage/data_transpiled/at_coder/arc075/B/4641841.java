public static boolean judge ( int N , int A , int B ) {
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( h , Collections . reverseOrder ( ) ) ;
  /* judge M */
  int i = 0 ;
  int j = M ;
  do {
    if ( i >= N ) return ( true ) ;
    if ( h [ i ] <= M * B ) return ( true ) ;
    int diff = h [ i ] - M * B ;
    int needs = diff / ( A - B ) ;
    if ( diff % ( A - B ) != 0 ) {
      needs ++ ;
    }
    j -= needs ;
    if ( j < 0 ) return ( false ) ;
    i ++ ;
  }
  while ( j > 0 ) ;
  int ok = N * 10 * 9 ;
  int ng = 0 ;
  while ( ok > ng + 1 ) {
    int mid = ( ok + ng ) / 2 ;
    if ( judge ( mid ) ) ok = mid ;
    else ng = mid ;
  }
  System . out . println ( ok ) ;
  return ( false ) ;
}
