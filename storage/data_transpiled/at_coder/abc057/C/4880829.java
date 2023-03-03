static final int input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  A . add ( 0 ) ;
  int i = 1 ;
  while ( i <= Math . sqrt ( n ) ) {
    if ( n % i == 0 ) {
      A . add ( i ) ;
    }
    i ++ ;
  }
  List < Integer > B = new ArrayList < > ( ) ;
  List < Integer > s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < A . size ( ) - 1 ;
  i ++ ) {
    int j = ( int ) ( n / A . get ( i + 1 ) ) ;
    B . add ( j ) ;
    int a = String . valueOf ( A . get ( i + 1 ) ) . length ( ) ;
    int b = String . valueOf ( B . get ( i + 1 ) ) . length ( ) ;
    s . add ( Math . max ( a , b ) ) ;
  }
  int ans = Collections . min ( s ) ;
  System . out . println ( ans ) ;
  return ans ;
}
