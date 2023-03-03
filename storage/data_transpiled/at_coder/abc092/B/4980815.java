static final double ceil ( double d ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double d = Double . parseDouble ( input ( ) ) ;
  int r = Double . parseDouble ( input ( ) ) ;
  double ans = r ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int m = Integer . parseInt ( input ( ) ) ;
    ans += Math . ceil ( d / m ) ;
  }
  System . out . println ( ans ) ;
}
