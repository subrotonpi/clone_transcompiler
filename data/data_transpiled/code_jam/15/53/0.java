public static final Scanner reader = new Scanner ( ) {
  public int next ( final int [ ] inFile ) {
    final int Y = inFile [ 0 ] ;
    final int N = inFile [ 1 ] ;
    final int [ ] Ps = inFile [ 2 ] ;
    final int [ ] Ss = inFile [ 3 ] ;
    return ( Y < N ) ? Y : N ;
  }
  public int nextInt ( ) {
    return N ;
  }
  public int nextInt ( ) {
    return N ;
  }
  public int nextLong ( ) {
    return N ;
  }
  public boolean hasNext ( ) {
    return true ;
  }
  public int nextLong ( ) {
    return 0 ;
  }
  public double nextDouble ( ) {
    return 0 ;
  }
  public double nextDouble ( ) {
    if ( freeMask == 0 ) {
      return time ;
    }
    if ( ( tv != - 1 ) && time > tv ) {
      return tv ;
    }
    final int [ ] nextLeft = new int [ ] {
      - 1 , - 1 , - 1 }
      ;
      final int [ ] nextRight = new int [ ] {
        - 1 , - 1 , - 1 }
        ;
        for ( int j : xrange ( N ) ) {
          if ( ( freeMask >> j ) & 1 ) {
            if ( Ps [ j ] > 0 ) {
              final double t = ( double ) ( ( Ps [ j ] + Ss [ j ] * time ) - loc ) / ( Y - Ss [ j ] ) ;
              final double l = loc + Y * t ;
              if ( nextRight [ 0 ] == - 1 || nextRight [ 2 ] > time + t ) {
                nextRight [ 0 ] = nextLong ( ) ;
              }
            }
            else {
              final double t = ( double ) ( ( Ps [ j ] - Ss [ j ] * time ) - loc ) / ( Ss [ j ] - Y ) ;
              final double l = loc - Y * t ;
              if ( nextLeft [ 0 ] == - 1 || nextLeft [ 2 ] > time + t ) {
                nextLeft [ 0 ] = nextLong ( ) ;
              }
            }
          }
        }
        switch ( nextLeft [ 0 ] ) {
          case - 1 : return solve ( nextRight , Y , N , Ps , Ss , tv ) ;
          case - 1 : return solve ( nextLeft , Y , N , Ps , Ss , tv ) ;
        }
        final int scl = solve ( nextLeft , Y , N , Ps , Ss , tv ) ;
        if ( ( tv == - 1 ) || ( scl < tv ) ) {
          tv = scl ;
        }
        return