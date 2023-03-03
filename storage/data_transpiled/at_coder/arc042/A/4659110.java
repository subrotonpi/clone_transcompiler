public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  a = Arrays . copyOf ( a , a . length + 1 ) ;
  a [ a . length - 1 ] = Integer . parseInt ( a [ a . length - 1 ] ) ;
  Set < Integer > L = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( ! L . contains ( a [ i ] ) ) {
      System . out . println ( a [ i ] ) ;
      L . add ( a [ i ] ) ;
    }
  }
  return L . size ( ) ;
}
