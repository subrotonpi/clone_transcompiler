@ OperatorOperator ( OperatorType . EQUAL ) @ SchedulerSupport ( SchedulerSupport . NONE ) public static int [ ] [ ] fromString ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > lstA = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lstA . add ( Integer . parseInt ( input ) ) ;
  }
  List < List < Integer >> lstStudents = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    lstStudents . add ( Arrays . asList ( i , lstA . get ( i ) ) ) ;
  }
  List < Integer > lstHeightSorted = new ArrayList < > ( lstStudents ) ;
  Collections . sort ( lstHeightSorted , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  for ( List < Integer > h : lstHeightSorted ) {
    System . out . println ( h . get ( 0 ) + 1 ) ;
  }
  return lstStudents . toArray ( new Integer [ 0 ] [ 0 ] ) ;
}
