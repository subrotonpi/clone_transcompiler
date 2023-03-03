public static int [ ] [ ] getMatrix ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] b = new int [ n - 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  int [ ] [ ] mat = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) mat [ i ] [ i ] = 0 ;
  for ( int idx = 0 ;
  idx < b . length ;
  idx ++ ) mat [ idx ] [ idx ] = b [ idx ] ;
  return mat ;
}
