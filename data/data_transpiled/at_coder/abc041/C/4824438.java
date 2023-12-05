public static void print ( int n ) {
  int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] X = new int [ n ] [ n ] ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    X [ k ] [ 0 ] = A [ k ] ;
    X [ k ] [ 1 ] = A [ k ] [ 1 ] ;
  }
  Arrays . sort ( X ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( X [ i ] [ 0 ] + 1 ) ;
  }
}
