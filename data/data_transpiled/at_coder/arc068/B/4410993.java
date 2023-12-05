public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i : a ) {
    map . put ( i , map . getOrDefault ( i , 0 ) + 1 ) ;
  }
  int k = map . size ( ) ;
  k -= ( Integer . valueOf ( map . values ( ) . length - k ) ) % 2 ;
  System . out . println ( k ) ;
}
