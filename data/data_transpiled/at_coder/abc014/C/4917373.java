public static void print ( int n ) {
  int [ ] als = new int [ n ] ;
  int [ ] bls = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    als [ i ] = a ;
    bls [ i ] = b ;
  }
  Arrays . sort ( als ) ;
  Arrays . sort ( bls ) ;
  Arrays . sort ( als ) ;
  Arrays . sort ( bls ) ;
  int ai = 0 , bi = 0 , current = 0 ;
  int [ ] lis = new int [ n * 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( als [ ai ] <= bls [ bi ] ) ) {
      current ++ ;
      ai ++ ;
    }
    else {
      current -- ;
      bi ++ ;
    }
    lis [ i ] = current ;
  }
  System . out . println ( max ( lis ) ) ;
}
