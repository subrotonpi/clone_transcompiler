public static void process ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] inputs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  {
    int left = 0 ;
    int right = 0 ;
    int ans = 1 ;
    while ( right < N - 1 ) {
      while ( inputs [ right ] < inputs [ right + 1 ] ) {
        process ( ) ;
      }
      while ( inputs [ right ] > inputs [ right + 1 ] ) {
        process ( ) ;
      }
      ans = Math . max ( ans , right - left + 1 ) ;
      left = right ++ ;
    }
  }
}
