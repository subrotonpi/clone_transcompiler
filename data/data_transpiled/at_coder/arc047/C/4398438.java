public static void BinaryIndexedTree ( ) {
  int [ ] tree = new int [ size + 1 ] ;
  int size = size + 1 ;
  BinaryIndexedTree < Integer > bit ;
  int i ;
  int index ;
  int sum = 0 ;
  int lowerBound = 0 ;
  for ( i = 0 ;
  i < size ;
  i ++ ) {
    tree [ index ] = 0 ;
    sum += tree [ index ] ;
    sum += tree [ index ] & - 1 ;
  }
  int sum = 0 ;
  for ( i = 0 ;
  i < size ;
  i ++ ) {
    tree [ index ] = 0 ;
    result = 0 ;
    while ( index > 0 ) {
      result += tree [ index ] ;
      index -= tree [ index ] & - 1 ;
    }
  }
  int lowerBound = 0 ;
  size = size ;
  tree = tree ;
  index = 2 * size - 1 ;
  result = 0 ;
  while ( index > 0 ) {
    if ( result + index < size && tree [ index + result ] < sum ) {
      sum -= tree [ index + result ] ;
      result += index ;
    }
    index >>= 1 ;
  }
  if ( className . equals ( "BinaryIndexedTree" ) ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    K = Integer . parseInt ( input . nextLine ( ) ) ;
    bit = BinaryIndexedTree . valueOf ( N + 1 ) ;
    add = bit . add ;
    sum = bit . sum ;
    lowerBound = bit . lowerBound ;
    int p = 1 ;
    availvable = new int [ N ] ;
    availvable [ N ] = 1 ;
    result = new int [ N ] ;
    for ( i = N ;
    i > 0 ;
    i -- ) {
      add ( availvable [ i ] , 1 ) ;
      int n = i * p / K ;
      result [ availvable . length - 1 - i ] = n ;
      p = i * p % K ;
    }
    for ( i = N - 1 ;
    i >= 0 ;
    i -- ) {
      if ( result [ availvable [ i ] ] != 0 ) {
        availvable [ availvable [ availvable [ i ] ] ] -- ;
        break ;
      }
      availvable [ availvable [ availvable [ i ] ] = N - 1 - i ;
    }
    for ( i = 0 , n = availvable . length ;
    i < n ;
    i ++ ) {
      int j = lowerBound ( availvable [ i ] , n ) ;
      add ( availvable [ i ] , - 1 ) ;
      result [ availvable [ availvable [ i ] ] = j ;
    }
    System . out . println