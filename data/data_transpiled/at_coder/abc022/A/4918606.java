public static int N ( ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( W >= S && T >= W ) count ++ ;
    int tmp = Integer . parseInt ( input . nextLine ( ) ) ;
    W += tmp ;
  }
  if ( W >= S && T >= W ) count ++ ;
  return count ;
}
