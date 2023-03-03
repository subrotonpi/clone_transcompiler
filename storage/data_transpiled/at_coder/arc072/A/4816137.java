public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int s ;
  int ans1 ;
  if ( A [ 0 ] > 0 ) {
    s = A [ 0 ] ;
    ans1 = 0 ;
  }
  else {
    s = 1 ;
    ans1 = - A [ 0 ] + 1 ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( s * ( s + A [ i ] ) >= 0 ) {
      ans2 += Math . abs ( s + A [ i ] ) + 1 ;
      if ( s > 0 ) s = - 1 ;
      else s = 1 ;
    }
    else s += A [ i ] ;
  }
  System . out . println ( Math . min ( ans1 , ans2 ) ) ;
}
