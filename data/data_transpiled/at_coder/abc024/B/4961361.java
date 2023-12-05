public static int N ( int N , int T ) {
  int start = Integer . parseInt ( input . nextLine ( ) ) ;
  int end = start + T ;
  int total = T ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    start = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( start < end ) total += T - ( end - start ) ;
    else total += T ;
    end = start + T ;
  }
  System . out . println ( total ) ;
  return total ;
}
