public static int [ ] [ ] getA ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( String a : input . nextLine ( ) . split ( " " ) ) {
    A . add ( Integer . parseInt ( a ) ) ;
  }
  int maxi = Collections . max ( A ) ;
  int mini = Collections . min ( A ) ;
  int maxiidx = A . indexOf ( maxi ) ;
  int miniidx = A . indexOf ( mini ) ;
  System . out . println ( 2 * N - 1 ) ;
  if ( maxi >= Math . abs ( mini ) ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      System . out . println ( maxiidx + 1 + " " + i + 1 ) ;
    }
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      System . out . println ( i + " " + i + 1 ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      System . out . println ( miniidx + 1 + " " + i + 1 ) ;
    }
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      System . out . println ( i + " " + i ) ;
    }
  }
  return A . toArray ( new int [ N ] [ ] {
  }
  ) ;
}
