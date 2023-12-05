public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ab . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  ab . sort ( Comparator . reverseOrder ( ) ) ;
  int end = 0 ;
  int ans = 0 ;
  for ( List < Integer > y : ab ) {
    if ( y . get ( 0 ) >= end ) {
      ans ++ ;
      end = y . get ( 1 ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
