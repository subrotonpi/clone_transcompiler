public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > X = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  if ( N >= M ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  List < Integer > pathCnt = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < M - 1 ;
  i ++ ) pathCnt . add ( X . get ( i + 1 ) - X . get ( i ) ) ;
  if ( N == 1 ) System . out . println ( Arrays . toString ( pathCnt ) ) ;
  else System . out . println ( Arrays . toString ( pathCnt . subList ( 0 , pathCnt . size ( ) - N + 1 ) ) ) ;
}
