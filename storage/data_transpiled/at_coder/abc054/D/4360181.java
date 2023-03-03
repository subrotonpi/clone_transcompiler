public static void push ( int k , int v ) {
  if ( dic . containsKey ( k ) ) {
    dic . put ( k , Math . min ( dic . get ( k ) , v ) ) ;
  }
  else {
    dic . put ( k , v ) ;
  }
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  dic . clear ( ) ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int [ ] a = new int [ 3 ] ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      a [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    k = a [ 0 ] * y - a [ 1 ] * x ;
    v = a [ 2 ] ;
    int [ ] [ ] l = new int [ 3 ] [ 4 ] ;
    for ( int j = 0 ;
    j < dic . size ( ) ;
    j ++ ) {
      l [ j ] [ 0 ] = dic . get ( j ) ;
      l [ j ] [ 1 ] = dic . get ( j ) ;
    }
    for ( int jj = 0 ;
    jj < l . length ;
    jj ++ ) {
      push ( l [ jj ] [ 0 ] + k , l [ jj ] [ 1 ] + v ) ;
    }
    push ( k , v ) ;
  }
  if ( 0 == dic . size ( ) ) {
    System . out . println ( dic . get ( 0 ) ) ;
  }
  else {
    System . out . println ( "-1" ) ;
  }
}
