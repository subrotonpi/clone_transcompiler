public static int n = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  {
    Set < String > a = new HashSet < > ( s ) ;
    Set < String > b = new HashSet < > ( t ) ;
    Set < String > c = a . stream ( ) . filter ( s :: equals ) . collect ( toSet ( ) ) ;
    return c . size ( ) ;
  }
  int x = 0 ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    String str1 = s . substring ( 0 , i ) ;
    String str2 = s . substring ( i , n ) ;
    x = Math . max ( x , f ( str1 , str2 ) ) ;
  }
  System . out . println ( x ) ;
  return x ;
}
