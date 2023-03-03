private static int [ ] [ ] map ( Scanner input ) {
  int n = input . nextInt ( ) , m = input . nextInt ( ) ;
  int [ ] [ ] cnt = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cnt [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    a -- ;
    b -- ;
    cnt [ a ] ++ ;
    cnt [ b ] ++ ;
  }
  for ( int i : cnt ) {
    System . out . println ( i ) ;
  }
  return cnt ;
}
