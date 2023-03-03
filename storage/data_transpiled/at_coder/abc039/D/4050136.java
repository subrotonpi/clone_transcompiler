static final String input ( ) {
  final int h = Integer . parseInt ( input . nextLine ( ) ) ;
  final int w = Integer . parseInt ( input . nextLine ( ) ) ;
  final char [ ] [ ] a = new char [ h + 2 ] [ w + 1 ] ;
  for ( int i = 1 ;
  i <= h ;
  i ++ ) {
    final char [ ] raw = new char [ input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . length ( ) ) ) ) ) ) ) ) ) ) ) ) ) ) ] ;
    System . arraycopy ( raw , 0 , a [ i ] , 1 , w + 1 ) ) ;
    a [ i ] [ 0 ] = '_' ;
  }
  for ( int i = 1 ;
  i <= h ;
  i ++ ) {
    final char [ ] raw = new char [ input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( input . nextInt ( ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ] ;
    System . arraycopy ( raw , 0 , a [ i ] , 1 , raw . length ) , raw . length ) ;
  }
  final char [ ] [ ] b = new char [ a . length ] [ ] ;
  for ( int i = 1 , j = 0 ;
  i <= h ;
  i ++ ) {
    if ( a [ i ] [ j ] == '.' ) continue ;
    if ( areWhiteSpacesSorted ( a , i , j ) ) b [ i ] [ j ] = '.' ;
  }
  final char [ ] [ ] c = new char [ b . length ] [ ] ;
  for ( int i = 1 , j = 0 ;
  i <= h ;
  i ++ ) {
    if ( b [ i ] [ j ] == '#' ) continue ;
    if ( areWhiteSpacesSorted ( b , i , j ) ) c [ i ] [ j ] = '#' ;
    