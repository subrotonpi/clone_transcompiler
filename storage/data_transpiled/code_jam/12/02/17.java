public static List < Triplet > triplets ( int p ) throws IOException {
  List < Triplet > result = new ArrayList < > ( ) ;
  for ( int a = p ;
  a <= 10 ;
  a ++ ) {
    for ( int b = Math . max ( a - 2 , 0 ) ;
    b <= Math . min ( a , 10 ) ;
    b ++ ) {
      for ( int c = Math . max ( a - 2 , b - 2 , 0 ) ;
      c <= Math . min ( a , b , 10 ) ;
      c ++ ) {
        result . add ( new Triplet ( a , b , c ) ) ;
      }
    }
  }
  /* surprising the triplet */
  return Math . abs ( min ( triplet ) - max ( triplet ) ) == 2 ;
  /* solve the S */
  int S = 0 ;
  List < Triplet > points = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < triplets . size ( ) ;
  i ++ ) {
    if ( Integer . parseInt ( triplets . get ( i ) ) == points . get ( 0 ) && ! ( surprising ( triplets . get ( i ) ) && S == 0 ) ) {
      points . add ( 0 ) ;
    }
  }
  /* get the solution */
  List < Triplet > ts = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < triplets . size ( ) ;
  i ++ ) {
    ts . add ( triplets . get ( i ) ) ;
    if ( Integer . parseInt ( triplets . get ( i ) ) == points . get ( 0 ) && ! ( surprising ( triplets . get ( i ) ) && S == 0 ) ) {
      points . add ( new Triplet ( i , solve ( S - Integer . parseInt ( triplets . get ( i ) ) , p , points . subList ( 1 , triplets . size ( ) ) ) ) ) ;
    }
  }
  List < Triplet > sol = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < triplets . size ( ) ;
  i ++ ) {
    ts . add ( triplets . get ( i ) ) ;
  }
  sol . sort ( ) ;
  if ( sol . size ( ) > 0 ) {
    return Collections . singletonList ( sol . get ( 0 ) ) ;
  }
  ts = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < triplets