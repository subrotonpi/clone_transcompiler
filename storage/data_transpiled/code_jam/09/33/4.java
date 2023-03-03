static int compute ( int p , int q , int [ ] pris , HashMap < Integer , Integer > memo , int [ ] ends ) {
  if ( memo . containsKey ( ends ) ) {
    return memo . get ( ends ) ;
  }
  int [ ] rempris = Arrays . copyOf ( pris , pris . length ) ;
  if ( rempris . length == 0 ) {
    memo . put ( ends , 0 ) ;
    return 0 ;
  }
  int optimal = - 1 ;
  for ( int x : rempris ) {
    int val1 = compute ( p , q , rempris , memo , new Integer ( ends [ 0 ] ) , x - 1 ) ;
    int val2 = compute ( p , q , rempris , memo , new Integer ( x + 1 ) , ends [ 1 ] ) ;
    int nval = ( ends [ 1 ] - ends [ 0 ] ) + val1 + val2 ;
    if ( optimal == - 1 || nval < optimal ) {
      optimal = nval ;
    }
  }
  memo . put ( ends , optimal ) ;
  return optimal ;
}
int nt = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int it = 1 ;
it <= nt ;
it ++ ) {
  String [ ] pq = System . console ( ) . readLine ( ) . split ( " " ) ;
  Arrays . sort ( pris ) ;
  int p = Integer . parseInt ( pq [ 0 ] ) ;
  int q = Integer . parseInt ( pq [ 1 ] ) ;
  memo . clear ( ) ;
  System . out . println ( "Case #" + it + ": " + compute ( p , q , pris , memo , new Integer ( 1 ) ) ) ;
}
