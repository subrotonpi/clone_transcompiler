{
  T [ 0 ] = 0 ;
  int t = 2 ;
  int [ ] A = new int [ 60 ] ;
  int a = 1 ;
  for ( int i = 0 ;
  i < 60 ;
  i ++ ) {
    T [ i ] = t ;
    A [ i ] = a ;
    t *= 2 ;
    t ++ ;
    t *= 2 ;
    a *= 2 ;
    a ++ ;
    a *= 2 ;
  }
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Integer . numberOfLeadingZeros ( n ) % 2 == 0 ) {
    if ( T [ ( Integer . numberOfLeadingZeros ( n ) - 2 ) / 2 ] > n ) {
      System . out . println ( "Aoki" ) ;
    }
    else {
      System . out . println ( "Takahashi" ) ;
    }
  }
  else {
    if ( A [ ( Integer . numberOfLeadingZeros ( n ) - 2 ) / 2 ] > n ) {
      System . out . println ( "Takahashi" ) ;
    }
    else {
      System . out . println ( "Aoki" ) ;
    }
  }
  return T [ n ] ;
}
