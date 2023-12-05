public static boolean check ( String [ ] d ) {
  int l = 0 ;
  for ( String i : d ) {
    if ( i . equals ( "o" ) ) {
      l ++ ;
    }
  }
  if ( l == d . length ) {
    return true ;
  }
  return false ;
}
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int r = Integer . parseInt ( input . nextLine ( ) ) ;
char [ ] s = new char [ n ] ;
int ans = 0 ;
int p = 0 ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  if ( s [ i ] == '.' ) {
    p = i ;
  }
}
int i = 0 ;
int j = 0 ;
for ( ;
i < n ;
i ++ ) {
  if ( s [ j ] == 'o' ) {
    j ++ ;
  }
  if ( j == n ) {
    System . out . println ( 0 ) ;
    quit ( ) ;
  }
  while ( i < n ) {
    if ( s [ i ] == 'o' && i < p - r + 1 ) {
      i ++ ;
      ans ++ ;
    }
    else {
      for ( j = i ;
      j < Math . min ( i + r , n ) ;
      j ++ ) {
        s [ j ] = 'o' ;
      }
      ans ++ ;
    }
    if ( check ( s ) ) {
      break ;
    }
  }
  return true ;
}
