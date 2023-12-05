static final int N = Integer . parseInt ( input . readLine ( ) ) , L = Integer . parseInt ( input . readLine ( ) ) ;
System . setOut ( new PrintStream ( new OutputStream ( ) {
  private static final long serialVersionUID = 225567884406268823432L ;
  private final int depth = 0 ;
  @ Override public void add ( String n ) {
    children . put ( n , new Node ( depth + 1 ) ) ;
  }
  @ Override public boolean has ( String n ) {
    return children . containsKey ( n ) ;
  }
}
) ) ;
Node t = new Node ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  String s = input . readLine ( ) ;
  Node nt = t ;
  for ( int j = 0 ;
  j < s . length ( ) ;
  j ++ ) {
    char c = s . charAt ( j ) ;
    if ( ! nt . has ( c ) ) nt . add ( c ) ;
    nt = nt . children . get ( c ) ;
  }
}
private static long solve ( Node node ) {
  int ans ;
  Function < Integer , Long > f = new Function < Integer , Long > ( ) {
    @ Override public Long apply ( Integer d ) {
      return ( L - d ) & - ( L - d ) ;
    }
  }
  ;
  if ( node . has ( "0" ) ) ans ^= solve ( node . children . get ( "0" ) ) ;
  else ans ^= f . apply ( node . depth ) ;
  if ( node . has ( "1" ) ) ans ^= solve ( node . children . get ( "1" ) ) ;
  else ans ^= f . apply ( node . depth ) ;
  return ans ;
}
long ans = solve ( t ) ;
if ( ans == 0 ) System . out . println ( "Bob" ) ;
else System . out . println ( "Alice" ) ;
return ans ;
}
