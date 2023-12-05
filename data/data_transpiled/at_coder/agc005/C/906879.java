@ NonNull public static String from ( @ NonNull Collection < Integer > nums ) {
  String pos = "Possible" ;
  String imp = "Impossible" ;
  int [ ] nums ;
  int N = nums . size ( ) ;
  int [ ] count = nums . toArray ( ) ;
  int mx = max ( nums ) ;
  if ( mx == 1 ) {
    if ( N == 2 ) {
      return pos ;
    }
    else {
      return imp ;
    }
  }
  else if ( mx == 2 ) {
    if ( count [ 1 ] == 1 && count [ 2 ] >= 2 ) {
      return pos ;
    }
    else {
      return imp ;
    }
  }
  else {
    int mid = ( mx + 1 ) / 2 ;
    for ( int i = 1 ;
    i < mid ;
    i ++ ) {
      if ( count [ i ] != 0 ) {
        return imp ;
      }
    }
    if ( mx % 2 == 1 ) {
      if ( count [ mid ] != 2 ) {
        return imp ;
      }
    }
    else {
      if ( count [ mid ] != 1 ) {
        return imp ;
      }
    }
    for ( int i = mid + 1 ;
    i <= mx ;
    i ++ ) {
      if ( count [ i ] < 2 ) {
        return imp ;
      }
    }
    return pos ;
  }
  int dummy = Integer . parseInt ( input . nextLine ( ) ) ;
  nums = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  System . out . println ( judge ( nums ) ) ;
  /* mk */
  int [ ] ret = new int [ N ] ;
  int n = 1 ;
  for ( int e : nums ) {
    ret [ n ++ ] = e ;
  }
  System . out . println ( ret ) ;
  return ret ;
}
