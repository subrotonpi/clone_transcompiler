static final java . io . File file = new java . io . File ( System . getProperty ( "java.io.tmpdir" ) ) ;
java . io . File fout = new java . io . File ( "p4.out" ) ;
final long mod = 1000000007 ;
{
  for ( int i : xrange ( Math . min ( s1 . length , s2 . length ) ) ) {
    if ( s1 [ i ] != s2 [ i ] ) return i ;
  }
}
{
  for ( int i = 0 ;
  i < Math . min ( s1 . length , s2 . length ) ;
  i ++ ) if ( s1 [ i ] != s2 [ i ] ) return i ;
}
{
  for ( int i = 0 ;
  i < Math . min ( s1 . length , s2 . length ) ;
  i ++ ) if ( l == 0 ) return 0 ;
  else return Collections . max ( l ) ;
}
{
  return Collections . min ( xrange ( values ) , Integer . MAX_VALUE ) ;
}
private static final long index_min ( List < String > values ) {
  return Collections . min ( xrange ( values ) , values . size ( ) ) ;
}
int T = Integer . parseInt ( fin . nextLine ( ) ) ;
for ( int i = 0 ;
i < xrange ( T ) ;
i ++ ) {
  int M = Integer . parseInt ( fin . nextLine ( ) ) ;
  int N = Integer . parseInt ( fin . nextLine ( ) ) ;
  String [ ] S = new String [ M ] ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) S [ j ] = "" ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) S [ j ] = fin . nextLine ( ) . substring ( 0 , fin . nextLine ( ) . length ( ) - 1 ) ;
  int [ ] [ ] d = new int [ M ] [ M ] ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) d [ j ] [ j ] = 0 ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) d [ j ] [ k ] = maxpref ( S [ j ] , S [ k ] ) + 1 ;
  cds = new ArrayList < > ( ) ;
  int ans = 0 ;
  /* find num */
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    if ( j == M ) {
      if ( count == ans ) return 1 ;
      else return 0 ;
    }
  }
  double total = 0 ;
  