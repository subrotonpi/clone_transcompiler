public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    d [ i ] = Integer . parseInt ( input ) ;
  }
  if ( n != 1 && ( n == 2 || n == 3 || n == 5 || ( d [ d . length - 1 ] % 2 != 0 && d [ d . length - 1 ] != 5 && Arrays . binarySearch ( d , n ) % 3 != 0 ) ) ) {
    System . out . println ( "Prime" ) ;
  }
  else {
    System . out . println ( "Not Prime" ) ;
  }
}
