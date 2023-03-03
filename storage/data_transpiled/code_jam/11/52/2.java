static int foo ( Scanner iScanner ) {
  final int [ ] a = new int [ iScanner . nextInt ( ) ] ;
  for ( int i = 0 ;
  i < a . length ;
  ++ i ) {
    a [ i ] = Integer . parseInt ( iScanner . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  if ( a . length == 0 ) {
    return 0 ;
  }
  final Map < Integer , List < Integer >> bb = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < a . length ;
  ++ i ) {
    int t = 0 ;
    if ( bb . containsKey ( a [ i ] ) ) {
      t = bb . get ( a [ i ] ) . size ( ) ;
    }
    bb . put ( a [ i ] , t ) ;
  }
  int res = a . length ;
  for ( int i = 0 ;
  i < res ;
  ++ i ) {
    res = Math . min ( res , a [ i ] ) ;
  }
  return res ;
}
