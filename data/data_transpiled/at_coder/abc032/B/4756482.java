public static void input ( ) {
  int s = input . nextInt ( ) ;
  int k = Integer . parseInt ( input . nextInt ( ) ) ;
  String [ ] tmp = new String [ s . length ( ) - k + 1 ] ;
  for ( int i = 0 ;
  i < tmp . length ;
  i ++ ) {
    tmp [ i ] = s . substring ( i , i + k ) ;
  }
  System . out . println ( new HashSet ( tmp ) . size ( ) ) ;
}
