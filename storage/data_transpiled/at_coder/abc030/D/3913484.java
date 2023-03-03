public static int N ( int a ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] bs = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) bs [ i ] = a ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) bs [ i ] = i ;
  int [ ] step = new int [ N ] ;
  HashSet < Integer > used = new HashSet < Integer > ( ) ;
  int cur = 0 ;
  do {
    cur = bs [ cur ] ;
  }
  while ( used . contains ( cur ) ) ;
  int T = step . indexOf ( cur ) ;
  cycle = step . length - T ;
  break ;
  used . add ( cur ) ;
  step [ k ] = cur ;
  if ( k < step . length ) System . out . println ( step [ k ] ) ;
  else System . out . println ( step [ T + ( k - T ) % cycle ] ) ;
  return cycle ;
}
