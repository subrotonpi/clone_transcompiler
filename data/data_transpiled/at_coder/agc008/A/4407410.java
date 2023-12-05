public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( a == b ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  if ( b > 0 ) {
    if ( Math . abs ( a ) < Math . abs ( b ) ) {
      if ( a < 0 ) {
        ans += 1 ;
        ans += b + a ;
      }
      else {
        ans += b - a ;
      }
    }
    else {
      if ( a < 0 ) {
        ans += Math . abs ( a ) - b + 1 ;
      }
      else {
        ans += a - b + 2 ;
      }
    }
  }
  else {
    if ( a < 0 ) {
      ans += b - a ;
    }
    else {
      ans += a + b + 1 ;
    }
  }
  return ans ;
}
