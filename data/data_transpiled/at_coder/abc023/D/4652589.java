public static void main ( String [ ] args ) throws IOException {
  int n = Integer . parseInt ( new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ) ;
  int ... b = Integer . parseInt ( new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ) ;
  int ok = 10 * 18 ;
  int ng = - 1 ;
  while ( Math . abs ( ok - ng ) > 1 ) {
    int mid = ( ok + ng ) / 2 ;
    int [ ] a = new int [ n + 2 ] ;
    boolean f = true ;
    for ( int h = 0 , s = b . length ;
    h < s ;
    h ++ ) {
      int i = ( mid - h ) / s ;
      if ( i < 0 ) {
        f = false ;
        break ;
      }
      a [ Math . min ( i , n ) ] ++ ;
    }
    for ( int i = 0 ;
    i < n + 1 ;
    i ++ ) {
      a [ i ] += a [ i - 1 ] ;
      if ( a [ i ] > i + 1 ) {
        f = false ;
        break ;
      }
    }
    if ( f ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  System . out . println ( ok ) ;
}
