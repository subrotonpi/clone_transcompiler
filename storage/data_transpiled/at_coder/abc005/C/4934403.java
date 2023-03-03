public static void print ( String input ) {
  int t = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  int m = Integer . parseInt ( input ) ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] += t ;
  }
  boolean ans = true ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      if ( a [ j ] - t <= b [ i ] && b [ j ] <= a [ j ] ) {
        a [ j ] -- ;
        break ;
      }
    }
    else {
      ans = false ;
    }
  }
  if ( ans ) {
    System . out . println ( "yes" ) ;
  }
  else {
    System . out . println ( "no" ) ;
  }
}
