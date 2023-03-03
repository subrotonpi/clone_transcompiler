@ VisibleForTesting static void binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] wh = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int w = Integer . parseInt ( input . nextLine ( ) ) ;
    int h = Integer . parseInt ( input . nextLine ( ) ) ;
    wh [ i ] = w ;
  }
  Arrays . sort ( wh ) ;
  int [ ] bit = new int [ n ] ;
  Arrays . fill ( bit , - 1 ) ;
}
