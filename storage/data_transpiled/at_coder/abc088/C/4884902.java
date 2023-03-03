public static List < List < Integer >> C = new ArrayList < List < Integer >> ( ) {
  int max_c = 0 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    List < Integer > c = new LinkedList < Integer > ( ) ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      c . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    C . add ( c ) ;
    max_c = Math . max ( Math . max ( c . size ( ) , max_c ) , 0 ) ;
  }
  int judge = 0 ;
  for ( int i = 0 ;
  i < max_c + 1 ;
  i ++ ) {
    int a1 = i ;
    int b1 = C . get ( 0 ) - a1 ;
    int b2 = C . get ( 1 ) - a1 ;
    int b3 = C . get ( 2 ) ;
    if ( ( ( ( C . get ( 1 ) - b1 ) == ( C . get ( 1 ) - b2 ) ) && ( ( ( C . get ( 2 ) - b1 ) == ( C . get ( 2 ) - b3 ) ) ) ) ) {
      judge = 1 ;
      break ;
    }
  }
  return C ;
}
