public static int D = Integer . parseInt ( input ) {
  int G = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > p = new HashMap < Integer , Integer > ( ) , c = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 1 ;
  i <= D ;
  i ++ ) {
    int pi = Integer . parseInt ( input . nextLine ( ) ) ;
    int ci = Integer . parseInt ( input . nextLine ( ) ) ;
    p . put ( i , pi ) ;
    c . put ( i , ci ) ;
  }
  int ans = Integer . valueOf ( p . values ( ) . length ) ;
  for ( int i = 0 ;
  i < 2 * D ;
  i ++ ) {
    Map < Integer , Boolean > cmp = new HashMap < Integer , Boolean > ( ) ;
    for ( int j = 1 ;
    j <= D ;
    j ++ ) {
      if ( ( i >> j ) & 1 != 0 ) {
        cmp . put ( j + 1 , true ) ;
        score += ( j + 1 ) * 100 * p . get ( j + 1 ) + c . get ( j + 1 ) ;
        ans_tmp += p . get ( j + 1 ) ;
      }
    }
    List < Integer > keys = new ArrayList < Integer > ( ) ;
    for ( Map . Entry < Integer , Boolean > entry : cmp . entrySet ( ) ) {
      if ( entry . getValue ( ) == false ) {
        keys . add ( entry . getKey ( ) ) ;
      }
    }
    if ( G > score && keys . size ( ) > 0 ) {
      if ( ( G - score ) / ( max ( keys ) * 100 ) <= p . get ( max ( keys ) ) ) {
        ans_tmp += ( G - score ) / ( max ( keys ) * 100 ) ;
        if ( ( G - score ) % ( max ( keys ) * 100 ) != 0 ) ans_tmp ++ ;
      }
      else ans_tmp = Integer . valueOf ( p . values ( ) . length ) ;
    }
    ans = Math . min ( ans , ans_tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
