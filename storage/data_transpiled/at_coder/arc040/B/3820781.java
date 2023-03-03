public static int N = Integer . parseInt ( input ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Character > S = new LinkedList < > ( ) ;
  S . add ( 'o' ) ;
  while ( ( S . size ( ) > 0 ) && ( S . peek ( ) == 'o' ) ) {
    S . pop ( ) ;
    N -- ;
  }
  int p = 0 ;
  int cost = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . peek ( ) != '.' ) continue ;
    S . subSet ( i , i + R ) ;
    p = i ;
    cost ++ ;
  }
  cost += Math . min ( Math . max ( 0 , N - R ) , p ) ;
  return cost ;
}
