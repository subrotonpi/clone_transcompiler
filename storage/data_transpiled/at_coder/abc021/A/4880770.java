public static int [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int N1 = 1 ;
  int N2 = 2 ;
  int N3 = 4 ;
  int N4 = 8 ;
  ArrayList < Integer > ansList = new ArrayList < Integer > ( ) ;
  if ( N >= N4 ) {
    ansList . add ( N4 ) ;
    N -= N4 ;
  }
  else if ( N >= N3 ) {
    ansList . add ( N3 ) ;
    N -= N3 ;
  }
  if ( N >= N2 ) {
    ansList . add ( N2 ) ;
    N -= N2 ;
  }
  else if ( N >= N1 ) {
    ansList . add ( N1 ) ;
    N -= N1 ;
  }
  System . out . println ( ansList . size ( ) ) ;
  for ( int i = 0 ;
  i < ansList . size ( ) ;
  i ++ ) {
    System . out . println ( ansList . get ( i ) ) ;
  }
  return ansList . toArray ( new Integer [ ansList . size ( ) ] ) ;
}
