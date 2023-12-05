private static int BS ( int [ ] th , int a ) {
  int top = th . length ;
  int btm = 0 ;
  while ( top > btm ) {
    int mid = ( top + btm ) / 2 ;
    if ( th [ mid ] < a && a <= th [ mid + 1 ] ) {
      return mid ;
    }
    else if ( a <= th [ mid ] ) {
      top = mid ;
    }
    else {
      btm = mid ;
    }
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( A ) ;
  int [ ] th = new int [ N ] ;
  int [ ] numth = new int [ N ] ;
  int [ ] rem = new int [ N ] ;
  int maxI = 0 ;
  Map < Integer , Integer > nonzeros = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( A [ i ] > th [ A [ i ] - 1 ] ) {
      th [ i ] = A [ i ] ;
      numth [ i ] = 1 ;
      rem [ i ] = 0 ;
      nonzeros . put ( i , maxI ) ;
      maxI ++ ;
    }
    else {
      int j = BS ( th , A [ i ] ) ;
      if ( j - 1 >= 0 ) {
        numth [ j - 1 ] ++ ;
      }
      rem [ j ] += A [ i ] - th [ j ] ;
    }
  }
  for ( int i = numth . length - 1 ;
  i > 0 ;
  i -- ) {
    numth [ i - 1 ] += numth [ i ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( nonzeros . containsKey ( i ) ) {
      int ans = ( th [ nonzeros . get ( i ) + 1 ] - th [ nonzeros . get ( i ) ] ) * numth [ nonzeros . get ( i ) ] + rem [ nonzeros . get ( i ) ] ;
      System . out . println ( ans ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return 0 ;
}
