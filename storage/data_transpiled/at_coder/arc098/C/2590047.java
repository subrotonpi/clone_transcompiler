public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int Q = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  List < Integer > R = new ArrayList < Integer > ( ) ;
  R . add ( new Integer ( A . get ( i ) ) ) ;
  int ans = 10 * 9 ;
  for ( int i = 0 ;
  i < R . size ( ) ;
  i ++ ) {
    List < Integer > temp = new ArrayList < Integer > ( ) ;
    List < Integer > temp2 = new ArrayList < Integer > ( ) ;
    int l = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( A . get ( j ) < R . get ( i ) ) {
        if ( l >= K ) temp . addAll ( new ArrayList < Integer > ( temp2 ) . subList ( 0 , Math . min ( l , Math . max ( 0 , l - K + 1 ) ) ) ) ;
        temp2 = new ArrayList < Integer > ( ) ;
        l = 0 ;
      }
      else temp2 . add ( A . get ( j ) ) ;
      l ++ ;
    }
    if ( l >= K ) temp . addAll ( temp2 ) ;
    if ( temp . size ( ) > Q - 1 ) {
      temp . clear ( ) ;
      ans = Math . min ( ans , temp . get ( Q - 1 ) - R . get ( i ) ) ;
    }
    else break ;
  }
  System . out . println ( ans ) ;
}
