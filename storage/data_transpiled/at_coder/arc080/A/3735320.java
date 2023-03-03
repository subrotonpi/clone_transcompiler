public static int N = Integer . parseInt ( input ) {
  int n1 = 0 , n2 = 0 , n4 = 0 ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    if ( Integer . parseInt ( input . substring ( i , i + 1 ) ) % 4 == 0 ) {
      n4 ++ ;
    }
    else if ( Integer . parseInt ( input . substring ( i , i + 1 ) ) % 2 == 0 ) {
      n2 ++ ;
    }
    else {
      n1 ++ ;
    }
  }
  if ( n2 == 0 ) {
    if ( n4 >= n1 - 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    if ( n4 >= n1 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  return n1 ;
}
