public static int n ( ) {
  n = input . nextInt ( ) ;
  h = ( int ) ( n / 3600 ) ;
  m = ( int ) ( ( n - h * 3600 ) / 60 ) ;
  s = n - h * 3600 - m * 60 ;
  return s ;
}
