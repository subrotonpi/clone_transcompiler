@ SkyFunction ( "dijkstraNextPerm" ) public static int [ ] dijkstraNextPerm ( final int [ ] iterable ) {
  final int [ ] result = new int [ iterable . length ] ;
  int N = result . length ;
  int i = result . length - 1 ;
  while ( result [ i - 1 ] >= iterable [ i ] ) {
    i -- ;
  }
  int j = N ;
  while ( result [ j - 1 ] <= iterable [ i - 1 ] ) {
    j -- ;
  }
  result [ i - 1 ] = iterable [ j - 1 ] ;
  i ++ ;
  j = N ;
  while ( i < j ) {
    result [ i - 1 ] = iterable [ j - 1 ] ;
    i ++ ;
    j -- ;
  }
  return result ;
}
