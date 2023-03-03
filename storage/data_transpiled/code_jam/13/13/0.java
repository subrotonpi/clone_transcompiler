static final String getHashName ( int R , int N , int M , int K ) {
  int [ ] [ ] bino = new int [ 30 ] [ N ] ;
  for ( int i : xrange ( 30 ) ) {
    bino [ i ] [ i ] = bino [ i ] [ 0 ] = 1 ;
  }
  Map < Integer , Double > chance = new HashMap < > ( ) ;
  for ( int i : nums ) {
    for ( int num : candidates ) {
      bino [ i ] [ num ] = 1.0 ;
    }
    for ( int j : candidates ) {
      bino [ i ] [ j ] = chance . get ( num ) / ( 2.0 * N ) ;
    }
  }
  List < Integer > ret = new ArrayList < > ( N ) ;
  for ( Map . Entry < Integer , Double > entry : chance . entrySet ( ) ) {
    int c = entry . getKey ( ) ;
    double prob = entry . getValue ( ) ;
    if ( prob * cnt . get ( c ) > 0 ) {
      prob = prob * cnt . get ( c ) ;
      ret = cards . get ( c ) ;
    }
  }
  System . out . println ( CollectionUtils . toString ( ret ) ) ;
  final String [ ] [ ] cards = new String [ N ] [ N ] ;
  final List < Integer > cnt = new ArrayList < > ( ) ;
  for ( int i : nums ) {
    for ( int j : candidates ) {
      if ( cnt . get ( i ) == N ) {
        cards [ i ] = cur ;
        cnt . add ( j ) ;
      }
      else if ( num <= M ) {
        for ( int use : xrange ( 0 , N - cur . length + 1 ) ) {
          generate ( cur . toArray ( new Integer [ num ] ) , num + 1 , ways * bino [ N - cur . length ] [ use ] ) ;
        }
      }
    }
  }
  generate ( new int [ ] [ ] {
  }
  , 2 , 1 ) ;
  int C = cnt . size ( ) ;
  System . out . println ( "generated " + C ) ;
  @ SuppressWarnings ( "unchecked" ) List < Map < Integer , Integer >> possible = new ArrayList < > ( ) ;
  Set < Integer > invertedIndex = new TreeSet < > ( ) ;
  for ( int i : xrange ( C ) ) {
    if ( i % 10 == 0 ) System . out . println ( i + ".." ) ;
    Map < Integer , Integer > prods = new HashMap < > ( )