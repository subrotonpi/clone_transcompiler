@ VisibleForTesting static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] [ ] edge = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    edge [ a - 1 ] [ i ] = b - 1 ;
    edge [ b - 1 ] [ i ] = a - 1 ;
  }
  int [ ] [ ] d = new int [ 2 ] [ N ] ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    d [ i ] [ i * ( N - 1 ) ] = 0 ;
    Queue < Integer > q = new LinkedList < Integer > ( ) ;
    q . add ( i * ( N - 1 ) ) ;
    while ( q . size ( ) > 0 ) {
      int u = q . poll ( ) ;
      for ( int v : edge [ u ] ) {
        if ( d [ i ] [ v ] > - 1 ) continue ;
        d [ i ] [ v ] = d [ i ] [ u ] + 1 ;
        q . add ( v ) ;
      }
    }
  }
  int S = 0 ;
  int F = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( d [ 0 ] [ i ] > d [ 1 ] [ i ] ) {
      S ++ ;
    }
    else {
      F ++ ;
    }
  }
  if ( F > S ) {
    System . out . println ( "Fennec" ) ;
  }
  else {
    System . out . println ( "Snuke" ) ;
  }
}
