public static int dpPost ( int n , int [ ] list ) {
  int [ ] lstCost = new int [ n ] ;
  lstCost [ 0 ] = 0 ;
  lstCost [ 1 ] = Math . abs ( list [ 0 ] - list [ 1 ] ) ;
  for ( int i = 2 ;
  i < N ;
  i ++ ) {
    lstCost [ i ] = Math . min ( lstCost [ i - 2 ] + Math . abs ( list [ i - 2 ] - list [ i ] ) , lstCost [ i - 1 ] + Math . abs ( list [ i - 1 ] - list [ i ] ) ) ;
  }
  return lstCost [ 0 ] ;
}
