static final void main ( String [ ] args ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  final int [ ] li = map ( Integer . parseInt ( stdin . readLine ( ) ) , Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li_ */
  final int [ ] li = map ( Integer . parseInt ( stdin . readLine ( ) ) , Integer . parseInt ( stdin . readLine ( ) ) - 1 ) ;
  /* lf */
  final double [ ] lf = map ( Double . parseDouble ( stdin . readLine ( ) ) , Double . parseDouble ( stdin . readLine ( ) ) ) ;
  /* ls */
  final String [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  /* ns */
  final String [ ] ns = stdin . readLine ( ) . replaceAll ( " " , "" ) ;
  /* lc */
  final LinkedList < String > lc = new LinkedList < String > ( ) ;
  /* ni */
  final int ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* nf */
  final double nf = Double . parseDouble ( stdin . readLine ( ) ) ;
  final int N = li [ 0 ] ;
  final int x = li [ 1 ] ;
  if ( x == 1 || x == 2 * N - 1 ) {
    System . out . println ( "No" ) ;
  }
  else if ( N == x ) {
    System . out . println ( "Yes" ) ;
    System . out . println ( 1 ) ;
    System . out . println ( 2 ) ;
    System . out . println ( 3 ) ;
  }
  else {
    final int [ ] ans = new int [ 2 * N - 1 ] ;
    ans [ N - 1 ] = x ;
    final int [ ] used ;
    if ( x == 2 ) {
      ans [ N - 2 ] = x + 2 ;
      ans [ N ] = x - 1 ;
      ans [ N + 1 ] = x + 1 ;
      used = new int [ ] {
        x - 1 , x , x + 1 , x + 2 }
        ;
      }
      else {
        ans [ N - 2 ] = x - 1 ;
        ans [ N ] = x + 1 ;
        ans [ N + 1 ] = x - 2 ;
        used = new int [ ] {
          x - 2 , x - 1 , x , x + 1 }
          ;
        }
        final ArrayList < Integer > rem = new ArrayList < Integer