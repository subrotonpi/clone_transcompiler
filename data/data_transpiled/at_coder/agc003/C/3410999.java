static final int [ ] binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = new ArrayList < > ( ) ;
  List < Integer > e = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n / 2 ;
  i ++ ) {
    int j = Integer . parseInt ( input . nextLine ( ) ) ;
    e . add ( j ) ;
    l . add ( j ) ;
    j = Integer . parseInt ( input . nextLine ( ) ) ;
    l . add ( j ) ;
  }
  if ( n % 2 == 1 ) {
    int j = Integer . parseInt ( input . nextLine ( ) ) ;
    e . add ( j ) ;
    l . add ( j ) ;
  }
  Collections . sort ( l ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i += 2 ) {
    if ( e . get ( Math . min ( e . size ( ) - 1 , binarySearch ( e , l . get ( i ) ) ) != l . get ( i ) ) ) {
      res ++ ;
    }
  }
  return res ;
}
