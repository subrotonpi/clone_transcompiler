public static void main ( String [ ] args ) {
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> boxes = Lists . newArrayList ( ) ;
  long ans = 1 ;
  for ( int i = 0 ;
  i < c ;
  i ++ ) {
    boxes . add ( new ArrayList < > ( Lists . newArrayList ( input . nextLine ( ) . split ( " " ) ) ) ) ;
  }
  for ( int k = 0 ;
  k < 3 ;
  k ++ ) {
    long maxValue = 1 ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      maxValue = Math . max ( maxValue , boxes . get ( j ) . get ( k ) ) ;
    }
    ans *= maxValue ;
  }
  System . out . println ( ans ) ;
}
