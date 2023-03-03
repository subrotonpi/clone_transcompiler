public static int n ( int x , int [ ] a ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , x = Integer . parseInt ( input . nextLine ( ) ) ;
  ArrayList < Integer > a = new ArrayList < Integer > ( Arrays . asList ( a ) ) ;
  for ( int i = 0 ;
  i < a . size ( ) ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( Integer . parseInt ( a . get ( 0 ) ) == x ) {
    System . out . println ( n ) ;
  }
  else if ( Integer . parseInt ( a . get ( 0 ) ) < x ) {
    System . out . println ( n - 1 ) ;
  }
  else {
    int ans = 0 ;
    for ( int i : a ) {
      x -= i ;
      if ( x >= 0 ) {
        ans ++ ;
      }
      else {
        break ;
      }
    }
    System . out . println ( ans ) ;
  }
  return ans ;
}
