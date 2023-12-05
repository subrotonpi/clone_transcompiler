public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int counter = 0 ;
  boolean roopFlag = true ;
  while ( roopFlag ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( a [ i ] % 2 != 0 ) {
        roopFlag = false ;
        break ;
      }
      else {
        a [ i ] = a [ i ] / 2 ;
      }
    }
  }
  return counter ;
}
