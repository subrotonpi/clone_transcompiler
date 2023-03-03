@ SafeVarargs public static void heapify ( String ... strings ) {
  int n = Integer . parseInt ( input ( strings [ 0 ] ) ) ;
  int m = Integer . parseInt ( input ( strings [ 1 ] ) ) ;
  int cou = Integer . parseInt ( input ( strings [ 2 ] ) ) ;
  cou -- ;
  int [ ] [ ] g = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) g [ i ] = new int [ m ] ;
  for ( int k = 0 ;
  k < m ;
  k ++ ) {
    int a = Integer . parseInt ( input ( strings [ k ] ) ) ;
    int b = Integer . parseInt ( input ( strings [ k ] ) ) ;
    a -- ;
    b -- ;
    g [ a ] [ b ] = b ;
    g [ b ] [ a ] = a ;
  }
  List < Integer > lis = new ArrayList < Integer > ( ) ;
  int [ ] ds = new int [ n ] ;
  heapify ( lis , - cou , cou ) ;
  ds [ cou ] = cou ;
  while ( lis . size ( ) > 0 ) {
    int w = heapify ( lis . get ( ) ) ;
  }
}
