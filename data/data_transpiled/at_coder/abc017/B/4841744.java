static final String getString ( ) {
  String s = input ( ) ;
  s = re . sub ( 'ch|o|k|u' , "" , s ) ;
  return s == "YES" ? "YES" : "NO" ;
}
