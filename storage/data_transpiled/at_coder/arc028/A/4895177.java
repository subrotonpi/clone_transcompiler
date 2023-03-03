public static int N = Integer . parseInt ( input ) {
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < 10000 ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      N -= A ;
      if ( N <= 0 ) {
        System . out . println ( "Ant" ) ;
        break ;
      }
    }
    else {
      N -= B ;
      if ( N <= 0 ) {
        System . out . println ( "Bug" ) ;
        break ;
      }
    }
  }
  return N ;
}
