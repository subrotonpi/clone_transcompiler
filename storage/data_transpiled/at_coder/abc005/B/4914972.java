public static int N = Integer . parseInt ( input ) {
  int newInstance = 100 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    newInstance = Math . min ( Integer . parseInt ( input ) , newInstance ) ;
  }
  System . out . println ( newInstance ) ;
  return newInstance ;
}
