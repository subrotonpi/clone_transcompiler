public static int input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int R = Integer . parseInt ( input . readLine ( ) ) ;
  StringBuilder sb = new StringBuilder ( ) ;
  sb . append ( input ) ;
  int notPainted = sb . length ( ) ;
  int ans = 0 ;
  if ( notPainted != 0 ) {
    for ( int i = 0 ;
    i < N - R + 1 ;
    i ++ ) {
      int targetCounts = sb . length ( ) ;
      if ( notPainted == targetCounts ) {
        ans ++ ;
        break ;
      }
      if ( sb . charAt ( i ) == '.' ) {
        for ( int j = i ;
        j < i + R ;
        j ++ ) {
          sb . setCharAt ( j , 'o' ) ;
        }
        notPainted -= targetCounts ;
        ans ++ ;
      }
      ans ++ ;
    }
  }
  return ans ;
}
