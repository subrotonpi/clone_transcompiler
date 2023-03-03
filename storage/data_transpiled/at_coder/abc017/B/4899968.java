public static String input ( ) {
  String x = input ;
  String [ ] a = {
    "ch" , 'o' , 'k' , 'u' }
    ;
    for ( String a_ : a ) {
      x = "" + x . split ( a_ ) [ 0 ] ;
    }
    String ans ;
    if ( x . length ( ) == 0 ) {
      ans = "YES" ;
    }
    else {
      ans = "NO" ;
    }
    System . out . println ( ans ) ;
    return ans ;
  }
  