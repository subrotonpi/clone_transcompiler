public static void input ( ) {
  s = input ( ) ;
  n = s . length ( ) ;
  l = new boolean [ n / 2 ] ;
  for ( int i = 0 ;
  i < n / 2 ;
  i ++ ) l [ i ] = s . charAt ( i ) == s . charAt ( s . length ( ) - i - 1 ) ? true : false ;
  System . out . println ( 25 * ( n - n % 2 ) > 0 ? 25 * n - 2 : 25 * n - 2 ) ;
}
