public static void readFile ( File f ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( f ) ) ;
  int t = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int T = xrange ( 1 , t + 1 ) ;
  T <= t ;
  T ++ ) {
    int E = ( Integer . parseInt ( br . readLine ( ) ) ) ;
    int R = ( Integer . parseInt ( br . readLine ( ) ) ) ;
    int n = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] bound = new int [ n + 2 ] ;
    int [ ] v = new int [ n + 1 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) v [ i ] = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) v [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] next = new int [ n + 2 ] ;
    Stack < Integer > stack = new Stack < Integer > ( ) ;
    for ( int i : xrange ( 1 , n + 1 ) ) {
      while ( stack . size ( ) > 0 && v [ stack . peek ( ) ] < v [ i ] ) next [ stack . pop ( ) ] = i ;
      stack . push ( i ) ;
    }
    while ( stack . size ( ) > 0 ) next [ stack . pop ( ) ] = E + n ;
    for ( int i : xrange ( n - 1 , 0 , - 1 ) ) bound [ i ] = Math . max ( 0 , E - R * ( next [ i ] - i ) ) ;
    int ans = 0 ;
    int energy = E ;
    for ( int i : xrange ( 1 , n + 1 ) ) {
      if ( energy > bound [ i ] ) {
        ans += ( energy - bound [ i ] ) * v [ i ] ;
        energy = bound [ i ] ;
      }
      energy = Math . min ( E , energy + R ) ;
    }
    System . out . println ( "Case #" + T + ": " + ans ) ;
  }
}
