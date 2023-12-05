public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int Sum = sum ( A ) ;
  if ( Sum % ( N * ( N + 1 ) / 2 ) != 0 ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  int K = Sum / ( N * ( N + 1 ) / 2 ) ;
  List < Integer > Diff = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Diff . add ( A . get ( i ) - A . get ( ( i - 1 ) ) ) ;
  }
  int len = Diff . size ( ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    diff . add ( diff . get ( i ) - K ) ;
  }
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    diff . add ( diff . get ( i ) - K ) ;
  }
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    diff . add ( diff . get ( i ) - K ) ;
  }
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    diff . add ( diff . get ( i ) - K ) ;
  }
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    diff . add ( diff . get ( i ) - K ) ;
  }
  if ( diff . size ( ) == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
