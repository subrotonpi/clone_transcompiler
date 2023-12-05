static int [ ] readInt ( ) {
  final int [ ] result = new int [ N ] ;
  System . arraycopy ( readIntArray ( ) , 0 , result , 0 , N ) ;
  final int [ ] X = new int [ N ] ;
  final int [ ] Y = new int [ N ] ;
  final int [ ] Z = new int [ N ] ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    final int n = readIntArray ( ) ;
    final int m = readIntArray ( ) ;
    final int X = readIntArray ( ) ;
    final int Y = readIntArray ( ) ;
    final int Z = readIntArray ( ) ;
    final int [ ] A = new int [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      A [ i ] = readIntArray ( ) ;
    }
    final int [ ] sequence = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      sequence [ i ] = ( int ) A [ i % m ] ;
      A [ i % m ] = ( int ) ( ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ) ;
    }
    final HashMap < Integer , Integer > counts = new HashMap < Integer , Integer > ( ) ;
    for ( int s : new ArrayList < Integer > ( sequence ) ) {
      int t = 1 ;
      for ( int i : counts . keySet ( ) ) {
        if ( i > s ) t += counts . get ( i ) ;
      }
      if ( counts . containsKey ( s ) ) counts . put ( s , t ) ;
      else counts . put ( s , t ) ;
    }
    System . out . printf ( "Case #%i: %i%n" , k + 1 , Arrays . toString ( counts . values ( ) ) % 1000000007 ) ;
  }
  return result ;
}
