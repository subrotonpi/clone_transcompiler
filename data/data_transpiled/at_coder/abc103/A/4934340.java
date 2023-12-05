public static void main ( String [ ] args ) {
  task = list ( map ( Integer . parseInt , input ( ) ) ) ;
  task = new ArrayList < > ( task ) ;
  int cost = 0 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    cost += task . get ( i + 1 ) - task . get ( i ) ;
  }
  System . out . println ( cost ) ;
}
