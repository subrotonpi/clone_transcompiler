public static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int counter = 0 ;
  int i = 0 ;
  while ( i < N - 1 ) {
    if ( ( i < N - 2 ) && ( a [ i ] == a [ i + 1 ] ) ) {
      counter ++ ;
      i ++ ;
    }
    else if ( ( a [ i ] == a [ i + 1 ] ) ) {
      counter ++ ;
    }
    i ++ ;
  }
  return a ;
}
