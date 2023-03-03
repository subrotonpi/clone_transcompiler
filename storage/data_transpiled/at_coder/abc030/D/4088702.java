public static int N ( int a ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  a -- ;
  LinkedList < Integer > B = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < input . nextLine ( ) ;
  i ++ ) {
    B . add ( Integer . parseInt ( input . nextLine ( ) ) - 1 ) ;
  }
  ArrayList < Integer > checkedList = new ArrayList < Integer > ( ) ;
  checkedList . add ( a ) ;
  HashSet < Integer > checkedSet = new HashSet < Integer > ( ) ;
  while ( true ) {
    int nextIndex = B . get ( checkedList . size ( ) - 1 ) ;
    if ( checkedSet . contains ( nextIndex ) ) {
      cycle = checkedList . subList ( checkedList . indexOf ( nextIndex ) , checkedList . size ( ) ) ;
      break ;
    }
    else {
      K -- ;
    }
  }
  return K ;
}
