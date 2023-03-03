@ VisibleForTesting static int func ( int a , int b ) {
  if ( a == b ) {
    return ( a - 1 ) * 2 ;
  }
  else {
    int sq = ( int ) Math . sqrt ( a * b ) ;
    if ( a * b == sq * sq ) {
      return ( sq - 1 ) * 2 - 1 ;
    }
    else if ( sq * ( sq + 1 ) > a * b ) {
      return ( sq - 1 ) * 2 ;
    }
    else if ( sq * ( sq + 1 ) == a * b ) {
      if ( Math . abs ( a - b ) == 1 ) {
        return ( sq - 1 ) * 2 ;
      }
      else {
        return ( sq - 1 ) * 2 ;
      }
    }
    else {
      return sq * 2 - 1 ;
    }
  }
}
