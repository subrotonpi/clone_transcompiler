public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < List < Integer >> k = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) k . add ( new ArrayList < > ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) k . add ( new ArrayList < > ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) k . add ( new ArrayList < > ( ) ) ;
  int ans = 1000 ;
  for ( int i = 0 ;
  i < m - 1 ;
  i ++ ) {
    List < Integer > ma = new ArrayList < > ( ) ;
    int mi = - 1 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) ma . set ( k . get ( j ) . get ( 0 ) - 1 ) ;
    if ( ans > max ( ma ) ) ans = max ( ma ) ;
    mi = ma . indexOf ( max ( ma ) ) + 1 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) k . get ( j ) . remove ( mi ) ;
  }
  if ( m == 1 ) System . out . println ( n ) ;
  else System . out . println ( ans ) ;
}
