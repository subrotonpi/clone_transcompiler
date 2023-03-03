public static int n ( Scanner input ) {
  int c = input . nextInt ( ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) l . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Point [ ] rev = new Point [ n + 1 ] ;
  Point [ ] norm = new Point [ n + 1 ] ;
  Point [ ] revmax = new Point [ n + 1 ] ;
  rev [ 0 ] = new Point ( 0 , 0 ) ;
  revmax [ 0 ] = new Point ( 0 , 0 ) ;
  norm [ 0 ] = new Point ( 0 , 0 ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int x = l . get ( i - 1 ) ;
    int v = l . get ( i ) ;
    norm [ i ] = new Point ( x , v + norm [ i - 1 ] . y ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int x = l . get ( l . size ( ) - i ) ;
    int v = l . get ( l . size ( ) - i ) ;
    rev [ rev . size ( ) - i ] = new Point ( c - x , v + rev [ rev . size ( ) - i + 1 ] . y ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    revmax [ revmax . size ( ) - i ] = new Point ( Math . max ( revmax [ revmax . size ( ) - i + 1 ] . x , rev [ rev . size ( ) - i ] . y - 2 * rev [ rev . size ( ) - i ] . x ) , Math . max ( revmax [ revmax . size ( ) - i + 1 ] . y , rev [ rev . size ( ) - i ] . y - rev [ rev . size ( ) - i ] . y ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int v1 = norm [ i ] . y - norm [ i ] . x + revmax [ i - n ] . x ;
    int v2 = norm [ i ] . y - 2 * norm [ i ] . x + revmax [ i - n ] . y ;
    ans = Math . max ( ans , v1 , v2 ) ;
  }
  return ans ;
  