@ MoreIO . InputFunction public static void main ( String [ ] args ) {
  final int a = ( Integer ) input . split ( " " ) [ 0 ] ;
  final int b = ( Integer ) input . split ( " " ) [ 1 ] ;
  final int c = ( Integer ) input . split ( " " ) [ 2 ] ;
  int i = 1 ;
  String ans = "NO" ;
  while ( i < b ) {
    if ( ( a * i % b ) == c ) {
      ans = "YES" ;
      break ;
    }
    i ++ ;
  }
  System . out . println ( ans ) ;
}
