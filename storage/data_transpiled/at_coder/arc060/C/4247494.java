@ VisibleForTesting static int search ( int x , int y ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] r = new int [ 18 ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      r [ 0 ] [ j ] = Arrays . binarySearch ( x , x [ j ] + l ) - 1 ;
    }
  }
  for ( int i = 1 ;
  i < 18 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      r [ i ] [ j ] = r [ i - 1 ] [ r [ i - 1 ] [ j ] ] ;
    }
  }
  return x ;
}
