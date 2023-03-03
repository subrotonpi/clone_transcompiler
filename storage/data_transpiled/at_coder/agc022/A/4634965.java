static final String getAlphabet ( ) {
  List < String > alpha = Lists . newArrayList ( "abcdefghijklmnopqrstuvwxyz" ) ;
  List < Integer > alphaNum = new ArrayList < > ( ) ;
  for ( int num = 0 ;
  num < 26 ;
  num ++ ) {
    alphaNum . add ( num ) ;
  }
  Map < Character , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    map . put ( Character . toTitleCase ( alpha . get ( i ) ) , i ) ;
  }
  String S = input ( ) ;
  List < Integer > S_num = new ArrayList < > ( ) ;
  for ( char c : S . toCharArray ( ) ) {
    S_num . add ( map . get ( c ) ) ;
  }
  int last = S_num . get ( S_num . size ( ) - 1 ) ;
  boolean flag = true ;
  if ( S . length ( ) < 26 ) {
    Collections . sort ( S_num ) ;
    for ( int k = 0 ;
    k < S_num . size ( ) ;
    k ++ ) {
      if ( S_num . get ( k ) != alphaNum . get ( k ) ) {
        System . out . println ( S + alpha . get ( k ) ) ;
        flag = false ;
        break ;
      }
    }
    if ( flag ) {
      System . out . println ( S + alpha . get ( S . length ( ) ) ) ;
    }
  }
  else {
    for ( int k = 1 ;
    k < 26 ;
    k ++ ) {
      if ( S_num . get ( k ) > S_num . get ( k - 1 ) ) {
        List < Integer > A = S_num . subList ( k , S_num . size ( ) ) ;
        A = A . subList ( A . size ( ) - 1 , A . size ( ) ) ;
        A . forEach ( A :: add ) ;
        System . out . println ( S . substring ( 0 , k - 1 ) + alpha . get ( A . get ( 0 ) ) ) ;
        flag = false ;
        break ;
      }
    }
    if ( flag ) {
      System . out . println ( - 1 ) ;
    }
  }
  return S ;
}
