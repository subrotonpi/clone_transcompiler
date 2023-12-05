static final int binarySearch ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( input ) ;
  final int [ ] prime = new int [ 101 ] ;
  final boolean [ ] pFlag = new boolean [ 101 ] ;
  pFlag [ 0 ] = pFlag [ 1 ] = true ;
  for ( int i = 2 ;
  i < 101 ;
  i ++ ) {
    if ( ! pFlag [ i ] ) {
      prime [ i ] = i ;
      for ( int j = 2 * i ;
      j < 101 ;
      j += i ) {
        pFlag [ j ] = true ;
      }
    }
  }
  final int M = prime . length ;
  final int [ ] factor = new int [ M ] ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      int tmp = prime [ j ] ;
      if ( tmp > i ) {
        break ;
      }
      while ( i % tmp == 0 ) {
        factor [ j ] ++ ;
        tmp *= prime [ j ] ;
      }
    }
  }
  final int [ ] result = factor . clone ( ) ;
  final int point74 = M - binarySearch ( result , 74 ) ;
  final int point24 = M - binarySearch ( result , 24 ) ;
  final int point14 = M - binarySearch ( result , 14 ) ;
  final int point4 = M - binarySearch ( result , 4 ) ;
  final int point2 = M - binarySearch ( result , 2 ) ;
  int ans ;
  if ( N < 10 ) {
    ans = 0 ;
  }
  else {
    ans = result [ point4 ] / ( result [ point4 ] - 2 ) * result [ point4 ] ;
    if ( point14 > 0 ) {
      ans += point14 * ( point4 - 1 ) ;
    }
    if ( point24 > 0 ) {
      ans += point24 * ( point2 - 1 ) ;
    }
    if ( point74 > 0 ) {
      ans += point74 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
