public static int N ( ) {
  int N = input . nextInt ( ) ;
  String s = "" ;
  while ( N != 0 ) {
    int r = N % 2 == 0 ? 0 : 1 ;
    N = ( N - r ) / 2 - 1 ;
    s = Integer . toString ( r ) + s ;
  }
  return ( s != "" ? s : "0" ) ;
}
