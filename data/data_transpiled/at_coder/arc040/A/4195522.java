public static String aPaint ( int N , String [ ] [ ] S ) {
  int takahashi = 0 , aoki = 0 ;
  for ( String [ ] row : S ) {
    for ( char c : row ) {
      if ( c == 'R' ) {
        takahashi ++ ;
      }
      else if ( c == 'B' ) {
        aoki ++ ;
      }
    }
  }
  if ( takahashi > aoki ) {
    String ans = "TAKAHASHI" ;
  }
  else if ( takahashi == aoki ) {
    ans = "DRAW" ;
  }
  else {
    ans = "AOKI" ;
  }
  return ans ;
}
