public static double find ( ArrayList < Pair < Integer , Integer >> a , int x ) {
  if ( x == 0 ) return a . get ( 0 ) . getValue ( ) ;
  Pair < Integer , Integer > last = new Pair < Integer , Integer > ( 0 , a . get ( 0 ) . getValue ( ) ) ;
  Iterator < Pair < Integer , Integer >> iter = a . iterator ( ) ;
  while ( iter . hasNext ( ) ) {
    Pair < Integer , Integer > nx = iter . next ( ) ;
    if ( nx . compareTo ( x ) < 0 ) {
      last = new Pair < Integer , Integer > ( nx , ny ) ;
      continue ;
    }
    Pair < Integer , Integer > lx = last . first ( ) ;
    Pair < Integer , Integer > ly = last . second ( ) ;
    double p = ( x - lx . getValue ( ) ) * 1.0 / ( nx . getValue ( ) - lx . getValue ( ) ) ;
    return ly . add ( ( ny . getValue ( ) - ly . getValue ( ) ) ) . multiply ( p ) ;
  }
  return null ;
  /* find the first element in the list */
  double l = 0.0 ;
  double r = x0 ;
  for ( int i : xrange ( 100 ) ) {
    double m = ( l + r ) / 2.0 ;
    if ( m * ( y1 + y1 + ( y2 - y1 ) * m / x0 ) / 2.0 > area ) r = m ;
    else l = m ;
  }
  /* run */
  final int W = Integer . parseInt ( input . readLine ( ) ) ;
  final int L = Integer . parseInt ( input . readLine ( ) ) ;
  final int U = Integer . parseInt ( input . readLine ( ) ) ;
  final int G = Integer . parseInt ( input . readLine ( ) ) ;
  final ArrayList < Integer > low = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    low . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  }
  final ArrayList < Integer > high = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < U ;
  i ++ ) {
    high . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  }
  final ArrayList < Pair < Integer , Integer >> xs = new ArrayList < Pair < Integer , Integer >> ( ) ;
  for ( int i = 0 ;
  i < G ;
  i ++ ) {
    xs . add (