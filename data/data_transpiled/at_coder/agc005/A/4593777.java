public static void input ( ) {
  int ans = 0 ;
  int cnt_s = 0 ;
  for ( char xx : x ) {
    if ( xx == 'T' ) {
      if ( cnt_s > 0 ) {
        cnt_s -- ;
      }
      else {
        ans += 2 ;
      }
    }
    else {
      cnt_s ++ ;
    }
  }
  System . out . println ( ans ) ;
}
