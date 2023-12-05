@ Test public static int brute ( int P , List < Integer > A ) {
  int best = 0 ;
  for ( List < Integer > cand : permutations ( A ) ) {
    int bns = 0 ;
    int cur = 0 ;
    for ( Integer x : cand ) {
      if ( cur > 0 ) {
        cur += x ;
        cur %= P ;
      }
      else {
        bns ++ ;
        cur += x ;
        cur %= P ;
      }
    }
    best = Math . max ( best , bns ) ;
  }
  {
    int [ ] count = new int [ P ] ;
    for ( Integer x : A ) count [ x % P ] ++ ;
    if ( P == 2 ) return count [ 0 ] + count [ 1 ] / 2 + count [ 1 ] % 2 ;
    if ( P == 3 ) {
      int c1 = count [ 1 ] ;
      int c2 = count [ 2 ] ;
      int x = Math . min ( c1 , c2 ) ;
      int ans = count [ 0 ] + x ;
      c1 -= x ;
      c2 -= x ;
      ans += c1 / 3 ;
      ans += c2 / 3 ;
      c1 %= 3 ;
      c2 %= 3 ;
      if ( c1 > 0 || c2 > 0 ) ans ++ ;
      return ans ;
    }
    if ( P == 4 ) {
      int ans = 0 ;
      for ( int a : xrange ( N + 1 ) ) for ( int b : xrange ( N + 1 ) ) for ( int c : xrange ( N + 1 ) ) {
        int c1 = count [ 1 ] ;
        int c2 = count [ 2 ] ;
        int c3 = count [ 3 ] ;
        c1 -= a + 2 * b ;
        c2 -= b + c ;
        c3 -= a + 2 * c ;
        if ( c1 < 0 || c2 < 0 || c3 < 0 ) continue ;
        int bns = count [ 0 ] + a + b + c ;
        bns += c2 / 2 ;
        c2 %= 2 ;
        bns += c1 / 4 ;
        c1 %= 4 ;
        bns += c3 / 4 ;
        c3 %= 4 ;
        if ( c1 > 0 || c2 > 0 || c3 > 0 ) bns ++ ;
        ans = Math . max ( ans , bns ) ;
      }
    }
  }
  return ans ;
}
