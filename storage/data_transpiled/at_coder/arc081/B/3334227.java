public static int N = Integer . parseInt ( input ) {
  String s1 = input . nextLine ( ) ;
  String s2 = input . nextLine ( ) ;
  int i = 0 ;
  char [ ] pat = new char [ N ] ;
  while ( i < N ) {
    if ( s1 . charAt ( i ) == s2 . charAt ( i ) ) {
      pat [ 0 ] = 't' ;
      i ++ ;
    }
    else {
      pat [ 0 ] = 'y' ;
      i += 2 ;
    }
  }
  int ans ;
  if ( pat [ 0 ] == 't' ) ans = 3 ;
  else ans = 6 ;
  char [ ] pat2 = pat [ 1 ] ;
  int l = pat . length ;
  i = 1 ;
  while ( i < l ) {
    switch ( pat [ i ] ) {
      case 't' : case 't' : ans = ( ans * 2 ) % ( 10 * 9 + 7 ) ;
      break ;
      case 't' : case 'y' : case 'y' : case 't' : ans = ( ans * 2 ) % ( 10 * 9 + 7 ) ;
      break ;
      case 'y' : case 'y' : case 'y' : ans = ( ans * 3 ) % ( 10 * 9 + 7 ) ;
      break ;
    }
    i ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
