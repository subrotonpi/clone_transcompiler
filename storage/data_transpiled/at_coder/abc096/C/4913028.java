public static void input ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] glid = new int [ h + 2 ] [ w + 2 ] ;
  int [ ] hIndex = {
    - 1 , 0 , 0 , 1 }
    ;
    int [ ] wIndex = {
      0 , - 1 , 1 , 0 }
      ;
      glid [ 0 ] = new char [ w + 2 ] ;
      glid [ h + 1 ] = new char [ w + 2 ] ;
      for ( int i = 0 ;
      i < h ;
      i ++ ) {
        char [ ] temp1 = new char [ w + 2 ] ;
        temp1 [ w + 1 ] = '.' ;
        char [ ] temp2 = new char [ w + 2 ] ;
        for ( int j = 0 ;
        j < w ;
        j ++ ) {
          temp1 [ j + 1 ] = '#' ;
          temp1 [ j + 2 ] = '.' ;
          temp1 [ j + 3 ] = '.' ;
          temp1 [ j + 3 ] = '.' ;
          temp1 [ j + 4 ] = '.' ;
          temp1 [ j + 5 ] = '.' ;
          temp1 [ j + 6 ] = '.' ;
          temp1 [ j + 7 ] = '.' ;
          temp1 [ j + 7 ] = '.' ;
          temp1 [ j + 8 ] = '.' ;
          temp1 [ j + 7 ] = '.' ;
          temp1 [ j + 8 ] = '.' ;
          temp1 [ j + 9 ] = '.' ;
          temp1 [ j + 10 ] = '.' ;
          temp1 [ j + 11 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 13 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 13 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j + 12 ] = '.' ;
          temp1 [ j +