public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  char [ ] [ ] ans = new char [ 50 ] [ 50 ] ;
  for ( int i = 0 ;
  i < 50 ;
  i += 2 ) {
    for ( int j = 0 ;
    j < 100 ;
    j += 2 ) {
      if ( A > 1 ) {
        ans [ i ] [ j ] = '#' ;
        A -- ;
      }
    }
  }
  for ( int i = 51 ;
  i < 100 ;
  i += 2 ) {
    for ( int j = 0 ;
    j < 100 ;
    j += 2 ) {
      if ( B > 1 ) {
        ans [ i ] [ j ] = '#' ;
        B -- ;
      }
    }
  }
  System . out . println ( 100 + " " + 100 ) ;
  for ( char [ ] row : ans ) {
    System . out . print ( ( char ) row [ 0 ] ) ;
  }
  return 0 ;
}
