public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] [ b ] = b - 1 ;
    G [ b - 1 ] [ a - 1 ] = a ;
  }
  @ SuppressWarnings ( "unchecked" ) Queue < Integer > bfs = new LinkedList < > ( ) ;
  {
    {
      {
        final Deque < Integer > que = new ArrayDeque < > ( ) ;
        {
          final TIntIntHashMap < Integer > dist = new TIntIntHashMap < > ( ) ;
          {
            final TIntIntHashMap < Integer > prev = new TIntIntHashMap < > ( ) ;
            {
              while ( que . size ( ) > 0 ) {
                int u = que . pop ( ) ;
                int d = dist . get ( u ) ;
                for ( int w : G [ u ] ) {
                  if ( dist . containsKey ( w ) ) continue ;
                  dist . put ( w , d + 1 ) ;
                  prev . put ( w , u ) ;
                  que . push ( w ) ;
                }
              }
            }
            int w = u ;
            final TIntIntHashMap < Integer > D = new TIntIntHashMap < > ( ) ;
            while ( w != v ) {
              D . add ( w ) ;
              w = prev . get ( w ) ;
            }
            D . add ( v ) ;
          }
        }
      }
      ;
    }
    @ SuppressWarnings ( "unchecked" ) int [ ] res = new int [ N ] ;
    {
      {
        int u = - 1 ;
        {
        }
      }
    }
    ;
    {
      {
        final Deque < Integer > que = new ArrayDeque < > ( ) ;
        {
          if ( v != - 1 ) que . add ( v ) ;
          final Set < Integer > used = new HashSet < > ( ) ;
          {
            final int x = x ;
            {
              int v = que . pop ( ) ;
              int d = D . get ( v ) ;
              for ( int w : G [ v ] ) {
                if ( used . contains ( w ) ) continue ;
                D . put ( w , d + 1 ) ;
                que . push ( w ) ;
                used . add ( w ) ;
                E . put ( d + 1 , Math . max ( E . getOrDefault ( d + 1 , 0 ) , G [ w ] . size ( ) - 1 ) ) ;
              }
              