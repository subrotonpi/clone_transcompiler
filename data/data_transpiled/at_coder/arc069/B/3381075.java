public static boolean assign ( String s , String ans , int n ) {
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case 'o' : if ( ans . charAt ( i ) == 'S' ) {
        if ( ans . charAt ( i - 1 ) == 'S' ) {
          ans . setChar ( 'S' ) ;
        }
        else if ( ans . charAt ( i ) == 3 ) {
          ans . setChar ( 'W' ) ;
        }
        ans = assign ( s , ans , n ) ;
        boolean check = judge ( s , ans ) ;
        if ( check ) {
          for ( int j = 0 ;
          j < n - 1 ;
          j ++ ) {
            if ( j != n - 1 ) {
              System . out . print ( ans . charAt ( j ) ) ;
            }
            else {
              System . out . println ( ans . charAt ( j ) ) ;
            }
          }
        }
        whole = true ;
        break ;
      }
    }
    if ( whole == false ) {
      System . out . println ( "-1" ) ;
    }
    else {
      System . out . println ( "-1" ) ;
    }
  }
  /* judge */
  boolean check = true ;
  if ( s . charAt ( 0 ) == 'o' ) {
    if ( ans . charAt ( 0 ) == 'S' ) {
      if ( ans . charAt ( 1 ) != ans . charAt ( ans . length ( ) - 1 ) ) check = false ;
    }
    else {
      if ( ans . charAt ( 1 ) == ans . length ( ) ) check = false ;
    }
  }
  else {
    if ( ans . charAt ( 0 ) == 'S' ) {
      if ( ans . charAt ( 1 ) != ans . length ( ) ) check = false ;
    }
    else {
      if ( ans . charAt ( 1 ) != ans . length ( ) ) check = false ;
    }
  }
  n = Integer . parseInt ( input ( ) ) ;
  s = new String ( input ( ) ) ;
  whole = false ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    ans = new String ( input ( ) ) ;
  }
  return check ;
}
