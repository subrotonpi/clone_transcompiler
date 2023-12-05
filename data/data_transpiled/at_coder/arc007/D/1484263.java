public static final String S = input ( ) ;
int N = S . length ( ) ;
if ( S . charAt ( 0 ) == '0' ) {
  S = "1" + S ;
}
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  if ( i > 0 && S . charAt ( i ) != '0' ) {
    ansA = Integer . parseInt ( S . substring ( 0 , i ) ) ;
    S = S . substring ( i ) ;
    break ;
  }
}
else {
  ansA = Integer . parseInt ( S ) ;
  S = "" ;
}
if ( S . length ( ) == 0 ) {
  System . out . println ( ansA + " " + 1 ) ;
  System . exit ( 0 ) ;
}
for ( int i = 1 ;
i <= 5000 ;
i ++ ) {
  if ( i <= S . length ( ) ) {
    int ansD = Integer . parseInt ( S . substring ( 0 , i ) ) - ansA ;
    if ( ansD <= 0 ) continue ;
    int prev = Integer . parseInt ( S . substring ( 0 , i ) ) ;
    if ( i == S . length ( ) ) {
      System . out . println ( ansA + " " + ansD ) ;
      System . exit ( 0 ) ;
    }
    int l = i ;
    int r = i ;
    while ( true ) {
      if ( r <= S . length ( ) ) {
        if ( l != r && Integer . parseInt ( S . substring ( l , r ) ) > prev + ansD ) break ;
        else if ( l != r && Integer . parseInt ( S . substring ( l , r ) ) == prev + ansD ) {
          prev += ansD ;
          if ( r == S . length ( ) ) {
            System . out . println ( ansA + " " + ansD ) ;
            System . exit ( 0 ) ;
          }
          l = r ;
          continue ;
        }
      }
      else if ( l != S . length ( ) && S . substring ( l , r ) . equals ( Integer . toString ( prev + ansD ) . substring ( 0 , S . length ( ) - l ) ) ) {
        System . out . println ( ansA + " " + ansD ) ;
        System . exit ( 0 ) ;
      }
      else break ;
      r ++ ;
    }
  }
  else {
    if ( ansA < Integer . parseInt ( S + '0' ) ) {
      System . out . println ( ansA + " " + Integer . parseInt ( S +