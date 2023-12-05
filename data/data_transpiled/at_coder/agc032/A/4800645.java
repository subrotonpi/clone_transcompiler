public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > b = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  ArrayList < Integer > ans = new ArrayList < Integer > ( ) ;
  boolean flag = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    flag = true ;
    int m = b . size ( ) ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( b . get ( m - 1 - j ) == m - j ) {
        ans . add ( m - j ) ;
        b . remove ( m - 1 - j ) ;
        flag = false ;
        break ;
      }
    }
    if ( flag ) {
      System . out . println ( - 1 ) ;
      break ;
    }
  }
  if ( ! flag ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . println ( ans . get ( n - 1 - i ) ) ;
    }
  }
  return ans . toArray ( new Integer [ n ] ) ;
}
