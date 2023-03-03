public static boolean nextPermut ( List < Integer > entry ) throws IOException {
  int m = entry . size ( ) ;
  int i = m - 1 ;
  while ( ( i > 0 ) && entry . get ( i ) < entry . get ( i - 1 ) ) {
    i -- ;
  }
  if ( ( i == 0 ) && ( entry . get ( i - 1 ) < entry . get ( m - 1 ) ) ) {
    entry . reverse ( ) ;
    return false ;
  }
  int k = m - 1 ;
  while ( ( k < entry . get ( k ) ) && ( entry . get ( i - 1 ) < entry . get ( k ) ) ) {
    k -- ;
  }
  entry . set ( i - 1 , entry . get ( k ) ) ;
  int x = 0 ;
  while ( ( i + x < m - 1 - x ) && ( entry . get ( i + x ) < entry . get ( m - 1 - x ) ) ) {
    entry . set ( i + x , entry . get ( m - 1 - x ) ) ;
    x ++ ;
  }
  return true ;
}
private static int compSize ( String s ) {
  int tot = 0 ;
  char lastSeen = '%' ;
  for ( ;
  x < xrange ( s . length ( ) ) ;
  x ++ ) {
    if ( ( s . charAt ( x ) != lastSeen ) && ( lastSeen != s . charAt ( x ) ) ) {
      lastSeen = s . charAt ( x ) ;
      tot ++ ;
    }
  }
  private static final String applyPermut ( int [ ] p , String s ) {
    int k = p . length ;
    char [ ] ns = new char [ s . length ( ) ] ;
    for ( int x = 0 ;
    x < xrange ( s . length ( ) ) ;
    x ++ ) {
      ns [ x ] = s . charAt ( p [ x % k ] + ( x / k ) * k ) ;
    }
    return new String ( ns ) ;
  }
  String file = "D-small-attempt0.in" ;
  BufferedReader br = new BufferedReader ( new FileReader ( file ) ) ;
  PrintWriter of = new PrintWriter ( new BufferedWriter ( new FileWriter ( "D-small.out" ) ) ) ;
  int N = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int x = 0 ;
  x < xrange ( N ) ;
  x ++ ) {
    int k = Integer . parseInt ( br . readLine ( ) ) ;
    String S = br . readLine (