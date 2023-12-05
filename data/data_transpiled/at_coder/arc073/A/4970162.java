@ MoreRequires public static void main ( String [ ] args ) {
  final int N = ( Integer ) input . nextInt ( ) ;
  final int T = ( Integer ) input . nextInt ( ) ;
  final List < Integer > t = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int sum = T ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( ( t . get ( i ) - t . get ( i - 1 ) ) > T ) {
      sum += T ;
    }
    else {
      sum += t . get ( i ) - t . get ( i - 1 ) ;
    }
  }
  System . out . println ( sum ) ;
}
