public static int n = Integer . parseInt ( input ) {
  double base_t = Double . parseDouble ( input . nextLine ( ) ) ;
  double a = Double . parseDouble ( input . nextLine ( ) ) ;
  LinkedList < Double > hs = new LinkedList < Double > ( ) ;
  for ( double i = 0 ;
  i < n ;
  i ++ ) hs . add ( Double . parseDouble ( input . nextLine ( ) ) ) ;
  double [ ] t = new double [ hs . size ( ) ] ;
  for ( int i = 0 ;
  i < hs . size ( ) ;
  i ++ ) t [ i ] = base_t - 0.006 * hs . get ( i ) ;
  double [ ] dif = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) dif [ i ] = Math . abs ( ti - a ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) if ( dif [ i ] == Math . min ( dif [ i ] , dif [ i ] ) ) System . out . println ( i + 1 ) ;
  return i ;
}
