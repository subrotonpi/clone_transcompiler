public static int n , int a , int b , int c , int d ;
int n = Integer . parseInt ( input . readLine ( ) ) ;
n -- ;
int k = Math . abs ( b - a ) ;
if ( k > n * d ) {
  System . out . println ( "NO" ) ;
}
else if ( k >= n * c ) {
  System . out . println ( "YES" ) ;
}
else {
  int i = - ( - ( n * c - k ) / ( 2 * c ) ) ;
  int haba = k - ( n - 2 * i ) * c ;
  if ( haba <= ( d - c ) * ( n - i ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    int j = i - 1 ;
    haba = ( n - 2 * j ) * c - k ;
    if ( haba <= ( d - c ) * j ) {
      System . out . println ( "YES" ) ;
    }
    else {
      System . out . println ( "NO" ) ;
    }
  }
}
return n ;
}
