@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static < T > void main ( Supplier < T > supplier , BufferedReader br ) throws IOException {
  final int n = br . nextInt ( ) ;
  final int i = Integer . parseInt ( br . readLine ( ) ) ;
  final int LS = Integer . parseInt ( br . readLine ( ) ) ;
  final int S = Integer . parseInt ( br . readLine ( ) ) ;
  final int [ ] IR = new int [ n ] ;
  final int [ ] LIR = new int [ n ] ;
  final int [ ] SR = new int [ n ] ;
  final int [ ] LSR = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    LIR [ i ] = new int [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    LIR [ i ] = new int [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    SR [ i ] = new int [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    LSR [ i ] = new int [ i ] ;
  }
  final int mod = 1000000007 ;
  {
    final int n = I ;
    final int [ ] c = new int [ n ] ;
    c [ n ] = new int [ n ] ;
    int minans = Float . MAX_VALUE ;
    int maxans = 0 ;
    for ( int i = 1 ;
    i <= 5 ;
    i ++ ) {
      minans = Math . min ( minans , c [ n - i ] ) ;
      maxans = Math . max ( maxans , c [ n - i ] ) ;
    }
    System . out . println ( maxans + " " + minans ) ;
  }
  {
    final int a = li , b = S ;
    int ans = 0 ;
    while ( a != b ) {
      if ( a > b ) {
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
      }
      final int ab = b - a ;
      if ( ab >= 8 ) {
        a += 10 ;
      }
      else if ( ab >= 3 ) {
        a += 5 ;
      }
      else {
        a ++ ;
      }
      ans ++ ;
    }
    System . out . println ( ans ) ;
  }
}
