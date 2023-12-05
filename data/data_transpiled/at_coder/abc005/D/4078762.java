@ Function public static LinkedHashMap < Integer , Integer > map ( ) {
  final LinkedHashMap < Integer , Integer > map = new LinkedHashMap < > ( ) ;
  map . put ( "LI" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "II" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "LS" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "S" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "IIR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "LIR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "SR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "SR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "SR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  int mod = 1000000007 ;
  n = map . size ( ) ;
  map . put ( "N" , mod ) ;
  map . put ( "LIR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "SR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "SR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "SR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  int mod = 1000000007 ;
  n = map . size ( ) ;
  map . put ( "N" , mod ) ;
  map . put ( "LIR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "SR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "SR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  map . put ( "SR" , Integer . valueOf ( input . nextInt ( ) ) ) ;
  int [ ] ans = new int [ n * n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans [ i ] = 0 ;
  }
  for ( int a = 0 ;
  a < n ;
  a ++ ) {
    for ( int e = 0 ;
    e < b ;
    e ++ ) {
      ans [ ( a - c ) * ( b - e ) ] = Math . max