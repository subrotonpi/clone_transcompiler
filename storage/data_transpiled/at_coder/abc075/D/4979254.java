static void print ( int n , int k ) {
  int [ ] [ ] p = new int [ n ] [ k ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( p ) ;
  List < Integer > q = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    q . add ( i ) ;
  }
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < q . size ( ) ;
  i ++ ) {
    final int a = q . get ( i ) ;
    final int b = q . get ( i + 1 ) ;
    for ( int j = i + k - 1 ;
    j < q . size ( ) ;
    j ++ ) {
      final int c = q . get ( i + j ) ;
      final int d = q . get ( j + 1 ) ;
      final List < Integer > r = new ArrayList < > ( ) ;
      for ( int x = p [ i ] ;
      x < p [ j ] ;
      x ++ ) {
        r . add ( x ) ;
      }
      final int r2 = r . get ( k - 1 ) ;
      for ( int i2 = 0 ;
      i2 < r2 ;
      i2 ++ ) {
        final int j2 = r2 . get ( i2 ) ;
        if ( i2 <= b && d <= j2 ) {
          ans = Math . min ( ans , ( c - a ) * ( j2 - i2 ) ) ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
}
