public static void main ( String input , int D ) {
  int N = map ( Integer . parseInt , input . split ( " " ) ) ;
  if ( N == 100 ) {
    N = 101 ;
  }
  System . out . println ( 100 * D * N ) ;
}
