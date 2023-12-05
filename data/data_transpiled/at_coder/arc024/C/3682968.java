@ Test public static void solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) S [ i ] = 10 * ( ( Character . getNumericValue ( input . nextLine ( ) ) - 97 ) * 5 ) ;
  if ( N / 2 < K ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  Set < Integer > substring = new HashSet < Integer > ( ) ;
  Deque < Integer > dq = new LinkedList < Integer > ( ) ;
  Add add = substring :: add , append = dq :: add , popleft = dq :: popleft ;
  int subtotal = Integer . MAX_VALUE ;
  append ( subtotal ) ;
  for ( int n1 = S . length - K - 1 , n2 = S . length - 2 * K ;
  n1 >= 0 ;
  n1 = S . length - 1 , n2 = S . length - 2 * K ) {
    subtotal += n1 - n2 ;
    append ( subtotal ) ;
  }
  for ( int n1 = S . length - 2 * K , n2 = S . length - 1 ;
  n1 >= 0 ;
  n1 = S . length - 1 , n2 = S . length - 2 * K ) {
    add ( popleft . add ( n1 ) ) ;
    subtotal += n1 - n2 ;
    if ( substring . contains ( subtotal ) ) {
      System . out . println ( "YES" ) ;
      exit ( ) ;
    }
    append ( subtotal ) ;
  }
  System . out . println ( "NO" ) ;
}
