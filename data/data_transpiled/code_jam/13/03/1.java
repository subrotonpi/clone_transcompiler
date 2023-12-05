static final int [ ] result = new int [ 3 ] ;
final long tt7 = 10000000 ;
final long tt25 = 10000000000000000000000000 L ;
final long MAX = tt25 * tt25 * tt25 * tt25 * 10 ;
result [ 0 ] = 1 ;
result [ 1 ] = 4 ;
result [ 2 ] = 9 ;
{
  int ixx ;
  int sq ;
  String palin ;
  /* process the string */
  if ( num . length ( ) == 0 ) {
    return true ;
  }
  ixx = Integer . parseInt ( num ) ;
  sq = ixx * ixx ;
  String palin = String . valueOf ( sq ) ;
  if ( palin . equals ( palin . substring ( 0 , palin . length ( ) - 1 ) ) && sq >= 10 ) {
    result [ 1 ] = sq ;
    return true ;
  }
  else if ( sq < 10 ) {
    return true ;
  }
  /* dfs the string */
  boolean yes = process ( num ) ;
  if ( yes == false ) {
    return true ;
  }
  String x = "1" ;
  do {
    String xx = x + num + x . substring ( 0 , x . length ( ) - 1 ) ;
    ixx = Integer . parseInt ( xx ) ;
    if ( ixx * ixx > MAX ) {
      break ;
    }
    dfs ( x + num + x . substring ( x . length ( ) - 1 ) ) ;
    x += "0" ;
  }
  while ( true ) ;
  x = "2" ;
  do {
    String xx = x + num + x . substring ( 0 , x . length ( ) - 1 ) ;
    ixx = Integer . parseInt ( xx ) ;
    if ( ixx * ixx > MAX ) {
      break ;
    }
    dfs ( x + num + x . substring ( x . length ( ) - 1 ) ) ;
    x += "0" ;
  }
  while ( true ) ;
  dfs ( "" ) ;
  dfs ( "0" ) ;
  dfs ( "1" ) ;
  dfs ( "2" ) ;
  Arrays . sort ( result ) ;
  int test = input . nextInt ( ) ;
  for ( int cases = 1 ;
  cases <= test ;
  cases ++ ) {
    int cnt = 0 ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int x = 0 ;
    x < result . length ;
    x ++ ) {
      if ( result [ x ] >= a && result [ x ] <= b ) {
        cnt ++ ;
      }
      else if ( result [ x