public static void input ( Scanner N ) {
  int A = N . nextInt ( ) ;
  int B = N . nextInt ( ) ;
  int C = N . nextInt ( ) ;
  int D = N . nextInt ( ) ;
  String [ ] OP = {
    "+" , "-" }
    ;
    int ANS = 0 ;
    boolean flg = false ;
    for ( String op1 : OP ) {
      if ( flg == true ) {
        break ;
      }
      ANS = A ;
      if ( op1 . equals ( "+" ) ) {
        ANS = ANS + B ;
      }
      else {
        ANS = ANS - B ;
      }
      for ( String op2 : OP ) {
        if ( flg == true ) {
          break ;
        }
        int ANS2 = ANS ;
        if ( op2 . equals ( "+" ) ) {
          ANS2 = ANS + C ;
        }
        else {
          ANS2 = ANS - C ;
        }
        for ( String op3 : OP ) {
          int ANS3 = ANS2 ;
          if ( op3 . equals ( "+" ) ) {
            ANS3 = ANS2 + D ;
          }
          else {
            ANS3 = ANS2 - D ;
          }
          if ( ANS3 == 7 ) {
            System . out . println ( A + "" + op1 + "" + B + "" + op2 + "" + C + "" + op3 + "" + D + "=7" ) ;
            flg = true ;
            break ;
          }
        }
      }
    }
  }
  