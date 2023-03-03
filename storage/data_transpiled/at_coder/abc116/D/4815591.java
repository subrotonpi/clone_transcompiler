static final void solve ( int N , int K , @ Nonnull final List < Integer > t , @ Nonnull final List < Integer > d ) {
  final HashMap < Integer , List < Integer >> group = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int k = t . get ( i ) ;
    final int v = d . get ( i ) ;
    if ( group . containsKey ( k ) ) group . get ( k ) . add ( v ) ;
    else group . put ( k , new ArrayList < > ( ) ) ;
  }
  final List < List < Integer >> groups = new ArrayList < > ( group . values ( ) ) ;
  for ( final List < Integer > g : groups ) {
    Collections . sort ( g , Collections . reverseOrder ( ) ) ;
  }
  Collections . sort ( groups , new Comparator < List < Integer >> ( ) {
    @ Override public int compare ( final List < Integer > o1 , final List < Integer > o2 ) {
      final int h = o1 . size ( ) ;
      int ret = 0 ;
      int base = 0 ;
      for ( int i = 0 ;
      i < Math . min ( groups . size ( ) , K ) ;
      i ++ ) {
        final List < Integer > g = groups . get ( i ) ;
        final int bonus = ( i + 1 ) * ( i + 1 ) ;
        for ( int j = 0 ;
        j < g . size ( ) ;
        j ++ ) {
          final int v = g . get ( j ) ;
          if ( j == 0 ) {
            if ( h . size ( ) > K - ( i + 1 ) ) {
              final int remove = heapSort ( h ) ;
              if ( remove > 0 ) {
                base = base - remove + v ;
              }
            }
            else if ( h . size ( ) < K - ( i + 1 ) ) {
              heapSort ( h ) ;
              base += v ;
            }
            else if ( h . size ( ) > 0 && h . get ( 0 ) < v ) {
              base += v - h . get ( 0 ) ;
              heapSort ( h ) ;
            }
            ret = Math . max ( ret , base + bonus ) ;
          }
        }
        System . out . println ( ret ) ;
        return 0 ;
      }
    }
    ) ;
  }
  