public static void main ( String [ ] args ) {
  List < Integer > C1n = Lists . newArrayList ( ) ;
  List < Integer > C2n = Lists . newArrayList ( ) ;
  List < Integer > C3n = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    C1n . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  C = new ArrayList < > ( ) ;
  C . add ( C1n ) ;
  C . add ( C2n ) ;
  C . add ( C3n ) ;
  int [ ] aS = {
    0 }
    ;
    int [ ] bS = {
      C . get ( 0 ) . intValue ( ) , C . get ( 0 ) . intValue ( ) , C . get ( 0 ) . intValue ( ) }
      ;
      aS [ 0 ] = C . get ( 1 ) . intValue ( ) - bS [ 0 ] ;
      aS [ 1 ] = C . get ( 2 ) . intValue ( ) - bS [ 0 ] ;
      for ( int i = 0 ;
      i < aS . length ;
      i ++ ) {
        int aI = aS [ i ] ;
        for ( int j = 0 ;
        j < bS . length ;
        j ++ ) {
          int bJ = bS [ j ] ;
          if ( ! ( ( aI + bJ ) == C . get ( i ) . intValue ( ) ) ) {
            System . out . println ( "No" ) ;
            return ;
          }
        }
      }
      System . out . println ( "Yes" ) ;
    }
    