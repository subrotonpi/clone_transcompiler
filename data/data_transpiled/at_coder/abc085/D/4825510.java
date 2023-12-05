static final int [ ] binarySearch ( int n , int h ) {
  int [ ] aS = new int [ n ] , bS = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    aS [ i ] = a ;
    bS [ i ] = b ;
  }
  Arrays . sort ( aS ) ;
  Arrays . sort ( bS ) ;
  int throwable = Arrays . binarySearch ( bS , aS [ bS . length - 1 ] ) ;
  int throwSum = bS [ throwable ] ;
  int ans = 0 ;
  for ( int i = throwable ;
  i > 0 ;
  i -- ) {
    h -= i ;
    ans ++ ;
    if ( h <= 0 ) {
      System . out . println ( ans ) ;
      exit ( ) ;
    }
  }
  return ans ;
}
