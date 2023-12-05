public static boolean checkTable ( int shift ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] A = new char [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = input . charAt ( i ) ;
  }
  char [ ] A_t = new char [ n ] ;
  for ( char c : A ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      A_t [ i ] += c ;
    }
  }
  /*checkTable*/
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( A_t [ ( i + shift ) % n ] != A [ i ] + A [ i ] . charAt ( shift ) ) {
      return false ;
    }
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( checkTable ( i ) ) {
      count ++ ;
    }
  }
  System . out . println ( count * n ) ;
  return true ;
}
