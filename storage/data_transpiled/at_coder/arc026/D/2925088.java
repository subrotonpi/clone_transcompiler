@ VisibleForTesting static int [ ] [ ] solve ( ) {
  final int [ ] [ ] combinations = new int [ combinations . length ] [ ] ;
  System . arraycopy ( combinations , 0 , combinations , 0 , combinations . length ) ;
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  final double eps = 10 * - 7 ;
  final char [ ] AtoZ = new char [ combinations . length ] ;
  for ( int i = 65 ;
  i < 65 + 26 ;
  i ++ ) AtoZ [ i ] = ( char ) i ;
  final char [ ] atoz = new char [ combinations . length ] ;
  for ( int i = 97 ;
  i < 97 + 26 ;
  i ++ ) AtoZ [ i ] = ( char ) i ;
  /* Find the first item in the list */
  for ( int i = 0 ;
  i < combinations . length ;
  i ++ ) {
    combinations [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Union the first item in the list */
  for ( int i = 0 ;
  i < combinations . length ;
  i ++ ) {
    combinations [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Check the first item in the list */
  for ( int i = 0 ;
  i < combinations . length ;
  i ++ ) {
    combinations [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Check the second item in the list */
  for ( int i = 0 ;
  i < combinations . length ;
  i ++ ) {
    combinations [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Check the first item in the list */
  for ( int i = 0 ;
  i < combinations . length ;
  i ++ ) {
    combinations [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int N = combinations [ combinations . length - 1 ] ;
  final int M = combinations . length - 1 ;
  final int [ ] [ ] ABCTs = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    combinations [ i ] = combinations [ i ] ;
  }
  final int [ ] [ ] table = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < combinations . length ;
  