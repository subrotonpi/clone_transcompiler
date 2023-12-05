public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( H ) ;
  int ok = Math . max ( H . length , H . length ) / B + 1 ;
  int ng = 0 ;
  int mid = ( ok + ng ) / 2 ;
  while ( ok - ng > 1 ) {
    int cntLive = 0 ;
    for ( int h : H ) {
      h -= B * mid ;
      if ( h > 0 ) cntLive += ( h + A - B - 1 ) / ( A - B ) ;
    }
    if ( cntLive <= mid ) ok = mid ;
    else ng = mid ;
    mid = ( ok + ng ) / 2 ;
  }
  System . out . println ( ok ) ;
  return 0 ;
}
