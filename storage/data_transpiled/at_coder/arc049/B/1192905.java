static final Scanner input = new Scanner ( System . in ) {
  @ Override public int nextInt ( ) {
    return Integer . MAX_VALUE ;
  }
}
;
final int N = Integer . parseInt ( input . nextLine ( ) ) ;
final int [ ] [ ] xyc = new int [ N ] [ ] ;
int r = - inf ;
int l = inf ;
int u = - inf ;
int d = inf ;
double Mx = - inf ;
double mx = inf ;
double My = - inf ;
double my = - inf ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  xyc [ i ] = new int [ ] {
    x , y , c }
    ;
    r = Math . max ( r , x ) ;
    l = Math . min ( l , x ) ;
    u = Math . max ( u , y ) ;
    d = Math . min ( d , y ) ;
  }
  int xChecked = 0 ;
  while ( r - l > 10 * ( - 5 ) ) {
    xChecked = 1 ;
    int m = ( r + l ) / 2 ;
    Mx = - 10 * 10 ;
    mx = 10 * 10 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      double t = ( xyc [ i ] [ 0 ] - m ) * xyc [ i ] [ 2 ] ;
      Mx = Math . max ( Mx , t ) ;
      mx = Math . min ( mx , t ) ;
    }
    if ( Math . abs ( Mx ) > Math . abs ( mx ) ) {
      l = m ;
    }
    else {
      r = m ;
    }
  }
  int yChecked = 0 ;
  while ( u - d > 10 * ( - 5 ) ) {
    yChecked = 1 ;
    int m = ( u + d ) / 2 ;
    My = - 10 * 10 ;
    my = 10 * 10 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      double t = ( xyc [ i ] [ 1 ] - m ) * xyc [ i ] [ 2 ] ;
      My = Math . max ( My , t ) ;
      my = Math . min ( my , t ) ;
    }
    if ( Math . abs ( My ) > Math . abs ( my ) ) {
      d = m ;
    }
    else {
      if