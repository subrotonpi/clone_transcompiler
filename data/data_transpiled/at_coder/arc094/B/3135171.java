public static int q = Integer . parseInt ( input ) {
  int ans ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    if ( a == b ) {
      ans = 2 * a - 2 ;
    }
    else if ( Math . abs ( a - b ) == 1 ) {
      ans = 2 * Math . min ( a , b ) - 2 ;
    }
    else {
      double c = ( a * b ) * 0.5 ;
      if ( c % 1 == 0 ) {
        c = ( int ) c - 1 ;
      }
      else {
        c = ( int ) c ;
      }
      if ( c * ( c + 1 ) >= a * b ) {
        ans = 2 * c - 2 ;
      }
      else {
        ans = 2 * c - 1 ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
