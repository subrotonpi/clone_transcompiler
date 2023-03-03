static final String NAME = null ;
{
  int total = 0 ;
  int win = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( i == ex ) continue ;
    if ( a . charAt ( num ) == '1' ) win ++ ;
    if ( a . charAt ( num ) != '.' ) total ++ ;
  }
  return win / total ;
}
{
  int n = a . length ;
  int res = 0 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a . charAt ( i ) != '.' ) {
      res += calcWp ( a , i , num ) ;
      cnt ++ ;
    }
  }
  return res / cnt ;
}
{
  int n = a . length ;
  int res = 0 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a . charAt ( i ) != '.' ) {
      res += owp [ i ] ;
      cnt ++ ;
    }
  }
  return res / cnt ;
}
private static final int calcOwp ( int n ) {
  int n = nextToken ( Integer . MIN_VALUE ) ;
  char [ ] a = new char [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = nextToken ( ) ;
  int [ ] wp = new int [ n ] ;
  int [ ] owp = new int [ n ] ;
  int [ ] oowp = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    wp [ i ] = calcWp ( a , i ) ;
    owp [ i ] = calcOwp ( a , i ) ;
  }
  int [ ] res = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    oowp [ i ] = calcOwp ( a , i , owp ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    res [ i ] = wp [ i ] * 0.25 + owp [ i ] * 0.5 + oowp [ i ] * 0.25 ;
  }
  String res = new String ( res ) ;
  return '\n' + res ;
}
