public static int [ ] getMoves ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int moves = 0 ;
  int previous = 0 ;
  boolean exists = true ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( a [ 0 ] != 0 ) {
    exists = false ;
  }
  for ( int i = N - j - 1 ;
  i >= 0 ;
  i -- ) {
    if ( a [ i ] >= previous ) {
      moves += a [ i ] ;
    }
    else if ( a [ i ] < previous - 1 ) {
      exists = false ;
    }
    previous = a [ i ] ;
  }
  if ( exists == false ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( moves ) ;
  }
  return a ;
}
