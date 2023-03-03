public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  Map < String , Integer > dic = new HashMap < > ( ) ;
  for ( String k : "abcdefghijklmnopqrstuvwxyz" ) {
    dic . put ( k , 50 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String S = input ;
    for ( String k : dic . keySet ( ) ) {
      dic . put ( k , Math . min ( S . indexOf ( k ) , dic . get ( k ) ) ) ;
    }
  }
  String ans = "" ;
  for ( String k : "abcdefghijklmnopqrstuvwxyz" ) {
    ans = ans + k * dic . get ( k ) ;
  }
  System . out . println ( ans ) ;
}
