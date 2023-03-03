static final int solve ( int a , int b ) {
  if ( a == 0 || b == 0 ) {
    return 1 ;
  }
  if ( a == b ) {
    return 0 ;
  }
  if ( a < b ) {
    return solve ( b , a ) ;
  }
  if ( a >= 2 * b ) {
    return 1 ;
  }
  else {
    return 1 - solve ( a % b , b ) ;
  }
  int num ;
  {
    int low = 0 ;
    int high = a - 1 ;
    int far = 0 ;
    while ( low <= high ) {
      int mid = ( low + high ) / 2 ;
      if ( solve ( a , mid ) == 1 ) {
        low = mid + 1 ;
        far = mid ;
      }
      else {
        high = mid - 1 ;
      }
    }
    int add = 0 ;
    if ( b1 <= far ) {
      add = Math . min ( b2 , far ) - b1 + 1 ;
    }
    int actual = 0 ;
    for ( int b = b1 ;
    b <= b2 ;
    b ++ ) {
      if ( b < a && solve ( a , b ) == 1 ) {
        actual ++ ;
      }
    }
    if ( add != actual ) {
      System . out . println ( "ERRROR! " + a + " " + add + " " + actual + " " + far ) ;
    }
    return add ;
  }
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    String s [ ] = System . console ( ) . readLine ( ) . split ( " " ) ;
    int a1 = Integer . parseInt ( s [ 0 ] ) ;
    int a2 = Integer . parseInt ( s [ 1 ] ) ;
    int b1 = Integer . parseInt ( s [ 2 ] ) ;
    int b2 = Integer . parseInt ( s [ 3 ] ) ;
    int ans = 0 ;
    for ( int a = a1 ;
    a <= a2 ;
    a ++ ) {
      ans += num ( a , b1 , b2 ) ;
    }
    for ( int b = b1 ;
    b <= b2 ;
    b ++ ) {
      ans += num ( b , a1 , a2 ) ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
  return 0 ;
}
