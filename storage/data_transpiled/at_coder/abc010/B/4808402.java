public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( a [ i ] % 2 ) == 0 ) {
      if ( a [ i ] % 6 == 0 ) {
        isum += 3 ;
      }
      else {
        isum += 1 ;
      }
    }
    else if ( a [ i ] % 3 == 2 ) {
      isum += 2 ;
    }
  }
  System . out . println ( isum ) ;
}
