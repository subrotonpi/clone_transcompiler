public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Student > students = new ArrayList < > ( ) ;
  List < List < Integer >> cps = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    students . add ( new Student ( input . nextLine ( ) ) ) ;
  }
  List < List < Integer >> lengths = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    cps . add ( new ArrayList < > ( ) ) ;
  }
  /* Manlen of a and b */
  for ( List < Integer > std : students ) {
    List < Integer > lengths = new ArrayList < > ( ) ;
    for ( List < Integer > cp : cps ) {
      lengths . add ( manlen ( std , cp ) ) ;
    }
    int bestcp = 1 + lengths . indexOf ( Collections . min ( lengths ) ) ;
    System . out . println ( bestcp ) ;
  }
  return students . toArray ( new Student [ 0 ] [ 0 ] ) ;
}
