public static void main ( String [ ] args ) throws IOException {
  /* solve mid */
  int [ ] a = new int [ n * 2 ] ;
  for ( int h = 0 , s = b . length ;
  h < s ;
  h ++ ) {
    int i = ( b [ h ] - b [ s ] ) / 2 ;
    if ( i < 0 ) {
      return ;
    }
    a [ Math . min ( i , n ) ] ++ ;
  }
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    a [ i ] += a [ i - 1 ] ;
    if ( a [ i ] > i + 1 ) {
      return ;
    }
  }
  /* solve mid */
  int n = Integer . parseInt ( new String ( new BufferedReader ( new InputStreamReader ( new FileInputStream ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( new File ( ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ;
  int ok = 10 * 18 ;
  int ng = - 1 ;
  while ( Math . abs ( ok - ng ) > 1 ) {
    int mid = ( ok + ng ) / 2 ;
    if ( solve ( mid ) ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  System . out . println ( ok ) ;
}
