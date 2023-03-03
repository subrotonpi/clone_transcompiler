public static int [ ] [ ] getSortedList ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] d = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) d [ i ] = Integer . parseInt ( input . nextLine ( ) . replaceAll ( " " , "" ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = new int [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  BiFunction < Integer , Integer , Integer > darea = ( i , j , ii , jj ) -> r [ i ] [ j ] - r [ ii + 1 ] [ j ] - r [ i ] [ jj + 1 ] + r [ ii + 1 ] [ jj + 1 ] ;
  int [ ] [ ] r = new int [ n + 1 ] [ n + 1 ] ;
  for ( int __ = 0 ;
  __ < n + 1 ;
  __ ++ ) r [ n ] [ __ ] = 0 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  -- i ) for ( int j = n - 1 ;
  j >= 0 ;
  -- j ) r [ i ] [ j ] = d [ i ] [ j ] + r [ i + 1 ] [ j ] + r [ i ] [ j + 1 ] - r [ i + 1 ] [ j + 1 ] ;
  int [ ] [ ] dmax = new int [ n * n + 1 ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) for ( int j = 0 ;
  j < n ;
  j ++ ) for ( int ii = i ;
  ii < n ;
  ii ++ ) for ( int jj = j ;
  jj < n ;
  jj ++ ) {
    int num = ( ii - i + 1 ) * ( jj - j + 1 ) ;
    int [ ] d = darea . apply ( i , j , ii , jj ) ;
    if ( dmax [ num ] < d ) dmax [ num ] = d ;
  }
  int m = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( m > dmax [ i ] ) dmax [ i ] = m ;
    else m = dmax [ i ] ;
  }
  for (