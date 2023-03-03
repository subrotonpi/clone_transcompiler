public static String print ( String input ) {
  int n = input . length ( ) ;
  int N = n % 30 ;
  int I = N / 5 ;
  int i = N % 5 ;
  int [ ] [ ] number = {
    {
      1 , 2 , 3 , 4 , 5 , 6 }
      , {
        2 , 3 , 4 , 5 , 6 , 1 }
        , {
          3 , 4 , 5 , 6 , 1 , 2 }
          , {
            4 , 5 , 6 , 1 , 2 , 3 }
            , {
              6 , 1 , 2 , 3 , 4 , 5 }
            }
            ;
            for ( int s = 0 ;
            s <= i ;
            s ++ ) {
              number [ I ] [ s ] = number [ I ] [ s ] ;
            }
            String numberStr = "" ;
            for ( int t : number [ I ] ) {
              numberStr += t ;
            }
            System . out . println ( numberStr ) ;
            return numberStr ;
          }
          