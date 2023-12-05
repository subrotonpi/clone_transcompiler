public static String [ ] [ ] split ( String input ) {
  int w = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] vec = new int [ n ] ;
  ArrayList < int [ ] > l = new ArrayList < int [ ] > ( ) ;
  ArrayList < int [ ] > b = new ArrayList < int [ ] > ( ) ;
  ArrayList < int [ ] > t = new ArrayList < int [ ] > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    int x1 = Integer . parseInt ( input ) ;
    int y1 = Integer . parseInt ( input ) ;
    int [ ] c = {
      x , y , x1 , y1 }
      ;
      if ( ( ( ( c [ 0 ] == 0 ) || ( c [ 0 ] == w ) ) && ( ( c [ 1 ] == 0 ) || ( c [ 1 ] == h ) ) ) && ( ( ( c [ 2 ] == 0 ) || ( c [ 2 ] == w ) ) || ( ( c [ 3 ] == 0 ) || ( c [ 3 ] == h ) ) ) ) {
        if ( x == 0 ) l . add ( new int [ ] {
          x , y , i }
          ) ;
          else if ( y == 0 ) t . add ( new int [ ] {
            x , y , i }
            ) ;
            else if ( x == w ) r . add ( x , y , i ) ;
            else if ( y == h ) b . add ( x , y , i ) ;
          }
        }
        ArrayList < int [ ] > sortedNode = ( ArrayList < int [ ] > ) new ArrayList < int [ ] > ( ) ;
        sortedNode . addAll ( l ) ;
        sortedNode . addAll ( b ) ;
        sortedNode . addAll ( t ) ;
        Stack < Integer > stack = new Stack < Integer > ( ) ;
        for ( int [ ] node : sortedNode ) {
          if ( stack . isEmpty ( ) || stack . peek ( ) != node [ 2 ] ) stack . push ( node [ 2 ] ) ;
          else stack . pop ( ) ;
        }
        System . out . println ( stack . isEmpty ( ) ? "NO" : "YES" ) ;
        return vec ;
      }
      