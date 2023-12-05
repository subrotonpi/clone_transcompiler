static final String input ( ) {
  String s = input ( ) ;
  String regex = "^(ch|[oku])*$" ;
  Pattern pattern = Pattern . compile ( regex ) ;
  boolean matchObj = pattern . matcher ( s ) ;
  return matchObj ? "YES" : "NO" ;
}
