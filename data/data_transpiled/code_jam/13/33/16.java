public static void f ( Scanner in ) throws FileNotFoundException {
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  int LEN = 100000 ;
  int [ ] spots = null ;
  /* qu(s) */
  spots = new int [ LEN ] ;
  /* set s */
  spots [ LEN ] = n ;
  /* solve */
  int nsuc = 0 ;
  int lastDay = - 1 ;
  ArrayList < Point > toBuild = new ArrayList < Point > ( ) ;
  for ( Point attack : attacks ) {
    int suc = 0 ;
    if ( attack . x != lastDay ) {
      for ( Point pos : toBuild ) {
        int h = ( ( Point ) attack . x ) . y ;
        if ( qu ( pos ) < h ) {
          set ( pos , h ) ;
        }
      }
    }
    for ( int p : xrange ( attack . x , attack . y ) ) {
      if ( qu ( p ) < attack . y ) {
        toBuild . add ( new Point ( p , attack . y ) ) ;
        suc = 1 ;
      }
    }
    nsuc += suc ;
    lastDay = attack . x ;
  }
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    attacks = new ArrayList < Point > ( ) ;
    spots = new int [ LEN ] ;
    int N = Integer . parseInt ( in . nextLine ( ) ) ;
    for ( int j = 0 ;
    j < xrange ( N ) ;
    j ++ ) {
      int d = Integer . parseInt ( in . nextLine ( ) ) ;
      int n = Integer . parseInt ( in . nextLine ( ) ) ;
      int w = Integer . parseInt ( in . nextLine ( ) ) ;
      int e = Integer . parseInt ( in . nextLine ( ) ) ;
      int s = Integer . parseInt ( in . nextLine ( ) ) ;
      int dd = Integer . parseInt ( in . nextLine ( ) ) ;
      int dp = Integer . parseInt ( in . nextLine ( ) ) ;
      int ds = Integer . parseInt ( in . nextLine ( ) ) ;
      Point [ ] attack = new Point [ n ] ;
      for ( int k = 0 ;
      k < n ;
      k ++ ) {
        attack = new Point [ n ] ;
        attack [ k ] = new Point ( d + dd * k ) ;
        attack [ k ] . x = s + ds * k ;
        attack [ k ] . y = new Point ( w + dp * k , e + dp * k ) ;
        attacks [ i ] = attack ;
      }
    }
    