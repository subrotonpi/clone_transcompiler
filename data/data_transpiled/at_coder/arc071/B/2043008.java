public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  int [ ] y = new int [ m ] ;
  String st = input . readLine ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( st . substring ( i , i + 1 ) ) ;
  }
  st = input . readLine ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    y [ i ] = Integer . parseInt ( st . substring ( i , i + 1 ) ) ;
  }
  int p = 10 * 9 + 7 ;
  int X = 0 ;
  int Y = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    X += x [ i ] * ( 2 * i - n + 1 ) ;
    X = X % p ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    Y += y [ i ] * ( 2 * i - m + 1 ) ;
    Y = Y % p ;
  }
  System . out . println ( ( X * Y ) % p ) ;
}
