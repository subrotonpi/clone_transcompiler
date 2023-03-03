static LinkedList < String > V = LinkedList . newLinkedList ( "aeiou" ) ;
for ( int testCase = 0 ;
testCase < Integer . parseInt ( readLine ( ) ) ;
testCase ++ ) {
  String s = readLine ( ) ;
  String n = readLine ( ) ;
  n = Integer . parseInt ( n ) ;
  int l = s . length ( ) ;
  Pair [ ] b = new Pair [ l ] ;
  int c = 0 ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    if ( ! V . contains ( s . charAt ( i ) ) ) {
      c ++ ;
      if ( c >= n ) b [ c ++ ] = new Pair ( i - n + 1 , i + 1 ) ;
    }
    else {
      c = 0 ;
    }
  }
  int q = 0 ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) {
    int p ;
    if ( i == 0 ) p = 0 ;
    else p = b [ i - 1 ] . x + 1 ;
    int x = b [ i ] . x - p + 1 ;
    int y = l - b [ i ] . y + 1 ;
    q += x * y ;
  }
  String ans = q ;
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + ans ) ;
}
