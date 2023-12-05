public static int [ ] getNegativeInstances ( ) {
  String s = String . valueOf ( input ( ) ) ;
  int i = 0 ;
  ArrayList < Integer > ans = new ArrayList < Integer > ( ) ;
  for ( String let : s . toCharArray ( ) ) {
    switch ( let ) {
      case 'A' : case 'T' : case 'G' : case 'C' : i ++ ;
      default : ans . add ( i ) ;
      i = 0 ;
    }
  }
  ans . add ( i ) ;
  return ans . toArray ( ) ;
}
