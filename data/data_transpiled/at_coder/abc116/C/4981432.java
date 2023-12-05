public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] h = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  List < Integer > hUnique = new LinkedList < Integer > ( Arrays . asList ( h ) ) ;
  int [ ] check = new int [ n + 1 ] ;
  Arrays . fill ( check , 1 ) ;
  h = new int [ h . length + 1 ] ;
  for ( int i = 0 ;
  i < Math . max ( h . length , 1 ) ;
  i ++ ) {
    if ( hUnique . contains ( i ) ) {
      for ( int j = 0 ;
      j < h . length ;
      j ++ ) {
        if ( h [ j ] == i ) {
          check [ j ] = 1 ;
          if ( check [ j - 1 ] == 0 && check [ j + 1 ] == 0 ) {
            split ++ ;
          }
          else if ( check [ j - 1 ] == 1 && check [ j + 1 ] == 1 ) {
            split -- ;
          }
        }
      }
    }
    ans += split + 1 ;
  }
  System . out . println ( ans ) ;
}
