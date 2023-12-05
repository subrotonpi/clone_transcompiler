public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int b = m * 6 ;
  int a = ( n % 12 + m / 60 ) * 30 ;
  int ans = Math . abs ( a - b ) ;
  if ( ans <= 180 ) {
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( 360 - ans ) ;
  }
}
