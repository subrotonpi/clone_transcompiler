public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  /* Calculate the number of digits in the list */
  List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = Math . max ( 1 , N - 9 * 17 ) ;
  i < N ;
  i ++ ) {
    if ( i + cal ( i ) == N ) {
      ans . add ( i ) ;
    }
  }
  int counts = ans . size ( ) ;
  System . out . println ( counts ) ;
  if ( counts != 0 ) {
    System . out . println ( ( int [ ] ) ans . get ( 0 ) ) ;
  }
  return counts ;
}
