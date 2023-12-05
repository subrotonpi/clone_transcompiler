public static LinkedList < Boolean > inpl ( ) {
  return LinkedList . of ( Integer . parseInt ( input . readLine ( ) ) ) ;
  int N = inpl ( ) ;
  int R = inpl ( ) ;
  boolean [ ] S = new boolean [ N ] ;
  for ( int s = 0 ;
  s < N ;
  s ++ ) {
    S [ s ] = s == 'o' ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( Arrays . equals ( S , i ) ) break ;
    if ( S [ i ] ) {
      ans ++ ;
      if ( Arrays . equals ( S , i + R ) ) break ;
    }
    else {
      System . arraycopy ( S , i , S , i + R , true ) ;
      ans ++ ;
      if ( Arrays . equals ( S , i + R ) ) break ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return null ;
}
