public static void main ( String [ ] args ) throws IOException {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int cases = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= cases ;
  testCase ++ ) {
    final int [ ] tmp = new int [ 4 ] ;
    for ( int x = 0 ;
    x < tmp . length ;
    x ++ ) tmp [ x ] = Integer . parseInt ( br . readLine ( ) ) ;
    final int n = tmp [ 0 ] ;
    final int m = tmp [ 1 ] ;
    final int x = tmp [ 2 ] ;
    final int y = tmp [ 3 ] ;
    final int z = tmp [ 4 ] ;
    final int [ ] A = new int [ m ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) A [ i ] = Integer . parseInt ( br . readLine ( ) ) ;
    final int [ ] signs = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      signs [ i ] = A [ i % m ] ;
      A [ i % m ] = ( ( int ) ( x * A [ i % m ] ) + ( int ) ( y * ( i + 1 ) ) ) % z ;
    }
    String result = 0 ;
    final int total = signs . length ;
    int i = total - 1 ;
    final HashMap < Integer , Integer > count = new HashMap < Integer , Integer > ( ) ;
    int sumCount = 0 ;
    while ( i >= 0 ) {
      int j = i + 1 ;
      int iCount = 0 ;
      while ( j < total ) {
        if ( signs [ i ] < signs [ j ] ) iCount = iCount + 1 + count . get ( j ) ;
        j = j + 1 ;
      }
      count . put ( i , iCount ) ;
      sumCount = sumCount + iCount ;
      i = i - 1 ;
    }
    sumCount = sumCount + total ;
    result = Long . toString ( sumCount % 1000000007 ) ;
    System . out . printf ( "Case #%d: %s%n" , testCase ) ;
  }
}
