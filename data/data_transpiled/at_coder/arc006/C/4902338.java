public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] w = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] wMins = new int [ n ] ;
  wMins [ 0 ] = w [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int count = 0 ;
    for ( int index = 0 ;
    index < wMins . length ;
    index ++ ) {
      int wMin = wMins [ index ] ;
      if ( w [ i ] <= wMin ) {
        wMins [ index ] = w [ i ] ;
        break ;
      }
      else {
        count ++ ;
      }
    }
    if ( count == wMins . length ) {
      wMins [ count ] = w [ i ] ;
    }
  }
  System . out . println ( wMins . length ) ;
}
