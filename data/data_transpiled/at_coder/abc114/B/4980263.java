public static int input ( ) {
  int min = 753 ;
  for ( int i = 0 ;
  i < S . length ( ) - 2 ;
  i ++ ) {
    if ( min > Math . abs ( Integer . parseInt ( S . substring ( i , i + 3 ) ) - 753 ) ) {
      min = Math . abs ( Integer . parseInt ( S . substring ( i , i + 3 ) ) - 753 ) ;
    }
  }
  System . out . println ( min ) ;
  return min ;
}
