public static int input ( ) {
  int ans = 0 ;
  int cnt = 0 ;
  for ( char a : s ) {
    if ( a == 'S' ) {
      cnt ++ ;
    }
    else {
      if ( cnt > 0 ) {
        cnt -- ;
      }
      else {
        ans ++ ;
      }
    }
  }
  return ans + cnt ;
}
