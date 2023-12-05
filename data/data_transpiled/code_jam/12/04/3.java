@ VisibleForTesting static double [ ] [ ] [ ] matrix ( ) {
  final double precision = 0.01 ;
  final double [ ] [ ] [ ] seeReflection = {
    double [ ] [ ] [ ] }
    ;
    final int curY = x [ 0 ] ;
    final int curX = x [ 1 ] ;
    final double vy = v [ 0 ] ;
    final double [ ] [ ] neighbors = new double [ 3 ] [ 3 ] ;
    int intX = v [ 1 ] ;
    final double dist = 0 ;
    while ( dist <= d + precision ) {
      if ( Math . abs ( curX - x [ 1 ] ) < precision && Math . abs ( curY - x [ 0 ] ) < precision && dist > 0 ) {
        intX = ( int ) roundX ;
      }
      final int nextX = intX ;
      if ( nextX == 0 ) {
        nextY = - vy ;
      }
      else {
        if ( nextY == 0 ) {
          curX -= 0.5 ;
        }
        else {
          curX += 0.5 ;
        }
        if ( Math . abs ( curX - round ( curX ) ) < precision ) {
          if ( nextY == 0 ) {
            nextY = - vy ;
          }
          else {
            nextY = intX ;
          }
        }
        if ( nextY == 1 ) {
          if ( nextY == 0 ) {
            nextY = - vy ;
          }
          else {
            if ( nextY == 0 ) {
              nextY = - vy ;
            }
            else {
              if ( nextY == 0 ) {
                nextY = - vy ;
              }
            }
            else {
              if ( nextY == 0 ) {
                nextY = - vy ;
              }
            }
            else {
              if ( nextY == 0 ) {
                nextY = - vy ;
              }
            }
            else {
              if ( nextY == 0 ) {
                nextY = - vy ;
              }
            }
            else {
              nextY = - vy ;
            }
          }
          if ( nextY == 0 ) {
            nextY = - vy ;
          }
          else {
            curY += 0.5 ;
          }
          final int H = - 1 ;
          final int D = - 1 ;
          final int [ ] m = new int [ N ] ;
          for ( int i = 0 ;
          i < H ;
          i ++ ) {
            final int j = nextY ;
            if ( nextY == 0 && nextY == - 1 ) {
              if ( nextY == - 1 ) {
                nextY = - vy ;
              }
            }
            else {
              nextY = - vy ;
            }
          }
          int count = 0 ;
          for ( final double [ ] vector : vectors ) {
            if ( seeReflection [ x ] [ j ] ==