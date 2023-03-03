public static int func ( int n ) {
  List < Integer > digits = new ArrayList < Integer > ( ) ;
  for ( char c : String . valueOf ( n ) . toCharArray ( ) ) {
    digits . add ( Integer . parseInt ( c ) ) ;
  }
  int sum = 0 ;
  for ( Integer digit : digits ) {
    sum += digit ;
  }
  return sum ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int start = 0 ;
if ( N - 9 * 18 > 0 ) {
  start = N - 9 * 18 ;
}
List < Integer > anss = new ArrayList < Integer > ( ) ;
for ( int x = start ;
x <= N ;
x ++ ) {
  if ( x < 1 ) {
    continue ;
  }
  if ( x + func ( x ) == N ) {
    anss . add ( x ) ;
  }
}
System . out . println ( anss . size ( ) ) ;
for ( Integer ans : anss ) {
  System . out . println ( ans ) ;
}
