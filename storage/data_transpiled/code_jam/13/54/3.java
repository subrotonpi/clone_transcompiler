public static double [ ] readArray ( Converter < String , Double > convertor ) {
  double [ ] ret = new Scanner ( System . in ) . nextDouble ( ) . split ( " " ) ;
  if ( convertor != null ) ret = ArrayUtil . convert ( ret , convertor ) ;
  return ret ;
}
final Map < String , Double > m = new HashMap < String , Double > ( ) ;
{
  if ( m . containsKey ( s ) ) return m . get ( s ) ;
  if ( ! s . contains ( "." ) ) return 0.0 ;
  double ans = 0.0 ;
  final int LEN = s . length ( ) ;
  for ( int come = 0 ;
  come < s . length ( ) ;
  come ++ ) {
    int pos = come ;
    while ( s . charAt ( pos ) != '.' ) pos = ( pos + 1 ) % s . length ( ) ;
    String s2 = s . substring ( 0 , pos ) ;
    s2 = s2 . substring ( 0 , pos ) + "X" + s2 . substring ( pos + 1 ) ;
    int dis = pos - come ;
    dis = ( ( dis % LEN ) + LEN ) % LEN ;
    ans += LEN - dis ;
    ans += cal ( s2 ) ;
  }
  ans /= s . length ( ) ;
  m . put ( s , ans ) ;
}
