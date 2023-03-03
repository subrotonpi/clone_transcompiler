@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int P = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] zmat = new int [ M ] [ N ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    zmat [ x - 1 ] [ y - 1 ] = z ;
  }
  for ( int nc : combinations ) {
    int [ ] yz = new int [ nc ] ;
    for ( int ni : nc ) {
      yz [ ni ] = zmat [ ni ] ;
    }
    zmax = Math . max ( zmax , Arrays . stream ( yz ) . mapToInt ( Integer :: valueOf ) . sum ( ) . getAsInt ( ) ) ;
  }
  System . out . println ( zmax ) ;
  return zmax ;
}
