@ SafeVarargs public static < T > void main ( List < T > ... args ) throws IOException {
  String input = new Scanner ( System . in ) . nextLine ( ) ;
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  TreeMap < Pair < Integer , Integer > , Integer > map = new TreeMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    for ( int j = 0 ;
    j < b ;
    j ++ ) {
      map . put ( new Pair < > ( a + i , b + j ) , 1 ) ;
    }
  }
  int [ ] a = new int [ 10 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( 0 < a [ i ] && a [ i ] < h - 1 && a [ i ] < w - 1 ) {
      a [ i ] ++ ;
    }
  }
  a [ 0 ] = ( h - 2 ) * ( w - 2 ) - sum ( a ) ;
  System . out . println ( ( a ) ) ;
}
