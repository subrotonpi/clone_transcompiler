static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int result = "complete" ;
  int x = N ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( x <= A ) x += B ;
    x -= c [ i ] ;
    if ( x < 0 ) {
      result = i + 1 ;
      break ;
    }
  }
  System . out . println ( result ) ;
  return result ;
}
