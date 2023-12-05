@ rl public static void add ( int [ ] [ ] v , int [ ] [ ] newvalues , int ind , char x , char y ) {
  int d = x == '+' ? Integer . MIN_VALUE : - Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < v . length ;
  i ++ ) if ( ( v [ i ] [ ind ] != null && v [ i ] [ ind ] != null && v [ i ] [ ind ] != null && v [ i ] [ ind ] != null && v [ i ] [ ind ] != null && v [ i ] [ ind ] != null && v [ i ] [ ind ] . length > d ) || ( v [ i ] [ ind ] != null && v [ i ] [ ind ] != null && v [ i ] [ ind ] . length > d ) ) if ( v [ i ] [ ind ] != null && v [ i ] [ ind ] != null && v [ i ] [ ind ] . length < W - 1 ) add ( values [ i ] , newvalues , ( i , j ) , X [ i ] [ ind ] , X [ i ] [ ind ] ) ;
  int T = Integer . parseInt ( rl ( ) ) ;
  for ( int cas : xrange ( 1 , T + 1 ) ) {
    int W = Integer . parseInt ( rl ( ) ) ;
    int Q = Integer . parseInt ( rl ( ) ) ;
    int [ ] [ ] values = newvalues ;
    for ( int q : xrange ( W ) ) {
      System . arraycopy ( rl ( ) , 0 , values , i , W - 1 ) ;
      System . arraycopy ( rl ( ) , 0 , values , i , W - 1 ) ;
      System . arraycopy ( rl ( ) , 0 , values , i + 1 , W - 1 ) ;
      System . arraycopy ( rl ( ) , 0 , values , i , W - 1 ) ;
      System . arraycopy ( rl ( ) , 0 , values , i , W - 1 ) ;
      System . arraycopy ( rl ( ) , 0 , values , i + 1 , W - 1 ) ;
      System . arraycopy ( rl ( ) , 0 , values , i , W - 1 ) ;
      System . arraycopy ( rl ( ) , 0 , values , i , W - 1 , W - 1 ) ;
    }
    System . arraycopy ( rl ( ) , 0 , values , i , W - 1 ) ;
  }
}
