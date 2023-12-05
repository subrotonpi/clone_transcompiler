static int countBA ( List < Integer > perm ) {
  int b = 0 ;
  for ( int i = 0 ;
  i < perm . size ( ) ;
  i ++ ) {
    if ( perm . indexOf ( perm . get ( i ) ) < i ) b ++ ;
  }
  /* determine the number of permutations */
  return countBA ( perm ) > 515 ? "BAD" : "GOOD" ;
  for ( int t = 0 ;
  t < Integer . parseInt ( input ( ) ) ;
  t ++ ) {
    int N = Integer . parseInt ( input ( ) ) ;
    perm = Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + determine ( perm ) ) ;
  }
  return b ;
}
