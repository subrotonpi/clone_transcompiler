@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> x = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < x . size ( ) ;
  i ++ ) {
    if ( x . get ( i ) . stream ( ) . noneMatch ( l [ i ] -> l [ i ] == 1 ) || x . get ( i ) . stream ( ) . noneMatch ( l [ i ] -> l [ i ] == 2 ) || x . get ( i ) . stream ( ) . noneMatch ( l [ i ] -> l [ i ] == 3 ) ) {
      continue ;
    }
    int tmpa = 0 ;
    int tmpb = 0 ;
    int tmpc = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( x . get ( i ) . get ( j ) == 1 ) tmpa += l [ j ] ;
      if ( x . get ( i ) . get ( j ) == 2 ) tmpb += l [ j ] ;
      if ( x . get ( i ) . get ( j ) == 3 ) tmpc += l [ j ] ;
    }
    int tmpans = Math . abs ( a - tmpa ) + Math . abs ( b - tmpb ) + Math . abs ( c - tmpc ) ;
    tmpans += ( x . get ( i ) . get ( j ) - 1 ) * 10 + ( x . get ( i ) . get ( j ) - 1 ) * 10 + ( x . get ( i ) . get ( j ) - 1 ) * 10 + ( x . get ( i ) . get ( j ) - 1 ) * 10 ;
    ans = Math . min ( ans , tmpans ) ;
  }
  System . out . println ( ans ) ;
  return x ;
}
