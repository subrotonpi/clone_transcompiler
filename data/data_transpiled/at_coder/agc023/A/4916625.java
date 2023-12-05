@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] series = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    series [ i ] = series [ i - 1 ] + i ;
  }
  Map < Integer , Integer > sumMap = new HashMap < > ( ) ;
  sumMap . put ( 0 , 1 ) ;
  int sum = 0 ;
  for ( Integer key : A ) {
    sum += key ;
    sumMap . put ( sum , sumMap . get ( key ) - 1 ) ;
  }
  total = 0 ;
  for ( Integer key : sumMap . keySet ( ) ) {
    total += series [ sumMap . get ( key ) - 1 ] ;
  }
  System . out . println ( total ) ;
  return total ;
}
