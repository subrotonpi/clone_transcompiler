public static void print ( int N ) {
  int [ ] lst_a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lst_a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 1 ;
  int left = 1 ;
  for ( int right = 1 ;
  right < N ;
  right ++ ) {
    if ( lst_a [ right - 1 ] < lst_a [ right ] ) {
      left ++ ;
    }
    else {
      left = 1 ;
    }
    ans += left ;
  }
  System . out . println ( ans ) ;
}
