public static int m ( int n , int N ) {
  int res = N ;
  int tmp = N ;
  int g = 0 ;
  while ( true ) {
    int e = 0 ;
    boolean flag = false ;
    for ( int i = 0 ;
    i < tmp ;
    i ++ ) {
      g ++ ;
      if ( g == m ) {
        res += n ;
        g = 0 ;
        e += n ;
        flag = true ;
      }
    }
    if ( flag == false ) break ;
    tmp = e ;
  }
  System . out . println ( res ) ;
  return res ;
}
