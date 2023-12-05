public static int password ( @ Nonnull String s , int k ) {
  Set < String > t = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) - k + 1 ;
  i ++ ) {
    t . add ( s . substring ( i , i + k ) ) ;
  }
  return t . size ( ) ;
}
if ( getClass ( ) . isEnum ( ) ) {
  s = input . nextLine ( ) ;
  k = Integer . parseInt ( input . nextLine ( ) ) ;
  String ans = password ( s , k ) ;
  System . out . println ( ans ) ;
}
