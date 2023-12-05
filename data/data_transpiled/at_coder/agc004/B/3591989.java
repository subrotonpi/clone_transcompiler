public static List < Integer > inpl ( ) {
  return Arrays . asList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final int N = inpl ( ) ;
  final int x = inpl ( ) ;
  final double [ ] a = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = i ;
    b [ i ] = a [ i ] ;
  }
  double ans = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final double c = a [ i ] ;
    b = b [ i ] ;
    b = c ;
    ans = Math . min ( ans , Math . pow ( b , i ) + i * x ) ;
  }
  System . out . println ( ans ) ;
  return null ;
}
