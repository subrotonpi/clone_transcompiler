static final double [ ] getDoubleArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] a = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = i ;
  }
  b = new double [ N ] ;
  ans = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double c = a [ i ] ;
    b = new double [ N ] ;
    b [ i ] = c ;
    ans = Math . min ( ans , Math . pow ( b , i ) + i * x ) ;
  }
  System . out . println ( ans ) ;
}
