@ org . python . Method ( __doc__ = "division" ) public static void main ( String [ ] args ) {
  Scanner input = new Scanner ( System . in ) ;
  /* do a while loop over the input */
  while ( input . hasNext ( ) ) {
    int w = sample ( input , 1 ) ;
    w = w > 0 ? w : 1 ;
    while ( s . contains ( deps [ w ] - 1 ) ) {
      w = deps [ w ] - 1 ;
    }
    l . add ( w ) ;
    s . remove ( w ) ;
  }
  final int K = 10000 ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . print ( "Case #" + ( i + 1 ) + ":" ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] dep = new int [ n ] ;
    String [ ] cars = input . nextLine ( ) . trim ( ) . split ( " " ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > cool = new LinkedList < Integer > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      dep [ j ] = new int [ n ] ;
    }
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      dep [ j ] = new int [ n ] ;
    }
    base = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( dep [ j ] != 0 ) {
        childs [ dep [ j ] - 1 ] . add ( j ) ;
      }
      else {
        base . add ( j ) ;
      }
    }
    int [ ] nums = new int [ m ] ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      int [ ] r = new int [ n ] ;
      sh ( dep , new HashSet < Integer > ( n ) , r ) ;
      String w = Arrays . toString ( cars ) ;
      for ( int j = 0 ;
      j < m ;
      j ++ ) {
        if ( w . contains ( cool . get ( j ) ) ) nums [ j ] ++ ;
      }
    }
    int [ ] freqs = new int [ m ] ;
    for ( int u : nums ) {
      freqs [ u ] = u / K ;
    }
    System . out . println ( Arrays . toString