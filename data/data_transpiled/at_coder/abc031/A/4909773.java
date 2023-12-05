public static void main ( String input ) {
  int A = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int D = Integer . parseInt ( input ) ;
  if ( A <= D ) {
    A ++ ;
  }
  else {
    D ++ ;
  }
  System . out . println ( ( int ) ( A * D ) ) ;
}
