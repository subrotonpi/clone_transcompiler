public static void print ( int N ) {
  int [ ] a = new int [ N ] ;
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    a [ x ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int max = Integer . MAX_VALUE ;
  int ans ;
  if ( ( max % 10 != 0 ) && ( a [ max ] > 0 ) ) {
    ans = max ;
  }
  else {
    ans = 10000000 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ( a [ i ] > 0 ) && ( a [ i ] > 0 ) ) {
      ans = a [ i ] ;
    }
  }
  ans = 10000000 ;
}
