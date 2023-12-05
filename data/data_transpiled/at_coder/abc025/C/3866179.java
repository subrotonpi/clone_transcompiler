public static List < Integer > convert ( String input ) {
  List < Integer > b1 = Lists . newArrayList ( ) ;
  List < Integer > b2 = Lists . newArrayList ( ) ;
  List < Integer > c1 = Lists . newArrayList ( ) ;
  List < Integer > c2 = Lists . newArrayList ( ) ;
  List < Integer > c3 = Lists . newArrayList ( ) ;
  @ SuppressWarnings ( "unchecked" ) List < Integer > adj = ( List < Integer > ) grid -> {
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      if ( grid . get ( i ) == - 1 ) {
        List < Integer > nextGrid = Lists . newArrayList ( ) ;
        nextGrid . add ( i ) ;
        nextGrid . add ( i ) ;
        return Ints . asList ( nextGrid ) ;
      }
    }
    return Ints . asList ( b1 , b2 , c1 , c2 , c3 ) ;
  }
  ;
  List < Integer > bList = Arrays . asList ( b1 , b2 ) ;
  List < Integer > cList = Arrays . asList ( c1 , c2 , c3 ) ;
  int value = 0 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( points . get ( i * 3 + j ) != - 1 && points . get ( i * 3 + j ) == points . get ( ( i + 1 ) * 3 + j ) ) {
        value += bList . get ( i ) . intValue ( ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      if ( points . get ( i * 3 + j ) != - 1 && points . get ( i * 3 + j ) == points . get ( i * 3 + j + 1 ) ) {
        value += cList . get ( i ) . intValue ( ) ;
      }
    }
  }
  return value ;
}
