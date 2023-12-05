public static void main ( String input ) {
  int a = Integer . parseInt ( input . split ( " " ) [ 0 ] ) , b = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  for ( int i = 1 ;
  i < 13 ;
  i ++ ) {
    if ( a > b ) {
      ans = a - 1 ;
    }
    else {
      ans = a ;
    }
  }
  System . out . println ( ans ) ;
}
