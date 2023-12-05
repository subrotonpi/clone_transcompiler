public static List < Integer > compress ( String s ) {
  List < Integer > t = new ArrayList < Integer > ( ) ;
  char prev = '#' ;
  for ( char c : s . toCharArray ( ) ) {
    if ( c != prev ) {
      t . add ( c ) ;
    }
    prev = c ;
  }
  /* extract the list */
  List < Integer > res = new ArrayList < Integer > ( ) ;
  prev = '#' ;
  int cnt = 1 ;
  for ( char c : s . toCharArray ( ) ) {
    if ( c != prev && prev != '#' ) {
      res . add ( cnt ) ;
      cnt = 1 ;
    }
    else {
      cnt ++ ;
    }
    prev = c ;
  }
  res . add ( cnt ) ;
  /* extract the list */
  for ( int tc = 0 ;
  tc < Integer . parseInt ( input ( ) ) ;
  tc ++ ) {
    int N = Integer . parseInt ( input ( ) ) ;
    List < List < Integer >> list = new ArrayList < List < Integer >> ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      list . add ( Collections . singletonList ( input ( ) ) ) ;
    }
    boolean compressed = compress ( list . get ( 0 ) ) ;
    boolean valid = true ;
    for ( List < Integer > s : list ) {
      if ( compressed != compress ( s ) ) {
        valid = false ;
        break ;
      }
    }
    if ( ! valid ) {
      System . out . println ( "Case #" + ( tc + 1 ) + ": Fegla Won" ) ;
      continue ;
    }
    List < Integer > ext = new ArrayList < Integer > ( ) ;
    for ( List < Integer > s : list ) {
      ext . add ( extract ( s ) ) ;
    }
    int M = ext . get ( 0 ) . size ( ) ;
    int res = 0 ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      res += Math . min ( Math . abs ( j - ext . get ( k ) . get ( i ) ) , N ) ;
    }
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + res ) ;
  }
  return t ;
}
