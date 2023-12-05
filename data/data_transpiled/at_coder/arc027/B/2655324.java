static int N = 26 ;
int [ ] parent = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  parent [ i ] = i ;
  rank [ i ] = 1 ;
}
int ans = 1 ;
for ( int i = 0 ;
i < 26 ;
i ++ ) {
  if ( parent [ i ] == parent [ i ] ) {
    return i ;
  }
  else if ( head == i ) {
    ans *= 9 ;
  }
  else {
    ans *= 10 ;
  }
}
System . out . println ( ans ) ;
{
  int rootx = parent [ i ] ;
  int rankx = rank [ rootx ] ;
  int rooty = parent [ i ] ;
  int ranky = rank [ rooty ] ;
  if ( rankx > ranky ) {
    parent [ rooty ] = rootx ;
  }
  else {
    parent [ rootx ] = rooty ;
    rank [ rooty ] = Math . max ( rank [ rooty ] , rank [ rootx ] + 1 ) ;
  }
}
int n = Integer . parseInt ( input ( ) ) ;
char [ ] s = new char [ 2 ] ;
for ( int i = 0 ;
i < s . length ;
i ++ ) {
  s [ i ] = input ( ) ;
}
determined = new boolean [ N ] ;
used = new boolean [ N ] ;
to_int = ( char ) ( 'A' - 'a' ) ;
to_int = ( char ) ( 'Z' - 'a' ) ;
to_int = ( char ) ( 'A' - 'a' ) ;
to_int = ( char ) ( 'A' - 'a' ) ;
to_int = ( char ) ( 'Z' - 'a' ) ;
to_int = ( char ) ( 'a' - 'a' ) ;
to_int = ( char ) ( 'A' - 'a' ) ;
to_int = ( char ) ( 'a' - 'a' ) ;
to_int = ( char ) ( 'a' - 'a' ) ;
to_int = ( char ) ( 'a' - 'a' ) ;
to_int = ( char ) ( 'a' - 'a' ) ;
to_int = ( char ) ( 'a' - 'a' ) ;
to_int = ( char ) ( 'a' - 'a' ) ;
to_int = ( char ) ( 'a' - 'a' ) ;
if ( i == 0 ) {
  head = i