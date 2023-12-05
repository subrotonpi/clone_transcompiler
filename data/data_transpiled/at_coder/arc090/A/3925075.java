public static int [ ] readIntArray ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > ar = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    ar . add ( i ) ;
  }
  List < Integer > br = Lists . newArrayList ( ) ;
  List < Integer > cr = new ArrayList < > ( ) ;
  for ( int i = 1 ;
  i <= a ;
  i ++ ) {
    int count = Integer . parseInt ( ar . get ( 0 ) ) + Integer . parseInt ( br . get ( i - 1 ) ) ;
    cr . add ( count ) ;
  }
  System . out . println ( max ( cr ) ) ;
  return cr . toArray ( ) ;
}
