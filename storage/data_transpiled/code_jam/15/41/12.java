public static int T = Integer . parseInt ( input ) {
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int C = Integer . parseInt ( input . nextLine ( ) ) ;
    char [ ] [ ] level = new char [ R ] [ C ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) level [ i ] = input . toCharArray ( ) ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        if ( level [ i ] [ j ] != '.' ) {
          HashMap < Character , Boolean > r = new HashMap < Character , Boolean > ( ) ;
          r . put ( '^' , Arrays . asList ( level [ i ] [ j ] ) . contains ( '.' ) ) ;
          r . put ( '<' , Arrays . asList ( level [ i ] [ j ] ) . contains ( '.' ) ) ;
          r . put ( '>' , Arrays . asList ( level [ i ] [ j ] ) . contains ( '.' ) ) ;
          r . put ( 'v' , Arrays . asList ( level [ i ] [ j ] ) . contains ( '.' ) ) ;
          if ( ! r . get ( level [ i ] [ j ] ) ) continue ;
          if ( Arrays . asList ( r . values ( ) ) . contains ( '.' ) ) {
            ans = Characteristic . IMPOSSIBLE ;
            break ;
          }
          ans ++ ;
        }
      }
    }
    if ( ans == Characteristic . IMPOSSIBLE ) break ;
  }
  System . out . println ( "Case #" + testCase + ": " + ans ) ;
  return 0 ;
}
