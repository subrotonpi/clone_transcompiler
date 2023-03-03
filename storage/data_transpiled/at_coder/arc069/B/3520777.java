public static boolean flip ( char [ ] s ) {
  int n = Integer . parseInt ( input ) ;
  String s = input ;
  /* check the first char in the string */
  if ( s . charAt ( 0 ) == 'o' ) {
    if ( s . charAt ( 0 ) == 'S' ) {
      if ( s . charAt ( s . length ( ) - 1 ) != s . charAt ( 1 ) ) {
        return false ;
      }
    }
    else {
      if ( s . charAt ( s . length ( ) - 1 ) == s . charAt ( 1 ) ) {
        return false ;
      }
    }
    else {
      if ( s . charAt ( s . length ( ) - 1 ) == s . charAt ( 1 ) ) {
        return false ;
      }
    }
  }
  else {
    if ( s . charAt ( 0 ) == 'S' ) {
      if ( s . charAt ( s . length ( ) - 1 ) == s . charAt ( 1 ) ) {
        return false ;
      }
    }
    else {
      if ( s . charAt ( s . length ( ) - 1 ) != s . charAt ( 1 ) ) {
        return false ;
      }
    }
    else {
      if ( s . charAt ( s . length ( ) - 1 ) == s . charAt ( 1 ) ) {
        return false ;
      }
    }
  }
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    if ( s . charAt ( i ) == 'o' ) {
      if ( s . charAt ( i ) == 'S' ) {
        if ( s . charAt ( i - 1 ) != s . charAt ( i + 1 ) ) {
          return false ;
        }
      }
      else {
        if ( s . charAt ( i - 1 ) == s . charAt ( i + 1 ) ) {
          return false ;
        }
      }
      else {
        if ( s . charAt ( i ) == 'S' ) {
          if ( s . charAt ( i - 1 ) != s . charAt ( i + 1 ) ) {
            return false ;
          }
        }
        else {
          if ( s . charAt ( i - 1 ) == s . charAt ( i + 1 ) ) {
            return false ;
          }
        }
      }
      else {
        if ( s . charAt ( i ) == 'S' ) {
          if ( s . charAt ( i - 1 ) == s . charAt ( i + 1 ) ) {
            return false ;
          }
        }
        else {
          if ( s . charAt ( i ) == 'W' ) {
            return false ;
          }
        }
      }
    }
    return true ;
  }
  