public static void main ( String [ ] s ) {
  s = input . nextLine ( ) . split ( " " ) ;
  int A = Integer . parseInt ( s [ 0 ] ) ;
  int B = Integer . parseInt ( s [ 1 ] ) ;
  if ( A % B == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else if ( A % B != 0 ) {
    System . out . println ( "NO" ) ;
  }
}
