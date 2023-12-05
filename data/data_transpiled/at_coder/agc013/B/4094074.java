@ VisibleForTesting static int [ ] [ ] createArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] e = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    e [ a ] [ b ] = b ;
    e [ b ] [ a ] = a ;
  }
  int [ ] ans = new int [ N ] ;
  Arrays . sort ( ans ) ;
  return ans ;
}
