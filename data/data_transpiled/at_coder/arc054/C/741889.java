public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] a = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      a [ i ] [ j ] = ( int ) ( a [ i ] [ j ] - '0' ) ;
    }
  }
  boolean ans = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int u = i ;
    while ( u < n && a [ u ] [ i ] == 0 ) {
      u ++ ;
    }
    if ( u == n ) {
      ans = false ;
      break ;
    }
    for ( int j = u + 1 ;
    j < n ;
    j ++ ) {
      if ( a [ j ] [ i ] == 1 ) {
        a [ j ] = Arrays . stream ( a [ j ] ) . filter ( p -> p ^ q != 0 ) . findFirst ( ) . orElse ( null ) ;
      }
    }
    a [ i ] = a [ u ] ;
    a [ u ] = a [ i ] ;
  }
  if ( ans ) {
    System . out . println ( "Odd" ) ;
  }
  else {
    System . out . println ( "Even" ) ;
  }
}
