public static int gotoN ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < List < Integer >> Info = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    Info . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  }
  int [ ] C = new int [ N ] ;
  int [ ] S = new int [ N ] ;
  int [ ] F = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    C [ i ] = Info . get ( i ) . get ( 0 ) ;
    S [ i ] = Info . get ( i ) . get ( 1 ) ;
    F [ i ] = Info . get ( i ) . get ( 2 ) ;
  }
  / * ▁ jump ▁ to ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the ▁ end ▁ of ▁ the