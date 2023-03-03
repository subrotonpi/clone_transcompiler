public static int n ( int x ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , x = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = new LinkedList < Integer > ( ) ;
  for ( int a : l ) {
    l . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . sort ( l ) ;
  if ( x == Integer . parseInt ( l . get ( 0 ) ) ) {
    System . out . println ( n ) ;
  }
  else if ( x > Integer . parseInt ( l . get ( 0 ) ) ) {
    System . out . println ( n - 1 ) ;
  }
  else {
    int ans = 0 ;
    int k = 0 ;
    for ( Integer a : l ) {
      k += a ;
      if ( k > x ) {
        break ;
      }
      ans ++ ;
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
