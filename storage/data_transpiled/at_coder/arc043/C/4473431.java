public static void BinaryIndexedTree ( ) {
  int [ ] tree = new int [ size + 1 ] ;
  int i ;
  int j ;
  int [ ] result = new int [ size ] ;
  int [ ] tree = tree ;
  for ( i = 0 ;
  i < size ;
  i ++ ) {
    tree [ i ] = i ;
  }
  {
    int [ ] tree = tree ;
    while ( i < tree . length ) {
      tree [ i ] += tree [ i ] ;
      i += tree [ i ] & - 1 ;
    }
  }
  {
    int [ ] tree = tree , result = 0 ;
    while ( i < size ) {
      result += tree [ i ] ;
      i -= tree [ i ] & - 1 ;
    }
    return result ;
  }
  if ( getClass ( ) . isPrimitive ( ) ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    A = new int [ N ] ;
    B = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    B = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      B [ i ] = i ;
    }
    Map < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      map . put ( j , i ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      map . put ( A [ i ] , i ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int n = B [ i ] ;
      B [ i ] = map . get ( n ) ;
    }
    int [ ] invArray = new int [ N ] ;
    BinaryIndexedTree bit = new BinaryIndexedTree ( N ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int n = B [ i ] ;
      invArray [ n ] = i - bit . sum ( n + 1 ) ;
      bit . add ( n + 1 , 1 ) ;
    }
    int invCount = Integer . valueOf ( invArray [ N ] ) ;
    if ( invCount % 2 != 0 ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
    invCount /= 2 ;
    result [ i ] = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      result [ i ] = i ;
      