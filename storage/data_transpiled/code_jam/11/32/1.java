public static int [ ] make ( ) {
  return make ( ) ;
}
{
  int [ ] b = make ( ) ;
  int i = 0 ;
  double time = 0 ;
  while ( time < t && i < N ) {
    time += 2 * b [ i ] ;
    i ++ ;
  }
  Arrays . sort ( b ) ;
  Arrays . reverse ( b ) ;
  return ( int ) ( t + sum ( b , 0 , L ) + sum ( b , L ) * 2 ) ;
}
int r = input . nextInt ( ) ;
for ( int testCase = 1 ;
testCase <= r ;
testCase ++ ) {
  List < Integer > l = CollectionUtils . toList ( input . nextInt ( ) ) ;
  int L = Integer . parseInt ( l . get ( 0 ) ) ;
  int t = Integer . parseInt ( l . get ( 1 ) ) ;
  int N = Integer . parseInt ( l . get ( 2 ) ) ;
  int C = Integer . parseInt ( l . get ( 3 ) ) ;
  int [ ] a = l . subList ( 4 , l . size ( ) ) ;
  System . out . println ( "Case #" + testCase + ": " + solve ( ) ) ;
}
