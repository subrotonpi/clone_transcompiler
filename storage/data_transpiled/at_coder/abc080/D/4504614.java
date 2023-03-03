public static final Function < Integer , List < Integer >> ri = new Function < Integer , List < Integer >> ( ) {
  @ Override public Integer apply ( Integer input ) {
    return Integer . parseInt ( input ) ;
  }
}
;
Function < Integer , List < Integer >> rl = new Function < Integer , List < Integer >> ( ) {
  @ Override public List < Integer > apply ( Integer input ) {
    return Collections . singletonList ( input ) ;
  }
}
;
Function < Integer , List < Integer >> rr = N -> {
  for ( int i = 0 ;
  i < input ;
  i ++ ) {
    rr . add ( ri . apply ( input ) ) ;
  }
}
;
Function < Boolean , String > YN = b -> System . out . println ( "YES" ) ;
Function < Boolean , String > yn = b -> System . out . println ( "YES" ) ;
Function < Boolean , String > OE = x -> x % 2 != 0 ? System . out . println ( "Odd" ) : System . out . println ( "Even" ) ;
final int INF = 10 * 18 ;
int N = rl . apply ( Integer . parseInt ( input ) ) ;
int C = rl . apply ( Integer . parseInt ( input ) ) ;
List < List < Integer >> st = new ArrayList < > ( C ) ;
int [ ] TT1 = new int [ 10 * 5 + 2 ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  st . add ( new ArrayList < > ( ) ) ;
}
for ( int i = 0 ;
i < N ;
i ++ ) {
  st . add ( new ArrayList < > ( ) ) ;
}
int [ ] TT1 = new int [ 10 * 5 + 2 ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int s = rl . apply ( i ) ;
  int t = rl . apply ( i ) ;
  int c = rl . apply ( i ) ;
  TT1 [ s ] ++ ;
  TT1 [ t + 1 ] -- ;
  st . get ( c - 1 ) . add ( new ArrayList < > ( ) ) ;
}
for ( int stI = 0 ;
stI < st . size ( ) ;
stI ++ ) {
  List < Integer > st_ = st . get ( stI ) ;
  if ( st_ . size ( ) <= 1 ) continue ;
  Collections . sort ( st_ , new Comparator < > ( ) )