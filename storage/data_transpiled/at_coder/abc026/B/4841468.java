static final double PI = Math . PI ;
int N = Integer . parseInt ( input ) ;
int [ ] R = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  R [ i ] = Integer . parseInt ( input ) ;
}
Arrays . sort ( R ) ;
double ans = 0 ;
if ( R . length % 2 == 1 ) {
  ans += R [ 0 ] * R [ 0 ] * PI ;
  for ( int i = 1 ;
  i < R . length ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      ans += R [ i ] * R [ i ] * PI ;
      ans -= R [ i - 1 ] * R [ i - 1 ] * PI ;
    }
  }
}
else {
  for ( int i = 0 ;
  i <= R . length ;
  i ++ ) {
    if ( i % 2 == 1 ) {
      ans += R [ i ] * R [ i ] * PI ;
      ans -= R [ i - 1 ] * R [ i - 1 ] * PI ;
    }
  }
}
System . out . println ( ans ) ;
return ans ;
}
