static final String [ ] [ ] DX = {
  1 , 0 , - 1 , - 1 , 0 , 1 }
  ;
  final String [ ] [ ] DY = {
    1 , 1 , 0 , - 1 , - 1 , 0 }
    ;
    final Stream < Pair < Integer , Integer >> D = Stream . of ( DX , DY ) ;
    final int [ ] numbits = {
      0 , 1 , 1 , 2 , 1 , 2 , 3 , 2 , 3 , 3 , 4 , 1 , 2 , 2 , 3 , 3 , 4 , 2 , 3 , 3 , 4 , 4 , 5 , 1 , 2 , 2 , 3 , 2 , 3 , 3 , 4 , 3 , 4 , 5 , 2 , 3 , 3 , 4 , 5 , 4 , 5 , 6 }
      ;
      final String [ ] [ ] S = map ( Integer . parseInt , System . in ) . trim ( ) . split ( " " ) ;
      final List < Integer > moves = new ArrayList < > ( ) ;
      for ( int i : xrange ( M ) ) {
        moves . add ( Integer . parseInt ( System . in ) . trim ( ) ) ;
      }
      final int [ ] [ ] board = new int [ moves . size ( ) ] [ moves . size ( ) ] ;
      int part = 1 ;
      int [ ] [ ] edges = new int [ moves . size ( ) ] ;
      for ( int i : xrange ( M ) ) {
        moves . add ( Integer . parseInt ( System . in ) . trim ( ) ) ;
      }
      int [ ] [ ] current = board [ m ] ;
      int [ ] c = corner ( S , m ) ;
      if ( c > 0 && i * count < ( part + 1 ) * T ) {
        final int [ ] [ ] result = compute ( ( int [ ] [ ] ) Arrays . copyOfRange ( moves . toArray ( new Integer [ moves . size ( ) ] ) , 0 , i + 1 ) ) ;
        System . out . println ( "Case #" + ( i + 1 ) + ": " + result [ 0 ] ) ;
      }
      return new String [ ] [ ] {
        "" }
        ;
      }
      