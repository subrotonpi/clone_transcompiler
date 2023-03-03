static final void main ( String [ ] args ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = args [ 0 ] ;
  int N = Integer . parseInt ( input ) ;
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int ans = 0 ;
  List < Integer > L = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ) ) ;
  }
  int diff [ ] = new int [ N ] ;
  diff [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    diff [ i ] = L . get ( i ) - L . get ( i - 1 ) ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( diff [ i ] * A >= B ) {
      ans += B ;
    }
    else {
      ans += diff [ i ] * A ;
    }
  }
  System . out . println ( ans ) ;
}
