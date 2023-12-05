public static int readint ( ) {
  return Integer . parseInt ( readLine ( ) ) ;
}
public static final String readarray ( InputStream in ) {
  return map . readLine ( ) ;
}
public static String toquat ( char c ) {
  if ( c == 'i' ) return 2 ;
  if ( c == 'j' ) return 3 ;
  if ( c == 'k' ) return 4 ;
  /* mult */
  if ( a < 0 ) return - mult ( - a , b ) ;
  if ( b < 0 ) return - mult ( a , - b ) ;
  if ( a == 1 ) return b ;
  if ( b == 1 ) return a ;
  if ( a == b ) return - 1 ;
  if ( a == 2 && b == 3 ) return 4 ;
  if ( a == 2 && b == 4 ) return - 3 ;
  if ( a == 3 && b == 2 ) return - 4 ;
  if ( a == 3 && b == 4 ) return 2 ;
  if ( a == 4 && b == 2 ) return 3 ;
  if ( a == 4 && b == 3 ) return - 2 ;
  throw new RuntimeException ( ) ;
}
int _T = readint ( ) ;
for ( int _t = 0 ;
_t < _T ;
_t ++ ) {
  int L = readarray ( Integer . parseInt ( ) ) ;
  int X = readarray ( Integer . parseInt ( ) ) ;
  String [ ] S = readLine ( ) . split ( " " ) ;
  int [ ] A = new int [ S . length ] ;
  int [ ] B = new int [ S . length ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) A [ i ] = mult ( A [ A . length - 1 ] , toquat ( S [ i ] ) ) ;
  int [ ] B = new int [ S . length ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) B [ i ] = mult ( toquat ( S [ i ] ) , B [ B . length - 1 ] ) ;
  B [ B . length - 1 ] = 1 ;
  int [ ] P = new int [ 3 ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) P [ i ] = mult ( P [ P . length - 1 ] , A [ L ] ) ;
  if ( P [ X % 4 ] != - 1 ) res = "NO" ;
  else {
    boolean found = true ;
    for ( int