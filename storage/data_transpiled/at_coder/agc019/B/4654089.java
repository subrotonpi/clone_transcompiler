@ Implementation public static void input ( ) {
  String s = input . nextLine ( ) ;
  int n = s . length ( ) ;
  Map < String , Integer > map = new HashMap < String , Integer > ( ) ;
  c = 0 ;
  for ( String s : map . keySet ( ) ) {
    c += map . get ( s ) * ( map . get ( s ) - 1 ) / 2 ;
  }
  System . out . println ( 1 + n * ( n - 1 ) / 2 - c ) ;
}
