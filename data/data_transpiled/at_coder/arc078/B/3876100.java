public static int [ ] bfs ( int [ ] [ ] graph , int start , int n , boolean check ) {
  int [ ] arrival ;
  if ( check == false ) {
    arrival = new int [ n + 1 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) arrival [ i ] = 0 ;
  }
  else {
    arrival = new int [ n + 1 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) arrival [ check ] = i ;
  }
  List < Integer > q = new ArrayList < > ( ) ;
  q . add ( start ) ;
  arrival [ start ] = 1 ;
  while ( q . size ( ) != 0 ) {
    for ( int i = 0 ;
    i < graph [ q . get ( 0 ) ] . length ;
    i ++ ) {
      if ( arrival [ graph [ q . get ( 0 ) ] [ i ] ] == 0 ) {
        q . add ( graph [ q . get ( 0 ) ] [ i ] ) ;
        arrival [ graph [ q . get ( 0 ) ] [ i ] ] = arrival [ q . get ( 0 ) ] + 1 ;
      }
    }
    q . remove ( 0 ) ;
  }
  n = Integer . parseInt ( input ( ) ) ;
  graph = Maps . newHashMap ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) graph . put ( i , new int [ n ] ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    graph [ a ] [ i ] = b ;
    graph [ b ] [ i ] = a ;
  }
  int [ ] fstart = bfs ( graph , 1 , n , false ) ;
  int [ ] sstart = bfs ( graph , n , n , false ) ;
  int fennec = 0 ;
  int snuke = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( Math . abs ( fstart [ i ] - fstart [ 1 ] ) <= Math . abs ( sstart [ i ] - sstart [ n ] ) ) fennec ++ ;
    else snuke ++ ;
  }
  if ( fennec > snuke ) System . out . println ( "Fennec" ) ;
  else System . out . println ( "Snuke" ) ;
  