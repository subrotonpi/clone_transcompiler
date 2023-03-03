public static Pair < Double , Double > make ( String s ) {
  rl = new rl ( ) ;
  int cas ;
  int L ;
  int cas ;
  int A ;
  int i ;
  while ( s . charAt ( 0 ) == ' ' ) s = s . substring ( 1 ) ;
  if ( s . charAt ( 0 ) != '(' ) throw new Exception ( ) ;
  s = s . substring ( 1 ) ;
  while ( s . charAt ( 0 ) != ' ' && s . charAt ( i ) != ')' ) i ++ ;
  Double x = Double . parseDouble ( s . substring ( 0 , i ) ) ;
  s = s . substring ( i ) ;
  while ( s . charAt ( 0 ) == ' ' ) s = s . substring ( 1 ) ;
  if ( s . charAt ( 0 ) == ')' ) return new Pair < Double , Double > ( new Double ( x ) , s . substring ( 1 ) ) ;
  i = 0 ;
  while ( "a" <= s . charAt ( i ) && s . charAt ( i ) <= 'z' ) i ++ ;
  f = s . substring ( 0 , i ) ;
  t1 = make ( s . substring ( i ) ) ;
  s = s . substring ( i ) ;
  t2 = make ( s . substring ( i ) ) ;
  s = s . substring ( i ) ;
  while ( s . charAt ( 0 ) == ' ' ) s = s . substring ( 1 ) ;
  if ( s . charAt ( 0 ) != ')' ) throw new Exception ( ) ;
  return new Pair < Double , Double > ( new Double ( x ) , f , t1 , t2 ) ;
  /* solve a */
  a = solve ( a , tree , p ) ;
  N = Integer . parseInt ( rl . nextLine ( ) ) ;
  for ( cas = xrange ( 1 , N + 1 ) ;
  cas < L ;
  cas ++ ) {
    L = Integer . parseInt ( rl . nextLine ( ) ) ;
    tree = make ( " " . toCharArray ( ) ) . get ( 0 ) ;
    A = Integer . parseInt ( rl . nextLine ( ) ) ;
    System . out . println ( "Case #" + cas + ":" ) ;
    for ( cas = xrange ( A ) ;
    cas < A ;
    cas ++ ) {
      a = rl . nextLine ( ) . substring ( 2 ) ;
      System . out . println ( solve ( a , tree , 1.0 ) ) ;
    }
  }
  return new Pair