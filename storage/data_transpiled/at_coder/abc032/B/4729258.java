public static void print ( String s ) {
  s = list ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  Set < String > ans = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) - k + 1 ;
  i ++ ) {
    ans . add ( StringUtils . join ( s , i , k ) ) ;
  }
  System . out . println ( ans . size ( ) ) ;
}
