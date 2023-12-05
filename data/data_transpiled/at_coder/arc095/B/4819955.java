static final int binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int b = a [ a . length - 1 ] / 2 ;
  int i = Arrays . binarySearch ( a , b ) ;
  if ( a [ i ] - b < b - a [ i - 1 ] ) {
    System . out . println ( a [ i - 1 ] + " " + a [ i ] ) ;
  }
  else {
    System . out . println ( a [ i - 1 ] + " " + a [ i - 1 ] ) ;
  }
  return i ;
}
