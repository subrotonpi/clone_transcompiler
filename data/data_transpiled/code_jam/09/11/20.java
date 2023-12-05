static final boolean solve ( int k , int b , HashMap < Integer , Boolean > memo ) {
  psyco . full ( ) ;
  /* happy */
  if ( ( k = memo . containsKey ( new Integer ( k ) ) ) ) return memo . get ( new Integer ( k ) ) ;
  if ( b == 2 || b == 4 ) return true ;
  HashSet < Integer > seen = new HashSet < Integer > ( ) ;
  seen . add ( k ) ;
  int m = k ;
  boolean res ;
  do {
    int sqs = 0 ;
    while ( m > 0 ) {
      sqs += ( m % b ) * ( m % b ) ;
      m = m / b ;
    }
    m = sqs ;
    if ( ( m = memo . containsKey ( new Integer ( m ) ) ) ) {
      res = true ;
      break ;
    }
  }
  while ( m > 0 ) ;
  memo . put ( new Integer ( k ) , res ) ;
  return res ;
}
