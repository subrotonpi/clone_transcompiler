static final int [ ] getSortedList ( int [ ] [ ] array ) {
  System . setIn ( array ) ;
  final Iterator fin = new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) . split ( "\n" ) . iterator ( ) ;
  final int T = Integer . parseInt ( next ( array ) [ 0 ] ) ;
  for ( int t : xrange ( T ) ) {
    final int N = Integer . parseInt ( next ( array ) [ 0 ] ) ;
    final Set [ ] g = new Set [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) g [ i ] = new HashSet ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int X = Integer . parseInt ( next ( array ) [ i ] ) ;
      int Y = Integer . parseInt ( next ( array ) [ i ] ) ;
      g [ X - 1 ] . add ( Y - 1 ) ;
      g [ Y - 1 ] . add ( X - 1 ) ;
    }
    return new int [ ] {
      R , R }
      ;
    }
    {
      final List < BranchInfo > branches = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        final int X = Integer . parseInt ( next ( array ) [ i ] ) ;
        final int Y = Integer . parseInt ( next ( array ) [ i ] ) ;
        if ( X != parent ) {
          final int delCount = subTreeInfo ( X , R ) ;
          final int size = subTreeInfo ( Y , R ) ;
          branches . add ( new BranchInfo ( size - delCount , delCount , size , X ) ) ;
        }
      }
      if ( branches . size ( ) == 0 ) {
        return new int [ ] {
          0 , 1 }
          ;
        }
        if ( branches . size ( ) == 1 ) {
          return branches . get ( 0 ) . _2 , branches . get ( 0 ) . _2 + 1 ;
        }
        Collections . sort ( branches , Collections . reverseOrder ( ) ) ;
        int delCount = branches . get ( 0 ) . _2 + branches . get ( 1 ) . _2 ;
        int size = branches . get ( 0 ) . _2 + branches . get ( 1 ) . _2 + 1 ;
        for ( int i = 2 ;
        i < branches . size ( ) ;
        i ++ ) {
          BranchInfo branch = branches . get ( i ) ;
          delCount += branch . _2 ;
          size += branch . _2 ;
        }
        return branches .