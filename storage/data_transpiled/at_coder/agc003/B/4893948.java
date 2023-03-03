public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int b = 0 ;
  int c = 0 ;
  for ( int i : a ) {
    if ( i != 0 ) c += i ;
    else {
      b += c / 2 ;
      c = 0 ;
    }
  }
  System . out . println ( b + c / 2 ) ;
}
