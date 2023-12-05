public static void main ( String input ) {
  int h = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int m = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int ans = 0 ;
  if ( m > 0 ) {
    ans += 60 - m ;
    ans += 60 * ( 18 - 1 - h ) ;
  }
  else {
    ans += 60 * ( 18 - h ) ;
  }
  System . out . println ( ans ) ;
}
