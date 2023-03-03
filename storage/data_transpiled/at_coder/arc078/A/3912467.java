public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > cards = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cards . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int a = 0 ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int minDiff = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    a += cards . get ( i ) ;
    b -= cards . get ( i ) ;
    minDiff = Math . min ( minDiff , Math . abs ( a - b ) ) ;
  }
  System . out . println ( minDiff ) ;
}
