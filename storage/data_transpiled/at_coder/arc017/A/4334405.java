@ Sys public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( args [ 0 ] ) ;
  boolean flag = false ;
  for ( int i = 2 ;
  i < N ;
  i ++ ) {
    if ( N % i == 0 ) {
      flag = true ;
      break ;
    }
  }
  if ( flag == 0 ) System . out . println ( "YES" ) ;
  else System . out . println ( "NO" ) ;
}
