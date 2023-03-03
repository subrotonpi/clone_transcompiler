static final Scanner getScanner ( ) {
  final Scanner ns = new Scanner ( System . in ) ;
  final NumberReader ni = new NumberReader ( ) ;
  final NumberReader nm = new NumberReader ( ) ;
  final NumberReader nl = new NumberReader ( ) ;
  String s = ns . nextLine ( ) ;
  final int n = s . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s = s . substring ( 0 , s . length ( ) - 1 ) ;
    if ( s . length ( ) % 2 == 0 ) {
      final int m = s . length ( ) / 2 ;
      int count = 0 ;
      for ( int j = 0 ;
      j < m ;
      j ++ ) {
        if ( s . charAt ( j ) == s . charAt ( j + m ) ) {
          count ++ ;
        }
      }
      if ( count == m ) {
        System . out . println ( 2 * m ) ;
        exit ( ) ;
      }
    }
  }
  return ns ;
}
