@ Function public static String from ( ) {
  final String S = input ( ) ;
  final Map < String , Boolean > letters = new TreeMap < String , Boolean > ( ) ;
  for ( String s : S ) {
    letters . put ( s , true ) ;
  }
  String ans = "None" ;
  for ( String l : Strings . lowercase ) {
    if ( letters . get ( l ) == false ) {
      ans = l ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
