@ VisibleForTesting static void heapSort ( ) {
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . print ( "Case #" + ( i + 1 ) + ":" ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    t = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      t [ j ] = new int [ s ] ;
    }
    /* dist2 between the first and the second */
    t [ 0 ] = new int [ n ] ;
    t [ 1 ] = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      t [ j ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    /* dist2 between the first and the second */
    t [ 2 ] = new int [ n ] ;
    t [ 3 ] = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      t [ 4 ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    /* dist2 between the first and the second */
    t [ 4 ] = new int [ n ] ;
    t [ 4 ] = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      t [ 4 ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    /* dist2 between the first and the second */
    t [ 4 ] = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      t [ 4 ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  seen [ 0 ] = true ;
  maxd = 0 ;
  closest = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    closest [ i ] = new int [ n ] ;
    closest [ i ] = new int [ n ] ;
    closest [ i ] = new int [ n ] ;
    closest [ i ] [ j ] = new int [ n ] ;
  }
  while ( true ) {
    int dd = Math . min ( i , j ) ;
    