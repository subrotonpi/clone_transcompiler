public static void input ( ) {
  String s = input ( ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  String [ ] sub_s = new String [ s . length ( ) - k + 1 ] ;
  for ( int i = 0 ;
  i < sub_s . length ;
  i ++ ) {
    sub_s [ i ] = s . substring ( i , i + k ) ;
  }
  System . out . println ( new HashSet ( sub_s ) . size ( ) ) ;
}
