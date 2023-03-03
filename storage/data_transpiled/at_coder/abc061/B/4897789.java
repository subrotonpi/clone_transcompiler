static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final Map < Integer , Integer > map = new HashMap < > ( ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    map . put ( a , 1 ) ;
    map . put ( b , 1 ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( map . get ( i + 1 ) ) ;
  }
}
