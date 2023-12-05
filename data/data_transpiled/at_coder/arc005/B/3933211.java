public static int x , int y , int W = Integer . parseInt ( input . readLine ( ) ) {
  x = Integer . parseInt ( input . readLine ( ) ) ;
  y = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] inputs = new int [ 9 ] ;
  for ( int i = 0 ;
  i < inputs . length ;
  i ++ ) {
    inputs [ i ] = input . readLine ( ) ;
  }
  {
    int [ ] vector ;
    {
      vector = new int [ ] {
        vector1 [ 0 ] + vector2 [ 0 ] , vector1 [ 1 ] + vector2 [ 1 ] }
        ;
      }
    }
    {
      int [ ] vector ;
      {
        vector [ 0 ] = ( x + vector [ 0 ] < 0 || x + vector [ 0 ] > 8 ) ? ( - 1 ) * vector [ 0 ] : vector [ 0 ] ;
        vector [ 1 ] = ( y + vector [ 1 ] < 0 || y + vector [ 1 ] > 8 ) ? ( - 1 ) * vector [ 1 ] : vector [ 1 ] ;
      }
    }
    HashMap < String , int [ ] > vectors = new HashMap < String , int [ ] > ( ) ;
    vectors . put ( "R" , new int [ ] {
      1 , 0 }
      ) ;
      vectors . put ( "L" , new int [ ] {
        - 1 , 0 }
        ) ;
        vectors . put ( "U" , new int [ ] {
          0 , - 1 }
          ) ;
          vectors . put ( "D" , new int [ ] {
            0 , 1 }
            ) ;
            vectors . put ( "RU" , calVector ( vectors . get ( "R" ) , vectors . get ( "U" ) ) ) ;
            vectors . put ( "RD" , calVector ( vectors . get ( "R" ) , vectors . get ( "D" ) ) ) ;
            vectors . put ( "LU" , calVector ( vectors . get ( "L" ) , vectors . get ( "U" ) ) ) ;
            vectors . put ( "LD" , calVector ( vectors . get ( "L" ) , vectors . get ( "D" ) ) ) ;
            vector = vectors . get ( W ) ;
            String ans = "" ;
            for ( int i = 0 ;
            i < 4 ;
            i ++ ) {
              ans += inputs [ y ] [ i ] ;
              if ( ( ( x < 0 && y + vector [ 1 ] < 0 ) || ( x + vector [ 0 ] > 8