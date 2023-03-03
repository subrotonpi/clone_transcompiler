public static void DFS ( int N , int M ) {
  List < List < Integer >> ab = new ArrayList < List < Integer >> ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ab . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  visited = new HashMap < Integer , Boolean > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    visited . put ( i , false ) ;
  }
  visited . put ( 0 , true ) ;
  int ans = 0 ;
  {
    int nextx [ ] = new int [ M ] ;
    if ( ! visited . values ( ) . contains ( false ) ) {
      ans ++ ;
      return ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      if ( ab . get ( i ) . contains ( x ) ) {
        int xcol = ab . get ( i ) . indexOf ( x ) ;
        if ( visited . get ( ab . get ( i ) . get ( 1 - xcol ) - 1 ) ) continue ;
        else nextx [ i ] = ab . get ( i ) . get ( 1 - xcol ) ;
      }
    }
    for ( int i = 0 ;
    i < nextx . length ;
    i ++ ) {
      visited . put ( nextx [ i ] - 1 , true ) ;
      DFS ( nextx [ i ] ) ;
      visited . put ( nextx [ i ] - 1 , false ) ;
    }
    return ;
  }
}
