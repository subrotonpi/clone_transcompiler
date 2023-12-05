public static String X = input ( ) {
  X = X . replace ( 'ch' , 'C' ) ;
  String ans = "YES" ;
  for ( char x : X ) {
    if ( x != 'C' && x != 'o' && x != 'k' && x != 'u' ) {
      ans = "NO" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
