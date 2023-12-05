public static int m ( ) {
  String ans ;
  ans = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( m < 100 ) {
    ans = "00" ;
  }
  else if ( m <= 5000 ) {
    if ( m < 1000 ) {
      ans = "0" + ( m / 100 ) ;
    }
    else {
      ans = ( int ) ( m / 100 ) ;
    }
  }
  else {
    ans = 89 ;
  }
  return ans ;
}
