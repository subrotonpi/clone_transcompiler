public static int pair ( @ int N ) {
  if ( N % 2 == 0 ) {
    return N - 1 ;
  }
  return N + 1 ;
}
if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = pair ( N ) ;
  System . out . println ( ans ) ;
}
