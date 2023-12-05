static final Function < String , Integer > ni = new Function < String , Integer > ( ) {
  @ Override public Integer apply ( String input ) {
    return Integer . parseInt ( input ) ;
  }
}
;
Function < String , Integer > nm = Function . identity ( ) ;
Function < String , List < Integer >> nl = new Function < String , List < Integer >> ( ) {
  @ Override public List < Integer > apply ( String input ) {
    return Collections . singletonList ( input ) ;
  }
}
;
final int INF = 10 * 9 ;
int n = nm . apply ( ni ) ;
int m = nm . apply ( ni ) ;
List < Integer > ab = new ArrayList < Integer > ( ) ;
List < Integer > cd = new ArrayList < Integer > ( ) ;
for ( int i = 0 ;
i < m ;
i ++ ) {
  ab . add ( nl . apply ( ni . apply ( i ) ) ) ;
  cd . add ( nl . apply ( ni . apply ( i ) ) ) ;
}
List < String > ans = new ArrayList < String > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int temp = INF ;
  int a = ab . get ( i ) . intValue ( ) ;
  int b = ab . get ( i ) . intValue ( ) ;
  for ( int j = m - 1 ;
  j >= 0 ;
  j -- ) {
    int c = cd . get ( j ) . intValue ( ) ;
    int d = cd . get ( j ) . intValue ( ) ;
    if ( Math . abs ( a - c ) + Math . abs ( b - d ) <= temp ) {
      temp = Math . abs ( a - c ) + Math . abs ( b - d ) ;
      idx = j + 1 ;
    }
  }
  ans . add ( Integer . toString ( idx ) ) ;
}
System . out . println ( ans . toString ( ) ) ;
return ans ;
}
