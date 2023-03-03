{
  first = new HashMap < String , Integer > ( ) ;
  second = new HashMap < String , Integer > ( ) ;
  int np = 0 ;
  int [ ] em = new int [ n ] ;
  int [ ] match = new int [ n ] ;
  {
    Map < String , Integer > ws = isFirst ? first : second ;
    if ( ! ws . containsKey ( x ) ) {
      ws . put ( x , np ++ ) ;
      em [ n ] = new HashSet < Integer > ( ) ;
    }
  }
  /* dfs */
  boolean v = false ;
  for ( int testCase = 1 ;
  testCase <= Integer . parseInt ( readLine ( ) ) ;
  testCase ++ ) {
    System . out . println ( "Case #" + testCase + ":" ) ;
    np = 0 ;
    first = new HashMap < String , Integer > ( ) ;
    second = new HashMap < String , Integer > ( ) ;
    em = new int [ n ] ;
    int n = Integer . parseInt ( readLine ( ) ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String a = readLine ( ) ;
      String b = readLine ( ) ;
      em [ toNo ( a ) ] . add ( toNo ( b , false ) ) ;
      em [ toNo ( b , false ) ] . add ( toNo ( a ) ) ;
    }
    match = new int [ np ] ;
    int ans = 0 ;
    for ( String s : first . keySet ( ) ) {
      int no = toNo ( s ) ;
      v = new boolean [ np ] ;
      if ( dfs ( no ) ) ans ++ ;
    }
    System . out . println ( n - ( np - ans ) ) ;
  }
  return m ;
}
