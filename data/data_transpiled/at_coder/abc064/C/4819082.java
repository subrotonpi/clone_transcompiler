public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  Set < String > color = new HashSet < String > ( ) ;
  int t = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] <= 399 ) {
      a [ i ] = "gray" ;
    }
    else if ( a [ i ] <= 799 ) {
      a [ i ] = "brown" ;
    }
    else if ( a [ i ] <= 1199 ) {
      a [ i ] = "green" ;
    }
    else if ( a [ i ] <= 1599 ) {
      a [ i ] = "water" ;
    }
    else if ( a [ i ] <= 1999 ) {
      a [ i ] = "blue" ;
    }
    else if ( a [ i ] <= 2399 ) {
      a [ i ] = "yellow" ;
    }
    else if ( a [ i ] <= 2799 ) {
      a [ i ] = "daidai" ;
    }
    else if ( a [ i ] <= 3199 ) {
      a [ i ] = "red" ;
    }
    else {
      a [ i ] = "target" ;
      t ++ ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] != "target" ) {
      color . add ( a [ i ] ) ;
    }
    else {
      continue ;
    }
  }
  if ( Lists . size ( color ) >= 1 ) {
    System . out . println ( Lists . size ( color ) + " " + Lists . size ( color ) + t ) ;
  }
  else {
    System . out . println ( 1 + t ) ;
  }
}
