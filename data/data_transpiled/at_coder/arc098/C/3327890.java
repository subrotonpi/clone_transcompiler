public static double [ ] readInputDouble ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ArrayList < Integer > tmp = new ArrayList < Integer > ( ) ;
    ArrayList < Integer > rec = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( a [ i ] <= a [ j ] ) {
        tmp . add ( a [ j ] ) ;
      }
      else {
        if ( tmp . size ( ) >= K ) {
          tmp . clear ( ) ;
          tmp . add ( tmp ) ;
          rec . add ( tmp . subList ( 0 , tmp . size ( ) - K + 1 ) ) ;
        }
        tmp . clear ( ) ;
      }
    }
    if ( tmp . size ( ) >= K ) {
      tmp . clear ( ) ;
      rec . add ( tmp ) ;
      rec . add ( tmp . subList ( 0 , tmp . size ( ) - K ) ) ;
    }
    if ( Q <= rec . size ( ) ) {
      rec . clear ( ) ;
      ans = Math . min ( ans , rec . get ( Q - 1 ) - rec . get ( 0 ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
