static public @ Nonnull double takahashi_ball1 ( int A , int B , int C ) {
  final double E = 10 * ( - 6 ) ;
  {
    return A * t + B * Math . sin ( C * t * Math . PI ) ;
  }
  {
    return A * t + B * Math . sin ( C * t * Math . PI ) ;
  }
  {
    double ta , tb , g ;
    double m , ta , tb ;
    if ( g . compare ( tb ) < 0 ) {
      ta = tb ;
      tb = ta ;
    }
    do {
      m = ( ta + tb ) / 2 ;
      if ( Math . abs ( g . compare ( m ) ) < E ) {
        return m ;
      }
      if ( g . compare ( m ) < 0 ) {
        ta = m ;
      }
      else {
        tb = m ;
      }
    }
    while ( g . compare ( ta , tb ) < 0 ) ;
    ta = 0 ;
    k = 0 ;
    do {
      tb = ta ;
      ta = ( 2 * k + 1 ) / ( 2 * C ) ;
    }
    while ( ( ta = ta + tb ) < 0 ) ;
    if ( ( tb = ta + tb ) * ( ta = ta ) < 0 ) {
      return newton ( ta , tb , x -> {
        if ( x < 0 ) {
          return x ;
        }
        else if ( ( x < 0 ) && x > 0 ) {
          return x ;
        }
        else {
          return y ;
        }
      }
      ) ;
    }
    else if ( ( tb = tb ) * ( ta = ta ) <= E * E ) {
      if ( Math . abs ( tb ) <= E ) {
        return tb ;
      }
      if ( Math . abs ( ta ) <= E ) {
        return ta ;
      }
    }
    else {
      k ++ ;
    }
  }
}
