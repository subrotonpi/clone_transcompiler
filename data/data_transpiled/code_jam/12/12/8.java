public static void testCount ( Scanner in ) {
  for ( int testIndex = 0 ;
  testIndex < testCount ;
  testIndex ++ ) {
    String ans = "Case #" + ( testIndex + 1 ) + ": " ;
    int n = in . nextInt ( ) ;
    int [ ] [ ] a = new int [ n ] [ 2 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a1 = in . nextInt ( ) , a2 = in . nextInt ( ) ;
      a [ i ] = new int [ ] {
        a1 , a2 , 2 }
        ;
      }
      Arrays . sort ( a , new Comparator < int [ ] > ( ) {
        public int compare ( int [ ] o1 , int [ ] o2 ) {
          return o2 [ 1 ] * 10000 + o1 [ 0 ] ;
        }
      }
      ) ;
      int star = 0 ;
      int count = 0 ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int need = a [ i ] [ 1 ] - star ;
        while ( need > 0 ) {
          boolean flag = true ;
          for ( int j = n - 1 ;
          j >= i ;
          j -- ) {
            if ( a [ j ] [ 2 ] == 2 && star >= a [ j ] [ 0 ] ) {
              a [ j ] = new int [ ] {
                a [ j ] [ 0 ] , a [ j ] [ 1 ] , 1 }
                ;
                need -- ;
                star ++ ;
                count ++ ;
                flag = false ;
                break ;
              }
            }
            if ( flag ) break ;
          }
          if ( need > 0 ) {
            ans += "Too Bad" ;
            break ;
          }
          star += a [ i ] [ 2 ] ;
          count ++ ;
        }
        if ( star == n * 2 ) ans += Integer . toString ( count ) ;
        System . out . println ( ans ) ;
      }
    }
    