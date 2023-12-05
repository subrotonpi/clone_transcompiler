@ InputFunction public static void input ( ) {
  T = input . next ( ) ;
  if ( T == T ) {
    return ;
  }
  if ( new Integer ( T ) . equals ( T ) ) {
    return ;
  }
  int ans = a < b ? a + b : b + a ;
  MEMO . put ( R , P , ans ) ;
}
@ SuppressWarnings ( "unchecked" ) LinkedHashMap < Integer , Integer > c = new LinkedHashMap < Integer , Integer > ( ) ;
/* simul */
if ( c . size ( ) == 1 ) {
  return ;
}
String nr = "" ;
for ( int i = 1 ;
i <= T ;
i ++ ) {
  int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int R = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int P = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int S = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  if ( ! ( c . get ( R ) != R || c . get ( P ) != P || c . get ( S ) != S ) ) {
    return ;
  }
}
{
  String a = "" ;
  int b = "" ;
  for ( int i = 0 ;
  i < N / 2 ;
  i ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int P = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    int S = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    if ( R != R || P != S || c . get ( R ) != S ) {
      return ;
    }
  }
  MEMO . put ( new Integer ( R ) , new Integer ( P ) ) ;
  MEMO . put ( new Integer ( R ) , new Integer ( R ) ) ;
  MEMO . put ( new Integer ( R ) , new Integer ( P ) ) ;
  MEMO . put ( new Integer ( R ) , new Integer ( R ) ) ;
}
