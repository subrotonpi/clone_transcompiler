public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a = new int [ R ] [ C ] [ R ] [ C ] [ C ] [ ] [ ] [ ] ;
int A = 0 , B = 0 ;
for ( int j = 0 ;
j < C ;
j ++ ) {
  System . out . println ( "NO" ) ;
  exit ( ) ;
}
char [ ] [ ] [ ] [ ] [ ] [ ] ans = new char [ R ] [ C ] [ R ] [ C ] [ C ] ;
for ( int j = 0 ;
j < R ;
j ++ ) {
  for ( int i = 0 ;
  i < C / 2 ;
  i ++ ) {
    if ( A == 0 ) break ;
    ans [ C - 1 ] [ i * 2 ] = '<' ;
    ans [ C - 1 ] [ i * 2 + 1 ] = '>' ;
    A -- ;
  }
}
if ( C % 2 ) {
  for ( int i = 0 ;
  i < R / 2 ;
  i ++ ) {
    if ( B == 0 ) break ;
    ans [ C - 1 ] [ i * 2 ] = '^' ;
    ans [ C - 1 ] [ i * 2 + 1 ] = 'v' ;
    B -- ;
  }
}
for ( int i = 0 ;
i < R / 2 ;
i ++ ) {
  for ( int j = 0 ;
  j < C / 2 ;
  j ++ ) {
    if ( A > 1 ) {
      for ( int k = 0 ;
      k < 2 ;
      k ++ ) {
        ans [ C - 1 ] [ i * 2 + k ] [ j * 2 ] = '<' ;
        ans [ C - 1 ] [ i * 2 + k ] [ j * 2 + 1 ] = '>' ;
        A -- ;
      }
    }
    else if ( B > 1 ) {
      for ( int k = 0 ;
      k < 2 ;
      k ++ ) {
        ans [ C - 1 ] [ i * 2 + k ] [ j * 2 + k ] = '^' ;
        ans [ C - 1 ] [ i * 2 + k ] [ j * 2 + k ] = 'v' ;
        B -- ;
      }
    }
    else if ( A == 1 || B > 0 ) {
      System . out . println ( "NO" ) ;
    }
    else {
      System . out . println ( ( char [ ] [ ] [ ] [ ] [ ] [ ] )