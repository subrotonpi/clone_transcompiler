@ SafeVarargs public static void main ( String ... args ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = Arrays . stream ( args ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  Arrays . sort ( a ) ;
  int [ ] aSort = Arrays . copyOf ( a , a . length ) ;
  int medianRight = aSort [ floor ( aSort . length / 2 ) ] ;
  int medianLeft = aSort [ floor ( aSort . length / 2 ) - 1 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] > medianLeft ) {
      System . out . println ( medianLeft ) ;
    }
    else {
      System . out . println ( medianRight ) ;
    }
  }
}
