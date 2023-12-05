@ VisibleForTesting static int f ( int bb , int nn ) {
  int n = input . nextInt ( ) ;
  int s = input . nextInt ( ) ;
  if ( ( nn < bb ) && ( nn < n ) ) return nn ;
  else return f ( bb , floor ( nn / bb ) ) + ( nn % bb ) ;
  int n = input . nextInt ( ) ;
  int s = input . nextInt ( ) ;
  if ( n == s ) {
    System . out . println ( n + 1 ) ;
    exit ( ) ;
  }
  else if ( n < s ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  for ( int i = 2 ;
  i < ( int ) s ;
  i ++ ) {
    if ( ( n - s ) % i == 0 ) {
      int tmpb = ( n - s ) / i + 1 ;
      if ( tmpb >= n && f ( tmpb , n ) == s ) {
        System . out . println ( tmpb ) ;
        exit ( ) ;
      }
    }
  }
  return s ;
}
