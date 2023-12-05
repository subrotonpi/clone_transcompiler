public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  long mod = 1000000007 ;
  long [ ] x = new long [ n ] ;
  long [ ] y = new long [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    y [ i ] = input . nextLong ( ) ;
  }
  long xa = 0 ;
  long ya = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ya += ( i ) * y [ i ] - ( m - i - 1 ) * y [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xa += ( i ) * x [ i ] - ( n - i - 1 ) * x [ i ] ;
  }
  System . out . println ( ya * xa % mod ) ;
}
