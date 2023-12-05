static final Comparator < List < Integer >> inpl = new Comparator < List < Integer >> ( ) {
  @ Override public int compare ( List < Integer > o1 , List < Integer > o2 ) {
    return Integer . parseInt ( o1 . get ( 0 ) ) ;
  }
}
;
final int size = Integer . parseInt ( o2 . get ( 0 ) ) ;
List < Integer > A = new ArrayList < Integer > ( size ) ;
A . sort ( inpl ) ;
List < Integer > Anlist = new ArrayList < Integer > ( size ) ;
int ap = 0 ;
for ( Integer a : A ) {
  if ( a > ap ) {
    Anlist . add ( new Integer ( a ) ) ;
    ap = a ;
  }
  else {
    Anlist . get ( Anlist . size ( ) - 1 ) . add ( 1 ) ;
  }
}
Arrays . sort ( A . toArray ( ) ) ;
int N = Anlist . size ( ) ;
int ans = 0 ;
for ( int i = 1 ;
i <= N ;
i ++ ) {
  if ( Anlist . get ( Anlist . size ( ) - i ) . intValue ( ) == 0 ) {
    continue ;
  }
  int p = Integer . numberOfTrailingZeros ( A . get ( i ) ) - 3 ;
  int B = ( 1 << ( p + 1 ) ) - A . get ( i ) ;
  if ( A . get ( i - i ) == B ) {
    ans += Anlist . get ( i ) . intValue ( ) / 2 ;
  }
  else {
    int m = Integer . compare ( A . get ( i ) , B ) ;
    if ( m < N - i && A . get ( m ) == B ) {
      int pairs = Math . min ( Anlist . get ( m ) . intValue ( ) , Anlist . get ( m ) . intValue ( ) ) ;
      ans += pairs ;
      Anlist . get ( m ) . intValue ( ) - = pairs ;
    }
  }
}
System . out . println ( ans ) ;
return ans ;
}
