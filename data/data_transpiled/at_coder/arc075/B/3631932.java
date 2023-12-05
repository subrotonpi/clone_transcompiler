public static int N = Integer . parseInt ( input ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( H , Collections . reverseOrder ( ) ) ;
  /* Defeat k */
  int n = 0 ;
  for ( int h : H ) {
    if ( h <= B * k ) break ;
    h -= B * k ;
    n += - ( - h / ( A - B ) ) ;
    if ( n > k ) return false ;
  }
  int ok = 10 * 18 ;
  int ng = 0 ;
  while ( ok - ng > 1 ) {
    int m = ( ok + ng ) / 2 ;
    if ( defeat ( m ) ) ok = m ;
    else ng = m ;
  }
  System . out . println ( ok ) ;
  return ok ;
}
