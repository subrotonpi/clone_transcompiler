public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int C = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  final List < List < Integer >> sorted = new ArrayList < > ( ) ;
  sorted . addAll ( P ) ;
  final List < List < Integer >> V = new ArrayList < > ( ) ;
  for ( final List < Integer > p : sorted ) {
    boolean flag = true ;
    for ( int i = 0 ;
    i < V . size ( ) ;
    i ++ ) {
      if ( V . get ( i ) . get ( 0 ) < p . get ( 0 ) ) {
        V . set ( i , new ArrayList < > ( p . get ( 1 ) ) ) ;
        flag = false ;
        break ;
      }
      else if ( V . get ( i ) . get ( 0 ) == p . get ( 0 ) && V . get ( i ) . get ( 1 ) == p . get ( 2 ) ) {
        V . set ( i , new ArrayList < > ( p . get ( 1 ) ) ) ;
        flag = false ;
        break ;
      }
      else continue ;
    }
    if ( flag ) V . add ( new ArrayList < > ( p . get ( 1 ) ) ) ;
  }
  System . out . println ( V . size ( ) ) ;
}
