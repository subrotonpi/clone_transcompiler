public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Tuple < Integer , Integer >> STUDENTS = new ArrayList < > ( ) ;
  List < Tuple < Integer , Integer >> CHECKPOINTS = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    STUDENTS . add ( new Tuple < > ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
    CHECKPOINTS . add ( new Tuple < > ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int [ ] student = STUDENTS . get ( i ) ;
    int L = 10 * 10 ;
    for ( int j = 0 ;
    j < CHECKPOINTS . size ( ) ;
    j ++ ) {
      Tuple < Integer , Integer > checkpoint = CHECKPOINTS . get ( j ) ;
      int l = Math . abs ( checkpoint . x - student [ 0 ] ) + Math . abs ( checkpoint . y - student [ 1 ] ) ;
      if ( l < L ) {
        nc = i + 1 ;
        L = l ;
      }
    }
    System . out . println ( nc ) ;
  }
  return new int [ ] [ ] {
    {
      N , M }
    }
    ;
  }
  