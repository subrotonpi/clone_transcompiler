@ MoreRequires public static void main ( String [ ] args ) {
  final int N = ( Integer ) input . split ( " " ) . length ;
  final int M = ( Integer ) input . split ( " " ) . length ;
  final int [ ] a = new int [ N ] ;
  final int [ ] b = new int [ M ] ;
  final int [ ] c = new int [ N ] ;
  final int [ ] d = new int [ N ] ;
  final String [ ] ans = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int t1 = ( Integer ) input . split ( " " ) [ 0 ] ;
    final int t2 = ( Integer ) input . split ( " " ) [ 1 ] ;
    a [ i ] = t1 ;
    b [ i ] = t2 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int t1 = ( Integer ) input . split ( " " ) [ 0 ] ;
    final int t2 = ( Integer ) input . split ( " " ) [ 0 ] ;
    c [ i ] = t1 ;
    d [ i ] = t2 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double minDist = 1e10 ;
    ans [ i ] = 0 ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      final double dist = Math . abs ( a [ i ] - c [ j ] ) + Math . abs ( b [ i ] - d [ j ] ) ;
      if ( minDist > dist ) {
        ans [ i ] = String . valueOf ( j + 1 ) ;
        minDist = dist ;
      }
    }
  }
  System . out . println ( Arrays . toString ( ans ) ) ;
}
