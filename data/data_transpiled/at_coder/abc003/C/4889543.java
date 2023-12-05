public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  ArrayList < Integer > rList = new ArrayList < Integer > ( Collections . nCopies ( n , Integer . parseInt ( input ) ) ) ;
  int res = 0 ;
  for ( int r : rList . subList ( rList . size ( ) - k , rList . size ( ) ) ) {
    res = ( res + r ) / 2 ;
  }
  System . out . println ( res ) ;
}
