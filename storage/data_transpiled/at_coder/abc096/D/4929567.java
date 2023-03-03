static public int [ ] [ ] Sieve_of_Eratosthenes ( int N ) {
  final Set < Integer > prime = new HashSet < > ( ) ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) prime . add ( i ) ;
  for ( int i = 2 ;
  i <= Math . ceil ( N * 0.5 ) ;
  i ++ ) {
    Set < Integer > tmp = new HashSet < > ( ) ;
    for ( int j : prime ) {
      if ( j > i && j % i == 0 ) tmp . add ( j ) ;
    }
    for ( int j : tmp ) prime . remove ( j ) ;
  }
  return ( prime ) ;
}
