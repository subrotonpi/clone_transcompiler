@ VisibleForTesting static final Scanner getBeams ( Scanner scanner , int ip , int jp ) {
  final boolean beam = true ;
  final int beam_i , beam_j ;
  for ( int i = ip ;
  i >= 0 ;
  i -- ) {
    if ( scanner . next ( ) . charAt ( jp ) == '#' || scanner . next ( ) . charAt ( jp ) == '-' ) {
      break ;
    }
    if ( scanner . next ( ) . charAt ( jp ) == '|' || scanner . next ( ) . charAt ( jp ) == '?' ) {
      beam_i = 0 ;
      beam_j = 0 ;
      for ( int j = 0 ;
      j < beam_i ;
      j ++ ) {
        if ( scanner . next ( ) . charAt ( j ) == '#' ) {
          beam = false ;
        }
        else if ( scanner . next ( ) . charAt ( j ) == '.' ) {
          continue ;
        }
        else if ( scanner . next ( ) . charAt ( j ) == '|' ) {
          beam = true ;
          beam_i = i ;
          beam_j = j ;
        }
        else {
          if ( scanner . next ( ) . charAt ( beam_j ) == '|' || scanner . next ( ) . charAt ( j ) == '|' ) {
            System . out . println ( "IMPOSSIBLE" ) ;
            return ;
          }
          beam_i = i ;
          beam_j = j ;
        }
      }
    }
  }
  for ( int i = ip ;
  i < scanner . nextInt ( ) * 2 ;
  i ++ ) {
    if ( scanner . next ( ) . charAt ( jp ) == '#' || scanner . next ( ) . charAt ( jp ) == '|' ) {
      break ;
    }
    if ( scanner . next ( ) . charAt ( j ) == '-' || scanner . next ( ) . charAt ( j ) == '?' ) {
      beam_i = i ;
      beam_j = j ;
    }
    else {
      if ( scanner . next ( ) . charAt ( j ) == '.' ) {
        beam_i = j ;
        beam_j = i ;
      }
      else {
        if ( scanner . next ( ) . charAt ( j ) == '|' ) {
          beam_i = j ;
          beam_j = j ;
        }
        else if ( scanner . next ( ) . charAt ( j ) == '|' ) {
          beam_i = j ;
          beam_j = i ;
        }
      }
    }
  }
  return scanner ;
}
