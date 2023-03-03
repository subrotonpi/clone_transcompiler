private static void input ( int n , int m ) {
  Map < Integer , List < Integer >> datas = Maps . newHashMap ( ) ;
  Map < Integer , List < Integer >> friends = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    datas . put ( i + 1 , new ArrayList < > ( ) ) ;
    friends . put ( i + 1 , new ArrayList < > ( ) ) ;
  }
  for ( int r = 0 ;
  r < m ;
  r ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    datas . get ( a ) . add ( b ) ;
    datas . get ( b ) . add ( a ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    List < Integer > removements = Lists . newArrayList ( ) ;
    removements . add ( i ) ;
    for ( int j = 0 ;
    j < datas . get ( i ) . size ( ) ;
    j ++ ) {
      for ( int k = 0 ;
      k < datas . get ( j ) . size ( ) ;
      k ++ ) {
        if ( ! friends . get ( i ) . contains ( k ) && ! removements . contains ( k ) ) {
          friends . get ( i ) . add ( k ) ;
        }
      }
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( friends . get ( i + 1 ) . size ( ) ) ;
  }
}
