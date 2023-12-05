static private int find ( int x , int [ ] par ) {
  if ( par [ x ] == x ) {
    return x ;
  }
  else {
    return find ( par [ x ] , par ) ;
  }
  /* unite */
  int x = find ( x , par ) ;
  int y = find ( y , par ) ;
  if ( x != y ) {
    if ( rank [ x ] < rank [ y ] ) {
      par [ x ] = y ;
    }
    else {
      par [ y ] = x ;
      if ( rank [ x ] == rank [ y ] ) {
        rank [ x ] ++ ;
      }
    }
  }
  /* same in case of input */
  Scanner input = new Scanner ( System . in ) ;
  int n = input . nextInt ( ) ;
  int k = input . nextInt ( ) ;
  int L = input . nextInt ( ) ;
  int [ ] rpar = new int [ n ] ;
  int [ ] tpar = new int [ n ] ;
  int [ ] rrank = new int [ n ] ;
  int [ ] trank = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rpar [ i ] = i ;
    tpar [ i ] = i ;
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    x = input . nextInt ( ) ;
    y = input . nextInt ( ) ;
    unite ( x - 1 , y - 1 , rpar , rrank ) ;
  }
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    x = input . nextInt ( ) ;
    y = input . nextInt ( ) ;
    unite ( x - 1 , y - 1 , tpar , trank ) ;
  }
  int [ ] num = new int [ n ] ;
  HashMap < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    num [ i ] = find ( i , rpar ) + find ( i , tpar ) * 10 * 6 ;
    if ( map . containsKey ( num [ i ] ) ) {
      map . put ( num [ i ] , 1 ) ;
    }
    else {
      map . put ( num [ i ] , 1 ) ;
    }
  }
  StringBuffer buf = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i != 0 ) {
      buf . append ( ' ' ) ;
    }
    buf