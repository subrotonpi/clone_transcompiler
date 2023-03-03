@ MoreIO . InputFunction public static void main ( String [ ] args ) {
  final int N = ( Integer ) input . split ( " " ) [ 0 ] ;
  final int M = ( Integer ) input . split ( " " ) [ 1 ] ;
  final int [ ] a = new int [ N ] ;
  final int [ ] b = new int [ N ] ;
  final int [ ] ans = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int s1 = ( Integer ) input . split ( " " ) [ 0 ] ;
    final int s2 = ( Integer ) input . split ( " " ) [ 1 ] ;
    a [ i ] = s1 ;
    b [ i ] = s2 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ans [ a [ i ] ] += 1 ;
    ans [ b [ i ] ] += 1 ;
  }
  System . out . println ( Arrays . toString ( ans ) ) ;
}
