public static double N = Integer . parseInt ( input ) {
  /* di */
  ArrayList < Point > A = new ArrayList < Point > ( ) ;
  double ax = 0 ;
  double ay = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    A . add ( new Point ( x , y ) ) ;
    ax += x ;
    ay += y ;
  }
  ax /= N ;
  ay /= N ;
  double d = 0 ;
  Iterator < Point > it = A . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    d = Math . max ( d , Math . abs ( x - ax ) * Math . abs ( y - ay ) ) ;
  }
  return d * 0.5 ;
}
