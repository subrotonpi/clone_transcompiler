public static int N = ( int ) input ( ) {
  int N = ( int ) input . nextInt ( ) , K = ( int ) input . nextInt ( ) ;
  int conti = 1 ;
  int previous = Integer . MIN_VALUE ;
  int count = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    int current = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( current > previous ) conti ++ ;
    else conti = 1 ;
    if ( conti >= K ) count ++ ;
    previous = current ;
  }
  if ( K == 1 ) System . out . println ( N ) ;
  else System . out . println ( count ) ;
  return count ;
}
