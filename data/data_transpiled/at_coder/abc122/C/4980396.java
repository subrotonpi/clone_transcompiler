public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int q = Integer . parseInt ( input ) ;
  String s = input ;
  int [ ] [ ] lr = new int [ q ] [ 2 ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) lr [ i ] = new int [ 2 ] ;
  for ( int i = 0 ;
  i < lr . length ;
  i ++ ) for ( int j = 0 ;
  j < 2 ;
  j ++ ) lr [ i ] [ j ] -- ;
  int [ ] acCnt = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) acCnt [ i ] = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) acCnt [ i + 1 ] = acCnt [ i ] + ( s . substring ( i , i + 2 ) . equals ( "AC" ) ? 1 : 0 ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) System . out . println ( acCnt [ lr [ i ] [ 1 ] ] - acCnt [ lr [ i ] [ 0 ] ] ) ;
}
