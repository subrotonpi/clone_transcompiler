public static int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > b = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = b . size ( ) - 1 ;
    j >= 0 ;
    j -- ) {
      if ( j + 1 == b . get ( j ) ) {
        ans . add ( b . remove ( j ) ) ;
        break ;
      }
    }
    else {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  int [ ] result = new int [ ans . size ( ) ] ;
  for ( int i = 0 ;
  i < ans . size ( ) ;
  i ++ ) {
    result [ i ] = ans . get ( i ) ;
  }
  return result ;
}
