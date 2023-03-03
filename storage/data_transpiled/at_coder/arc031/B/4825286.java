static final String [ ] [ ] A = new String [ 10 ] [ ] ;
for ( int i = 0 ;
i < 10 ;
i ++ ) A [ i ] [ 0 ] = input . charAt ( i ) ;
int [ ] [ ] Done = new int [ 10 ] [ 10 ] ;
for ( int i = 0 ;
i < 10 ;
i ++ ) for ( int j = 0 ;
j < 10 ;
j ++ ) Done [ i ] [ j ] = 0 ;
Queue < Integer > q = new LinkedList < > ( ) ;
/* Check for loop */
while ( ! q . isEmpty ( ) ) {
  int [ ] now = q . poll ( ) ;
  int i = ( int ) now [ 0 ] ;
  int j = ( int ) now [ 1 ] ;
  Done [ i ] [ j ] = 1 ;
  if ( i - 1 >= 0 ) {
    if ( Done [ i - 1 ] [ j ] == 0 && A [ i - 1 ] [ j ] == 'o' ) q . add ( new Integer [ ] {
      i - 1 , j }
      ) ;
    }
    if ( j - 1 >= 0 ) {
      if ( Done [ i ] [ j - 1 ] == 0 && A [ i ] [ j - 1 ] == 'o' ) q . add ( new Integer [ ] {
        i , j - 1 }
        ) ;
      }
      if ( i + 1 < 10 ) {
        if ( Done [ i + 1 ] [ j ] == 0 && A [ i + 1 ] [ j ] == 'o' ) q . add ( new Integer [ ] {
          i + 1 , j }
          ) ;
        }
        if ( j + 1 < 10 ) {
          if ( Done [ i ] [ j + 1 ] == 0 && A [ i ] [ j + 1 ] == 'o' ) q . add ( new Integer [ ] {
            i , j + 1 }
            ) ;
          }
          /* Check for loop */
          for ( int i = 0 ;
          i < 10 ;
          i ++ ) {
            for ( int j = 0 ;
            j < 10 ;
            j ++ ) {
              if ( A [ i ] [ j ] == 'x' ) {
                q . add ( new Integer [ ] {
                  i , j }
                  ) ;
                  check ( ) ;
                  if ( checkAll ( ) == 'YES' ) flag = "YES" ;
                }
              }
              Done = new int [ 10 ] [ 10 ] ;
            }
          }
          System . out . println ( flag ) ;
        }
        