public static void main ( String [ ] input ) {
  int H1 = Integer . parseInt ( input [ 0 ] ) , W1 = Integer . parseInt ( input [ 1 ] ) ;
  int H2 = Integer . parseInt ( input [ 2 ] ) , W2 = Integer . parseInt ( input [ 3 ] ) ;
  boolean flag = false ;
  if ( H1 == H2 ) flag = true ;
  if ( H1 == W2 ) flag = true ;
  if ( W1 == H2 ) flag = true ;
  if ( W1 == W2 ) flag = true ;
  if ( flag ) System . out . println ( "YES" ) ;
  else System . out . println ( "NO" ) ;
}
