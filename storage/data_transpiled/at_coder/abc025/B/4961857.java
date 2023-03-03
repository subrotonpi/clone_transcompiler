public static int N ( int N , int A , int B ) {
  int total = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int s = input . nextInt ( ) ;
    int d = input . nextInt ( ) ;
    int i = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( s == "East" ) s = - 1 ;
    else s = 1 ;
    int move ;
    if ( d < A ) move = A ;
    else if ( A <= d && d <= B ) move = d ;
    else if ( B < d ) move = B ;
    total += move * s ;
  }
  if ( total < 0 ) System . out . println ( "East" + abs ( total ) ) ;
  else if ( total > 0 ) System . out . println ( "West" + abs ( total ) ) ;
  else System . out . println ( total ) ;
  return total ;
}
