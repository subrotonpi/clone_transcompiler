@ MoreObjects . requireNonNull ;
final int T = Integer . parseInt ( input . nextLine ( ) ) ;
{
  final int [ ] line = new int [ input . length ] ;
  for ( int i = 0 ;
  i < line . length ;
  i += 2 ) line [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] x = new int [ line . length ] ;
  for ( int i = 0 ;
  i < x . length ;
  i += 2 ) x [ i ] = line [ i ] ;
  final int [ ] X = new int [ line . length ] ;
  for ( int i = 1 ;
  i < x . length ;
  i += 2 ) X [ i ] = line [ i ] ;
  return new Tuple < > ( x , X ) ;
}
for ( int t = 0 ;
t < T ;
t ++ ) {
  final int N = ( Integer ) Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = ( Integer ) Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = load ( ) ;
  final int [ ] A = load ( ) ;
  final int [ ] b = load ( ) ;
  @ SuppressWarnings ( "unused" ) final int [ ] B = load ( ) ;
  if ( pa == N || pb == M ) return 0 ;
  if ( A [ pa ] == B [ pb ] ) {
    final int freeA = a [ pa ] - ua , freeB = b [ pb ] - ub ;
    if ( freeA <= freeB ) return freeA + get ( pa + 1 , 0 , pb , ub + freeA ) ;
    else return freeB + get ( pa , ua + freeB , pb + 1 , 0 ) ;
  }
  else return max ( get ( pa + 1 , 0 , pb , ub ) , get ( pa , ua , pb + 1 , 0 ) ) ;
}
System . out . println ( "Case #" + t + 1 + ": " + get ( 0 , 0 , 0 , 0 ) + " " + get ( 0 , 0 , 0 , 0 ) ) ;
get ( ) ;
}
