public static void print ( int n ) {
  String s = input . nextLine ( ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    Set < String > a = new HashSet < > ( s . substring ( 0 , i ) ) ;
    Set < String > b = new HashSet < > ( s . substring ( i ) ) ;
    n = a . size ( ) + b . size ( ) - a . size ( ) | b . size ( ) ;
    ans = Math . max ( ans , n ) ;
  }
  System . out . println ( ans ) ;
}
