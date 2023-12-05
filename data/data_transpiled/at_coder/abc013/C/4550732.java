static final int input ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int h = Integer . parseInt ( input ( ) ) ;
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int c = Integer . parseInt ( input ( ) ) ;
  int d = Integer . parseInt ( input ( ) ) ;
  int e = Integer . parseInt ( input ( ) ) ;
  int cost = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    int j = Math . max ( ( - h - b * i + e * ( n - i ) ) / ( d + e ) + 1 , 0 ) ;
    if ( i + j <= n && h + b * i + d * j - ( n - i - j ) * e > 0 ) {
      cost = Math . min ( cost , a * i + c * j ) ;
    }
  }
  System . out . println ( cost ) ;
}
