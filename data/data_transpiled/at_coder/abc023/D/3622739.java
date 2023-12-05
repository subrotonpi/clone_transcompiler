public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] Balloons = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Balloons [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* find the first value */
  double [ ] Time = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Balloons [ i ] = Balloons [ i ] ;
    int h = Balloons [ i ] [ 0 ] ;
    int s = Balloons [ i ] [ 1 ] ;
    if ( Balloons [ i ] - h < 0 ) {
      return false ;
      break ;
    }
    Time [ i ] = ( Balloons [ i ] - h ) / s ;
  }
  Arrays . sort ( Time , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 - o2 ;
    }
  }
  ) ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    if ( Time [ n ] < N ) {
      if ( Time [ n ] < N ) {
        return false ;
      }
    }
    else {
      return true ;
    }
  }
  return 0 ;
}
