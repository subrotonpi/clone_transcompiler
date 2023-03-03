static final void solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    P [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int [ ] [ ] table = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    table [ P [ i ] - 1 ] [ i ] = i + 1 ;
  }
  final int [ ] dp = new int [ N ] ;
  new Thread ( ) {
    public void run ( ) {
      for ( int pa = 0 ;
      pa < table . length ;
      pa ++ ) {
        tree ( table [ pa ] ) ;
      }
      int t = table [ pa ] . length ;
      if ( t == 0 ) {
        return ;
      }
      Set < Integer > T = new HashSet < Integer > ( ) ;
      int s = 0 ;
      for ( int i = 0 ;
      i < t ;
      i ++ ) {
        int x = table [ pa ] [ i ] ;
        s += X [ x ] + dp [ x ] ;
        if ( i == 0 ) {
          if ( X [ x ] <= X [ pa ] ) {
            T . add ( X [ x ] ) ;
          }
          if ( dp [ x ] <= X [ pa ] ) {
            T . add ( dp [ x ] ) ;
          }
          continue ;
        }
        Set < Integer > S = new HashSet < Integer > ( ) ;
        for ( int k = 0 ;
        k < T . size ( ) ;
        k ++ ) {
          if ( k + X [ x ] <= X [ pa ] ) {
            S . add ( k + X [ x ] ) ;
          }
          if ( k + dp [ x ] <= X [ pa ] ) {
            S . add ( k + dp [ x ] ) ;
          }
        }
        T = S ;
      }
      if ( T . size ( ) == 0 ) {
        System . out . println ( "IMPOSSIBLE" ) ;
        System . exit ( 0 ) ;
      }
      dp [ pa ] = s - max ( T ) ;
      return ;
    }
  }
  . start ( ) ;
  System .