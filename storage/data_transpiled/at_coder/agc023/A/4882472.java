@ VisibleForTesting static void from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( i ) ;
  }
  List < Integer > S = new ArrayList < > ( ) ;
  S . add ( 0 ) ;
  int now = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    now += A . get ( i ) ;
  }
  S . add ( now ) ;
  Scounter = new Counter ( S ) ;
  long ans = 0 ;
  for ( int c : Scounter . values ( ) ) {
    if ( c >= 2 ) {
      ans += c * ( c - 1 ) / 2 ;
    }
    else {
      break ;
    }
  }
  System . out . println ( ans ) ;
}
