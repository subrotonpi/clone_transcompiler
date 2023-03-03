static final void setIn ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  map ( Integer :: parseInt , stdin . readLine ( ) . split ( " " ) ) ;
  /* li_ */
  map ( Integer :: parseInt , stdin . readLine ( ) . split ( " " ) ) ;
  /* lf */
  map ( Double :: parseDouble , stdin . readLine ( ) . split ( " " ) ) ;
  /* ls */
  String [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  /* ns */
  String [ ] ns = stdin . readLine ( ) . split ( " " ) ;
  /* lc */
  Collections . sort ( ns ) ;
  /* ni */
  int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* nf */
  double n = ni ( ) ;
  List < Integer > a = new LinkedList < Integer > ( li ) ;
  /* judge a to the list of integers */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int ai = a . get ( i ) ;
    if ( ai >= n ) {
      return true ;
    }
  }
  /* n = n*/
  int ans = 0 ;
  while ( judge ( a , n ) ) {
    int amax = Collections . max ( a ) ;
    int argmax = a . indexOf ( amax ) ;
    int x = - ( - ( amax - ( n - 1 ) ) ) / n ;
    ans += x ;
    List < Integer > nex = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      nex . add ( ai + x ) ;
    }
    a = nex ;
  }
  System . out . println ( ans ) ;
}
