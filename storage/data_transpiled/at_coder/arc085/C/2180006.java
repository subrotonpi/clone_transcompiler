@ GwtIncompatible ( "System.out" ) public static int [ ] solve ( final String input ) {
  final int N = Integer . parseInt ( input ) ;
  final int [ ] a = new int [ N ] ;
  for ( int w : input . split ( " " ) ) {
    a [ w ] = Integer . parseInt ( input ) ;
  }
  if ( a . length != N ) throw new RuntimeException ( ) ;
  System . out . println ( solve ( a ) ) ;
  final Set < Integer > multiples = new HashSet < Integer > ( ) {
    {
      for ( int i = 0 ;
      i < N ;
      i += i ) {
        for ( int j = 0 ;
        j < N ;
        j += i ) {
          a [ i ] = j ;
        }
      }
    }
  }
  ;
  return multiples . toArray ( a ) ;
}
