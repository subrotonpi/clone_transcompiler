static final Scanner input = new Scanner ( System . in ) {
  final List < Integer > x = new ArrayList < Integer > ( ) ;
  final List < Integer > y = new ArrayList < Integer > ( ) ;
  final List < Integer > ix = new ArrayList < Integer > ( ) ;
  final List < Integer > iy = new ArrayList < Integer > ( ) ;
  final List < Integer > p1 = new ArrayList < Integer > ( ) ;
  final List < Integer > p2 = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    final String r = input . nextLine ( ) ;
    final int t = r . indexOf ( 'Q' ) ;
    if ( t > - 1 ) {
      x . add ( i ) ;
      ix . remove ( i ) ;
      if ( y . contains ( t ) ) {
        System . out . println ( "No Answer" ) ;
        System . exit ( ) ;
      }
      y . add ( t ) ;
      iy . remove ( t ) ;
      if ( p1 . contains ( ( i + t ) ) || p2 . contains ( ( i - t ) ) ) {
        System . out . println ( "No Answer" ) ;
        System . exit ( ) ;
      }
      p1 . add ( i + t ) ;
      p2 . add ( i - t ) ;
      if ( x . size ( ) > 2 ) break ;
    }
  }
  if ( x . size ( ) < 3 || y . size ( ) < 3 ) {
    System . out . println ( "No Answer" ) ;
    System . exit ( ) ;
  }
  final List < Integer > o1 = new LinkedList < Integer > ( ) ;
  final List < Integer > o2 = new LinkedList < Integer > ( ) ;
  final List < Integer > dat = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    dat . add ( o1 . get ( i ) ) ;
  }
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    final List < Integer > c1 = new ArrayList < Integer > ( ) ;
    final List < Integer > c2 = new ArrayList < Integer > ( ) ;
    for ( int s = 0 ;
    s < 8 ;
    s ++ ) {
      final int t = i ;
      if ( ( s + t ) >= 1 || p1 . contains ( ( s + t ) ) || ( s - t ) >= 1 || p2 . contains ( ( s - t ) ) ) break ;
      else {
        c1 . add (