public static int N ( ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int count = 0 ;
  for ( int i : a ) {
    int j = 2 ;
    while ( i != 0 ) {
      if ( i % j == 0 ) {
        count ++ ;
        i /= 2 ;
      }
      else {
        break ;
      }
    }
  }
  return count ;
}
