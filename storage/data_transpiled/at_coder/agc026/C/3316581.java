static final Scanner getInput ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  String l = s . substring ( 0 , n ) ;
  String r = s . substring ( n ) . substring ( 0 , s . length ( ) - 1 ) ;
  String a = new String ( ) ;
  String b = new String ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String t = "" ;
    String u = "" ;
    String v = "" ;
    String w = "" ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i != j ) t += l . charAt ( j ) ;
      u += r . charAt ( j ) ;
      else v += l . charAt ( j ) ;
      w += r . charAt ( j ) ;
    }
    a [ t ] += v ;
    b [ u ] += w ;
  }
  return a ;
}
