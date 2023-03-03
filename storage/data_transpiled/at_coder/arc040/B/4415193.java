public static int parseInt ( String input ) {
  int N = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int R = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  StringBuilder sb = new StringBuilder ( input ) ;
  int remain = sb . length ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N - R + 1 ;
  i ++ ) {
    int notPainted = sb . length ( ) ;
    if ( remain == 0 ) {
      break ;
    }
    if ( remain == notPainted ) {
      ans ++ ;
      break ;
    }
    if ( sb . charAt ( i ) == '.' ) {
      for ( int j = i ;
      j < i + R ;
      j ++ ) {
        sb . setCharAt ( j , 'o' ) ;
      }
      remain -= notPainted ;
      ans ++ ;
    }
    ans ++ ;
  }
  return ans ;
}
