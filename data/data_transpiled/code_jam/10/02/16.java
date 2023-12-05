public static int gcd ( int a , int b ) {
  if ( a < b ) {
    return gcd ( b , a ) ;
  }
  if ( b == 0 ) {
    return a ;
  }
  return gcd ( b , a - b * ( a / b ) ) ;
}
int t = Integer . parseInt ( readLine ( ) ) ;
for ( int testCase = 0 ;
testCase < t ;
testCase ++ ) {
  List < Integer > list = new ArrayList < Integer > ( ) ;
  for ( String s : readLine ( ) . split ( " " ) ) {
    list . add ( Integer . parseInt ( s ) ) ;
  }
  int n = list . get ( 0 ) ;
  int [ ] events = list . subList ( 1 , list . size ( ) ) ;
  int [ ] gaps = new int [ xrange ( events . length - 1 ) ] ;
  for ( int i = 0 ;
  i < gaps . length ;
  i ++ ) {
    gaps [ i ] = Math . abs ( events [ i + 1 ] - events [ i ] ) ;
  }
  int bigT = reduce ( gcd , gaps ) ;
  int y = ( - events [ 0 ] ) % bigT ;
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + y ) ;
}
