public static int N = 0 ;
int M = 0 ;
int K = 0 ;
{
  int ret = 0 ;
  if ( inter >= K ) return stone ;
  ret = 0 ;
  if ( K - inter <= 4 ) ret = stone + K - inter ;
  if ( width + 1 <= N ) {
    if ( ret == 0 ) ret = new BT ( stone + 2 , inter + height / 2 + 2 , width + 1 , height ) ;
    else ret = Math . min ( ret , new BT ( stone + 2 , inter + height / 2 + 2 , width + 1 , height ) ) ;
  }
  if ( height + 1 <= M ) {
    if ( ret == 0 ) ret = new BT ( stone + 2 , inter + width / 2 + 2 , width , height + 1 ) ;
    else ret = Math . min ( ret , new BT ( stone + 2 , inter + width / 2 + 2 , width , height + 1 ) ) ;
  }
  if ( width + 1 <= N && height > 3 && inter + 2 >= K ) ret = Math . min ( ret , stone + 1 ) ;
  if ( height + 1 <= M && width > 3 && inter + 2 >= K ) ret = Math . min ( ret , stone + 1 ) ;
  return ret ;
}
int T = input . nextInt ( ) ;
for ( int t : xrange ( T ) ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  M = Integer . parseInt ( input . nextLine ( ) ) ;
  K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N < 3 || M < 3 || K <= 4 ) System . out . println ( "Case #" + ( t + 1 ) + ": " + K ) ;
  else System . out . println ( "Case #" + ( t + 1 ) + ": " + BT ( 4 , 5 , 3 , 3 ) ) ;
}
