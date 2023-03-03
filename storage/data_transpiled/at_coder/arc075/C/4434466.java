static final int [ ] getBinaryArray ( int n ) {
  Scanner input = new Scanner ( System . in ) ;
  int [ ] bit = new int [ n + 1 ] ;
  int ass = 0 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    bit [ j ] = input . nextInt ( ) ;
  }
  {
    int s = 0 ;
    while ( i > 0 ) {
      s += bit [ j ] ;
      i -= bit [ j ] & ( - i ) ;
    }
  }
  {
    int i = 0 ;
    while ( i <= n ) {
      bit [ i ] += x ;
      i += bit [ i ] & ( - i ) ;
    }
  }
  {
    int n = input . nextInt ( ) ;
    int k = input . nextInt ( ) ;
    int [ ] a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] b = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) b [ i ] = b [ i ] - k * i ;
    Arrays . sort ( b ) ;
    Arrays . sort ( b ) ;
  }
  return bit ;
}
