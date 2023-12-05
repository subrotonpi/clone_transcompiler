static final String nextLine ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int n = Integer . parseInt ( input ) ;
  final int m = Integer . parseInt ( input ) ;
  final List < Integer > [ ] lAB = new List [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    lAB [ i ] = new LinkedList < Integer > ( ) ;
  }
  Arrays . sort ( lAB , new Comparator < Integer > ( ) {
  }
  ) ;
  int lBrLast = 0 ;
  int numBR = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( lBrLast < lAB [ i ] . intValue ( ) ) {
      lBrLast = lAB [ i ] . intValue ( ) - 1 ;
      numBR ++ ;
    }
  }
  System . out . println ( numBR ) ;
  return input ;
}
