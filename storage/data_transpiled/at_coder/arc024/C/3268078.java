public static boolean solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  String S = input . nextLine ( ) . trim ( ) ;
  /* ctoi = (char) - 'a' */
  int i ;
  /* solve if K*2 > N */
  int [ ] ctr = new int [ 26 ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) ctr [ i ] = 0 ;
  HashMap < Integer , Integer > hs = new HashMap < Integer , Integer > ( ) ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    ctr [ i ] = 0 ;
    hs . put ( i , 0 ) ;
  }
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    ctr [ i ] += 1 ;
    if ( i < K - 1 ) continue ;
    if ( i >= K ) ctr [ i ] -= 1 ;
    int st = i - K + 1 ;
    int h = hash ( new Object ( ) . hashCode ( ) ) ;
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
