@ org . python . Method ( __doc__ = "" ) public static org . python . Object __readList ( ) {
  /* read from stdin */
  int T = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* pad 0 */
  org . python . Object [ ] Y = new org . python . Object [ T ] ;
  /* pad 0 */
  org . python . Object [ ] X = new org . python . Object [ T ] ;
  /* pad 1 */
  for ( int k = 0 ;
  k < T ;
  k ++ ) {
    System . out . println ( "Case #" + ( k + 1 ) + ":" ) ;
    int D = stdin . readInt ( ) ;
    int N = stdin . readInt ( ) ;
    int A = stdin . readInt ( ) ;
    int N = stdin . readInt ( ) ;
    int A = stdin . readInt ( ) ;
    X [ 0 ] = new int [ N ] ;
    T [ 0 ] = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int t = stdin . readInt ( ) ;
      X [ i ] = stdin . readInt ( ) ;
      T [ i ] = stdin . readInt ( ) ;
      N = i + 1 ;
      break ;
    }
  }
  int [ ] X = new int [ N ] ;
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = stdin . readInt ( ) ;
    int x = stdin . readInt ( ) ;
    X [ i ] = x ;
    T [ i ] = stdin . readInt ( ) ;
  }
  int Accs = stdin . readInt ( ) ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    if ( X [ i ] > D ) {
      if ( i > 0 ) {
        float v = ( X [ i ] - X [ i - 1 ] ) / ( T [ i ] - T [ i - 1 ] ) ;
        T [ i ] = T [ i ] - ( X [ i ] - D ) / v ;
      }
      X [ i ] = D ;
      N = i + 1 ;
      break ;
    }
  }
  int x0 = 0 ;
  int v0 = 0 ;
  int t = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    dt = T [ i ] - T [ i - 1 ] ;
    int Xend = x0 + v0 * dt + a *