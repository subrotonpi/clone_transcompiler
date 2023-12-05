public static int [ ] nums ( ) {
  int [ ] anss = new int [ Integer . parseInt ( input ( ) ) ] ;
  for ( int i = 1 ;
  i <= Integer . MAX_VALUE ;
  i ++ ) {
    int count = 0 ;
    while ( i % 2 == 0 ) {
      i /= 2 ;
      count ++ ;
    }
    anss [ i ] = count ;
  }
  return anss . length ;
}
