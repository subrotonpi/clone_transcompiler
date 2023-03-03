public static int T = Integer . parseInt ( Scanner in ) {
  for ( int kei : xrange ( T ) ) {
    int N = in . nextInt ( ) ;
    int [ ] height = new int [ N ] ;
    int succ = 0 ;
    ArrayList < ArrayList < Integer >> q = new ArrayList < ArrayList < Integer >> ( ) ;
    for ( int i : xrange ( N ) ) {
      int d = in . nextInt ( ) ;
      int n = in . nextInt ( ) ;
      int w = in . nextInt ( ) ;
      int e = in . nextInt ( ) ;
      int s = in . nextInt ( ) ;
      int dd = in . nextInt ( ) ;
      int dp = in . nextInt ( ) ;
      int ds = in . nextInt ( ) ;
      for ( int a : xrange ( n ) ) {
        int nd = d + dd * a ;
        int nw = w + dp * a ;
        int ne = e + dp * a ;
        int ns = s + ds * a ;
        q . add ( new ArrayList < Integer > ( ) ) ;
      }
    }
    Collections . sort ( q ) ;
    ArrayList < Integer > temp = new ArrayList < Integer > ( ) ;
    ArrayList < ArrayList < Integer >> group = new ArrayList < ArrayList < Integer >> ( ) ;
    for ( int i : q ) {
      if ( temp . size ( ) == 0 || temp . get ( 0 ) . intValue ( ) == i ) {
        temp . add ( i ) ;
      }
      else {
        group . add ( temp ) ;
        temp = new ArrayList < Integer > ( ) ;
      }
    }
    if ( temp . size ( ) > 0 ) group . add ( temp ) ;
    for ( ArrayList < Integer > i : group ) {
      Iterator < Integer > it = i . iterator ( ) ;
      while ( it . hasNext ( ) ) {
        int d = it . next ( ) ;
        int w = d - 1 ;
        int e = w - 1 ;
        int s = e - 1 ;
        int tribe = temp . get ( 0 ) ;
        for ( int j : xrange ( w , e ) ) {
          if ( ! height [ j ] ) height [ j ] = 0 ;
          if ( height [ j ] < s ) {
            succ ++ ;
            break ;
          }
        }
      }
      it = i . iterator ( ) ;
      while ( it . hasNext ( ) ) {
        int d = it . next ( ) ;
        int w = d - 1 ;
        int e = e - 1 ;
        int s = s - 1 ;
        int tribe = temp . get ( j )