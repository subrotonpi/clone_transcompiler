public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  l . sort ( Collections . reverseOrder ( ) ) ;
  int [ ] ans = l . subList ( 1 , 2 ) . toArray ( ) ;
  System . out . println ( Arrays . toString ( ans ) ) ;
  return N ;
}
