public static int getSumOfDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  StringBuilder sb = new StringBuilder ( ) ;
  sb . append ( input . nextLine ( ) ) ;
  String l = sb . toString ( ) ;
  String r = sb . toString ( ) ;
  Map < Character , Integer > map = new HashMap < Character , Integer > ( ) ;
  Map < Character , Integer > e = new HashMap < Character , Integer > ( ) ;
  for ( int i = 0 ;
  i < 1 << n ;
  i ++ ) {
    String s = null ;
    String t = null ;
    String u = null ;
    String v = null ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( ( i >> j ) & 1 ) {
        s += l . charAt ( j ) ;
        t += r . charAt ( j ) ;
      }
      else {
        u += l . charAt ( j ) ;
        v += r . charAt ( j ) ;
      }
    }
    map . put ( new Character ( s ) , map . get ( new Character ( u ) ) + 1 ) ;
    e . put ( new Character ( t ) , map . get ( new Character ( v ) ) + 1 ) ;
  }
  int a = 0 ;
  for ( Character i : map . keySet ( ) ) {
    a += map . get ( i ) * e . get ( i ) ;
  }
  System . out . println ( a ) ;
  return a ;
}
