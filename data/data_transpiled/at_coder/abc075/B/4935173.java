public static void print ( String input ) {
  int H = Integer . parseInt ( input . substring ( 0 , input . length ( ) - 1 ) ) ;
  int W = Integer . parseInt ( input . substring ( input . length ( ) - 1 ) ) ;
  List < String > mineList = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    mineList . add ( new LinkedList < String > ( ) ) ;
  }
  int [ ] dx = {
    - 1 , 0 , 1 }
    ;
    int [ ] dy = {
      - 1 , 0 , 1 }
      ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) {
        for ( int j = 0 ;
        j < W ;
        j ++ ) {
          int count = 0 ;
          if ( mineList . get ( i ) . get ( j ) . equals ( "#" ) ) {
            continue ;
          }
          if ( mineList . get ( i ) . get ( j ) . equals ( "." ) ) {
            for ( int l = 0 ;
            l < dx . length ;
            l ++ ) {
              for ( int m = 0 ;
              m < dy . length ;
              m ++ ) {
                if ( ( i + l < 0 ) || ( i + l > H - 1 ) || ( j + m < 0 ) || ( j + m > W - 1 ) ) {
                  continue ;
                }
                if ( mineList . get ( i + l ) . get ( j + m ) . equals ( "#" ) ) {
                  count ++ ;
                }
              }
            }
          }
          mineList . set ( i , j , Integer . toString ( count ) ) ;
        }
      }
      for ( String i : mineList ) {
        String k = i . substring ( 0 , i ) ;
        System . out . println ( k ) ;
      }
    }
    