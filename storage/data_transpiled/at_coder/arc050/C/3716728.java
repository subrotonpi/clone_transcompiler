static final double [ ] [ ] G ( ) {
  int A = Integer . parseInt ( input ( ) ) ;
  int B = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int D = gcd ( A , B ) ;
  double [ ] [ ] X = new double [ ] [ ] {
    {
      10 , 1 }
      , {
        0 , 1 }
      }
      ;
      double [ ] [ ] Y = new double [ ] [ ] {
        {
          pow ( 10 , D , M ) , 1 }
        }
        ;
        double [ ] x = new double [ ] {
          0 , 1 }
          ;
          return new double [ ] [ ] {
            x }
            ;
          }
          