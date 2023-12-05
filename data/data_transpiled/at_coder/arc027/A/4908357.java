public static void main ( String input ) {
  int h = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int m = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int ans = 0 ;
  if ( m != 0 ) {
    ans += 60 - m ;
    ans += ( 18 - h - 1 ) * 60 ;
  }
  else {
    ans += ( 18 - h ) * 60 ;
  }
  System . out . println ( ans ) ;
}
