public static int M = 998244353 ;
int x = 0 ;
int y = 1 ;
while ( 0 < x ) {
  if ( x % 2 == 1 ) {
    y *= a ;
    y %= m ;
  }
  x /= 2 ;
  a = a * a ;
  a %= m ;
}
{
  int n = s . length ( ) ;
  int nb = 0 ;
  int nc = 0 ;
  char ch = s . charAt ( 0 ) ;
  if ( ch == 'b' ) nb ++ ;
  else if ( ch == 'c' ) nc ++ ;
  boolean sf = true ;
  boolean tf = true ;
  char left = ch ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    ch = s . charAt ( i ) ;
    if ( ch == 'b' ) nb ++ ;
    else if ( ch == 'c' ) nc ++ ;
    if ( ch == left ) sf = false ;
    else tf = false ;
    left = ch ;
  }
  if ( tf ) return 1 ;
  if ( n == 3 ) {
    if ( ( nb + nc * 2 ) % 3 != 0 ) return sf ? 7 : 6 ;
    else return 3 ;
  }
  if ( n % 3 != 0 ) {
    return ( powMod ( 3 , n - 1 ) + M - powMod ( 2 , n - 1 ) + ( sf ? 1 : 0 ) ) % M ;
  }
  else {
    if ( ( nb + nc * 2 ) % 3 != 0 ) return ( powMod ( 3 , n - 1 ) + M - ( powMod ( 2 , n - 1 ) - powMod ( 2 , n / 3 - 1 ) ) + ( sf ? 1 : 0 ) ) % M ;
    else return ( powMod ( 3 , n - 1 ) + M - ( powMod ( 2 , n / 3 ) + 4 * powMod ( 8 , n / 3 - 1 ) ) + ( sf ? 1 : 0 ) ) % M ;
  }
}
{
  String s = input . readLine ( ) ;
  System . out . println ( solve ( s ) ) ;
}
if ( getClass ( ) . getName ( ) . equals ( "java.lang.Integer" ) ) {
  return 0 ;
}
