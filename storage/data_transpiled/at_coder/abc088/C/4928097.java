public static void main ( String [ ] args ) {
  List < Integer > C1n = Lists . newArrayList ( ) ;
  List < Integer > C2n = Lists . newArrayList ( ) ;
  List < Integer > C3n = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    C1n . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > C2n = Lists . newArrayList ( ) ;
  List < Integer > C3n = Lists . newArrayList ( ) ;
  C3n . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > C = Arrays . asList ( C1n , C2n , C3n ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( ( ! ( C . get ( i ) . intValue ( ) - C . get ( ( i + 1 ) % 2 ) . intValue ( ) ) . equals ( ( C . get ( i ) . intValue ( ) - C . get ( ( i + 1 ) % 2 ) . intValue ( ) ) ) ) || ( ! ( C . get ( i ) . intValue ( ) - C . get ( i ) . intValue ( ) - C . get ( ( i + 1 ) % 2 ) . intValue ( ) ) ) ) {
        System . out . println ( "No" ) ;
        return ;
      }
    }
  }
  System . out . println ( "Yes" ) ;
}
