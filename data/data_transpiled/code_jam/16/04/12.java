static final String prework ( String argv ) {
  final String msg ;
  final String prework = "nothing" ;
  final String baseConv = "" ;
  final int from = Integer . parseInt ( argv ) ;
  int s = 0 ;
  for ( int i = 0 ;
  i < iList . length ;
  i ++ ) {
    s *= from ;
    s += i ;
  }
  final String s ;
  final String [ ] args = new String [ ] {
    Integer . parseInt ( input ( argv ) ) , s }
    ;
    final String [ ] ansList ;
    {
      Arrays . stream ( args ) . forEach ( x -> {
        k = Integer . parseInt ( input ( x ) ) ;
        c = Integer . parseInt ( input ( x ) ) ;
        s = s ;
      }
      ) ;
      if ( s < Math . ceil ( k / c ) ) return "IMPOSSIBLE" ;
      final List < String > ansList = new LinkedList < String > ( ) ;
      for ( int ic = 0 ;
      ic < k ;
      ic += c ) {
        final List < String > l = new LinkedList < String > ( ) ;
        for ( int j = 0 ;
        j < c ;
        j ++ ) {
          if ( ic + j >= k ) break ;
          l . add ( ic + j ) ;
        }
        printerr ( l ) ;
        ansList . add ( baseConv ( l , k ) ) ;
      }
      return ansList . toString ( ) ;
    }
    private void printerr ( final String ... v ) {
      System . err . println ( ( String ) v ) ;
    }
    public void main ( String [ ] args ) {
      int TT = Integer . parseInt ( input ( args ) ) ;
      for ( int tt = 1 ;
      tt <= TT ;
      tt ++ ) {
        printerr ( "coping Case " + tt + ".." ) ;
        final String ans = once ( ) ;
        System . out . println ( "Case #" + tt + ": " + ( ans ) ) ;
      }
    }
  }
  