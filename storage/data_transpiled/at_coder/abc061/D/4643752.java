public static void update ( int [ ] input , int [ ] [ ] G ) {
  int N = input . length ;
  int M = input . length ;
  int [ ] [ ] G_ls = new int [ N ] [ M ] ;
  double [ ] d = new double [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = input [ i ] [ 0 ] ;
    int b = input [ i ] [ 1 ] ;
    int c = input [ i ] [ 2 ] ;
    a -- ;
    b -- ;
    G_ls [ i ] = new int [ ] {
      a , b , c }
      ;
    }
    / * ▁ update ▁ the ▁ first ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element ▁ of ▁ the ▁ last ▁ element