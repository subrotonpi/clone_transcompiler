public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  int c = 0 ;
  int p = Arrays . binarySearch ( a , n ) ;
  if ( p % 10 != 0 ) {
    System . out . println ( p ) ;
  }
  else {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( a [ i ] % 10 != 0 ) {
        break ;
      }
      else {
        c ++ ;
      }
    }
    System . out . println ( c == n ? 0 : p - a [ i ] ) ;
  }
}
