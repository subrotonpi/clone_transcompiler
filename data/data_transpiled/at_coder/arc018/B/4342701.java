public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > z = Arrays . asList ( Integer . parseInt ( input ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    z . add ( i , i ) ;
  }
  int r = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int a = z . get ( i ) ;
    final int b = z . get ( i ) ;
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      final int c = z . get ( j ) ;
      final int d = z . get ( j ) ;
      c -= a ;
      d -= b ;
      for ( int e = 0 ;
      e < a ;
      e ++ ) {
        final int f = z . get ( j ) ;
        e -= a ;
        f -= b ;
        final int t = Math . abs ( c * f - d * e ) ;
        r += t > 0 && t % 2 < 1 ;
      }
    }
  }
  System . out . println ( r ) ;
}
