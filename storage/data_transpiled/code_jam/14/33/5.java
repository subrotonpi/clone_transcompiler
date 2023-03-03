public static void solve ( int testnum ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  /* valid pt */
  boolean [ ] [ ] board = new boolean [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) board [ i ] [ 0 ] = false ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) board [ i ] [ i ] = true ;
  List < Point > perimeter = new ArrayList < Point > ( ) ;
  perimeter . add ( new Point ( x , y ) ) ;
  int num = 1 ;
  int en = 1 ;
  while ( en < k ) {
    Point bestpt = null ;
    int bestct = 6 ;
    for ( Point pt : perimeter ) {
      if ( pt . x == 0 || pt . x == m - 1 || pt . y == 0 || pt . y == n - 1 ) {
        if ( valid ( new Point ( pt . x + dx , pt . y + dy ) ) && ! board [ pt . y + dy ] [ pt . x + dx ] ) {
          ct = 5 ;
        }
        else {
          continue ;
        }
      }
      else {
        ct = new Point ( 1 , 0 ) ;
      }
      if ( ! board [ pt . y + dy ] [ pt . x + dx ] ) {
        if ( ! board [ pt . y + dy ] [ pt . x + dx ] ) {
          continue ;
        }
      }
      if ( ct < bestct ) {
        bestpt = pt ;
        bestct = ct ;
      }
    }
    if ( bestct == 0 || bestct == 6 ) {
      break ;
    }
    for ( int dx = 1 , dy = 1 ;
    ;
    dx < bestpt . x ;
    dx ++ , dy ++ ) {
      Point newpt = new Point ( bestpt . x + dx , bestpt . y + dy ) ;
      if ( ! valid ( newpt ) ) continue ;
      if ( ! board [ newpt . y ] [ newpt . x ] ) {
        board [ newpt . y ] [ newpt . x ] = true ;
        perimeter . add ( newpt ) ;
        en ++ ;
        if ( bestct > 1 ) num ++ ;
        else perimeter . remove ( bestpt ) ;
      }
      break ;
    }
  }
  if ( en >= k ) {
    System . out . println ( " Case ▁