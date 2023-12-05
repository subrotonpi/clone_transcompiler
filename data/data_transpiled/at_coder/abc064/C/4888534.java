@ VisibleForTesting static void main ( Scanner in ) {
  int n = in . nextInt ( ) ;
  int [ ] a = Ints . fromArray ( in . nextLine ( ) . split ( " " ) ) ;
  int [ ] rate = new int [ 8 ] ;
  int f = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( 3199 < a [ i ] ) f ++ ;
    else rate [ i ] = 1 ;
  }
  int s = rate [ n ] ;
  int min = s < s ? 1 : 0 ;
  int max = s + f ;
  System . out . println ( min + " " + max ) ;
}
