public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = list ( Integer . parseInt ( input ) ) ;
  int ans = 0 ;
  for ( int i : a ) {
    while ( i % 2 == 0 ) {
      ans ++ ;
      i /= 2 ;
    }
  }
  System . out . println ( ans ) ;
}
