public static void paint ( int N , int M ) {
  int [ ] [ ] Adj = new int [ N + 1 ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) Adj [ i ] = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    Adj [ a ] [ i ] = b ;
    Adj [ b ] [ i ] = a ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] v = new int [ Q ] , d = new int [ Q ] , c = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) v [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) d [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] memo = new int [ N + 1 ] [ M + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    memo [ i ] [ 0 ] = 0 ;
  }
  /* paint v */
  if ( memo [ v ] [ d ] != 0 ) return ;
  memo [ v ] [ d ] = i ;
  if ( d == 0 ) return ;
  paint ( v , d - 1 , i ) ;
  for ( int u : Adj [ v ] ) paint ( u , d - 1 , i ) ;
  for ( int q = Q - 1 ;
  q >= 0 ;
  q -- ) paint ( v [ q ] , d [ q ] , q + 1 ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( memo [ i ] [ 0 ] != 0 ) System . out . println ( c [ memo [ i ] [ 0 ] - 1 ] ) ;
    else System . out . println ( 0 ) ;
  }
}
