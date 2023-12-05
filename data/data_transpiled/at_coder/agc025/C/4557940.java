static final Scanner getScanner ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > sortedL = new ArrayList < > ( ( ) -> new ArrayList < > ( Arrays . asList ( input . nextLine ( ) . split ( " " ) ) ) ) ;
  final List < Integer > sortedR = new ArrayList < > ( Arrays . asList ( sortedL ) ) ;
  Collections . sort ( sortedR , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 - o2 ;
    }
  }
  ) ;
  int pos1 = 0 , ans1 = 0 ;
  int pos2 = 0 , ans2 = 0 ;
  for ( int i = 0 , j = 0 ;
  i < N ;
  j ++ ) {
    if ( i % 2 == 0 ) {
      int dist1 = Math . max ( sortedL . get ( j ) . intValue ( ) - pos1 , 0 ) ;
      int dist2 = Math . max ( pos2 - sortedR . get ( j ) . intValue ( ) , 0 ) ;
      pos1 = pos1 + dist1 ;
      ans1 = ans1 + dist1 ;
      pos2 = pos2 - dist2 ;
      ans2 = ans2 + dist2 ;
    }
  }
  return pos1 ;
}
