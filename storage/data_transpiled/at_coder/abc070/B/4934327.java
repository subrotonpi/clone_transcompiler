public static int a ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    if ( b <= c || d <= a ) {
      ans = 0 ;
    }
    else if ( a <= c ) {
      if ( b <= d ) {
        ans = b - c ;
      }
      else if ( d <= b ) {
        ans = b - a ;
      }
    }
  }
  return ans ;
}
