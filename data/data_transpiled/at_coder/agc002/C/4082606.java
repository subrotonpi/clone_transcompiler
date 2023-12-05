public static void main ( String input ) {
  int N = ( Integer ) input . split ( " " ) [ 0 ] ;
  int L = ( Integer ) input . split ( " " ) [ 1 ] ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  String P = "Possible" ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( a [ i ] + a [ i + 1 ] >= L ) {
      start = i ;
      break ;
    }
  }
  else {
    P = "Impossible" ;
  }
  System . out . println ( P ) ;
  if ( P . equals ( "Possible" ) ) {
    List < Integer > ans = new ArrayList < > ( ) ;
    ans . add ( start ) ;
    if ( start > 0 ) {
      ans . addAll ( Lists . reverse ( Arrays . asList ( a ) ) ) ;
    }
    if ( start != N - 2 ) {
      ans . addAll ( Lists . reverse ( Arrays . asList ( a + 1 , N - 1 ) ) ) ;
    }
    Collections . reverse ( ans ) ;
    for ( int a : ans ) {
      System . out . println ( a + 1 ) ;
    }
  }
}
