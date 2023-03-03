public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > list = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    list . add ( i ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int item = Integer . parseInt ( input . nextLine ( ) ) ;
    int index = list . indexOf ( item ) ;
    list . set ( 0 , list . get ( index ) ) ;
  }
  for ( int i = 1 ;
  i < list . size ( ) ;
  i ++ ) {
    System . out . println ( list . get ( i ) ) ;
  }
  return list . size ( ) ;
}
