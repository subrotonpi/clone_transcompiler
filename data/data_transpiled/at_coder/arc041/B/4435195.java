public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> inputs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  List < int [ ] > vectors = new ArrayList < > ( ) ;
  vectors . add ( new int [ ] {
    1 , 1 }
    ) ;
    vectors . add ( new int [ ] {
      2 , 0 }
      ) ;
      vectors . add ( new int [ ] {
        1 , - 1 }
        ) ;
        vectors . add ( new int [ ] {
          0 , 0 }
          ) ;
          List < Integer > ans = new ArrayList < > ( ) ;
          for ( int i = 0 ;
          i < M ;
          i ++ ) {
            ans . add ( new Integer ( i ) ) ;
          }
          for ( int y = 0 ;
          y < N ;
          y ++ ) {
            for ( int x = 0 ;
            x < M ;
            x ++ ) {
              if ( inputs . get ( y ) . get ( x ) == 0 ) {
                continue ;
              }
              ans . set ( y + 1 , x , inputs . get ( y ) . get ( x ) ) ;
              for ( int [ ] vector : vectors ) {
                inputs . set ( y + vector [ 0 ] , x + vector [ 1 ] , inputs . get ( y ) . get ( x ) ) . subtractTo ( inputs . get ( y ) . get ( x ) ) ;
              }
            }
          }
          for ( Integer item : ans ) {
            System . out . println ( StringUtils . toString ( item ) ) ;
          }
        }
        