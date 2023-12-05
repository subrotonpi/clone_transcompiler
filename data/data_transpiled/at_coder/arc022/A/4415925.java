static final String getString ( ) {
  String S = input ( ) ;
  return S . matches ( "rwx.*(i|I).*(c|C).*(t|T).*" ) ? "YES" : "NO" ;
}
