public static boolean solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  String S = input . nextLine ( ) . trim ( ) ;
  /* ctoi = (char) - 'a' */
  /* solve if K*2 > N */
  int [ ] ctr = new int [ 26 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ctr [ i ] = 0 ;
  }
  HashMap < String , Integer > hs = new HashMap < String , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ctr [ ctoi ( S . charAt ( i ) ) ] ++ ;
    if ( i < K - 1 ) continue ;
    if ( i >= K ) ctr [ ctoi ( S . charAt ( i - K ) ) ] -- ;
    String h = new String ( ctr ) ;
    int st = i - K + 1 ;
    if ( hs . containsKey ( h ) ) {
      if ( hs . get ( h ) + K <= st ) return true ;
    }
    else hs . put ( h , st ) ;
  }
  /* if (solve) */
  if ( solve ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return false ;
}
