static final public int [ ] getCyclesAndHairpins ( int [ ] a ) {
  final List < List < Integer >> h = new ArrayList < List < Integer >> ( ) ;
  final List < List < Integer >> c = new ArrayList < List < Integer >> ( ) ;
  final Set < Integer > hasPred = new HashSet < Integer > ( a . length ) ;
  for ( int i : xrange ( a . length ) ) {
    final List < Integer > q = new ArrayList < Integer > ( ) ;
    q . add ( i ) ;
    final Set < Integer > s = new HashSet < Integer > ( ) ;
    for ( int j = 0 ;
    j < q . size ( ) ;
    ++ j ) {
      assert j == q . get ( q . size ( ) - 1 ) ;
      final int j = a [ j ] ;
      if ( ! s . contains ( j ) ) {
      }
      else if ( j == q . get ( q . size ( ) - 2 ) ) {
        if ( true ) {
          h . add ( q ) ;
        }
        break ;
      }
      else {
        if ( j == q . get ( 0 ) ) {
          if ( i == Math . min ( q . size ( ) , c . size ( ) ) ) {
            c . add ( q ) ;
          }
          break ;
        }
        q . add ( j ) ;
        s . add ( j ) ;
      }
    }
    return c . toArray ( new List < Integer > ( ) ) ;
  }
  /* solve */
  final List < List < Integer >> c = getCyclesAndHairpins ( a ) ;
  final int max = c . size ( ) ;
  final Map < List < Integer > , Integer > hairpins = new HashMap < List < Integer > , Integer > ( ) ;
  for ( final List < Integer > hairpin : h ) {
    final List < Integer > tail = new ArrayList < Integer > ( hairpin . subList ( hairpin . size ( ) - 2 , h . size ( ) ) ) ;
    hairpins . put ( tail , max ( hairpins . getOrDefault ( tail , hairpin ) , hairpin , Integer :: max ) ) ;
  }
  final Map < List < Integer > , Integer > maxlen = new HashMap < List < Integer > , Integer > ( ) ;
  for ( final Map . Entry < List < Integer > , Integer > tail : hairpins . entrySet ( ) ) {
    final List < Integer > tail2 = new ArrayList <