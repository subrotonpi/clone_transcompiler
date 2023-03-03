@ VisibleForTesting static int [ ] [ ] solve ( int k , String [ ] lines , int r , int c ) {
  final HashMap < String , Integer > MEMO = new HashMap < > ( ) ;
  {
    int ncases = Integer . parseInt ( lines [ r ] . trim ( ) ) ;
    int ncases = r - Math . min ( r , ncases - r - 1 ) ;
    for ( int i1 = r - 1 ;
    i1 >= minr ;
    -- i1 ) {
      int i2 = r + ( r - i1 ) ;
      String [ ] line1 = lines [ i1 ] . split ( " " ) ;
      String [ ] line2 = lines [ i2 ] . split ( " " ) ;
      for ( int j = 0 ;
      j < ncases ;
      ++ j ) {
        String a = line1 [ j ] ;
        String b = line2 [ j ] ;
        if ( a . equals ( " " ) || b . equals ( " " ) ) continue ;
        if ( a . equals ( b ) ) return false ;
      }
    }
    int minc = c - Math . min ( c , ncases - c - 1 ) ;
    for ( String [ ] line : lines ) {
      for ( int i1 = c - 1 ;
      i1 >= minc ;
      -- i1 ) {
        int i2 = c + ( c - i1 ) ;
        String a = line [ i1 ] ;
        String b = line [ i2 ] ;
        if ( a . equals ( " " ) || b . equals ( " " ) ) continue ;
        if ( a . equals ( b ) ) return false ;
      }
    }
    System . err . println ( Arrays . toString ( lines ) ) ;
    return true ;
  }
  private int [ ] symdist ( int k , String [ ] lines ) {
    Queue < Integer > queue = new LinkedList < > ( ) ;
    queue . add ( new Integer ( k - 1 ) ) ;
    int d = 0 ;
    Set < Integer > tried = new HashSet < > ( ) ;
    Queue < Integer > next = new LinkedList < > ( ) ;
    while ( true ) {
      for ( int r = 0 ;
      r < queue . size ( ) ;
      ++ r ) {
        if ( symat ( k , lines , r , c ) ) return d ;
        int nlines = lines . length ;
        for ( int coords = ( ( r - 1 ) < c ) ? 0 : ( ( r + 1 ) < c ) ? 0 : ( ( r - 1 ) + 1 ) ;
        ++ coords ) ;
      }
    }
  }
}
