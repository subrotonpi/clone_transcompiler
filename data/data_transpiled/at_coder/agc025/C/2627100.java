public static void print ( int N ) {
  List < List < Integer >> LR = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    LR . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int RAN = ( LR . size ( ) + 1 ) / 2 ;
  List < Integer > LR_L = new ArrayList < > ( LR ) ;
  List < Integer > LR_R = new ArrayList < > ( LR ) ;
  Collections . sort ( LR_L , new Comparator < Integer > ( ) {
    public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  List < Integer > ANS_l = new ArrayList < > ( RAN * 2 + 2 ) ;
  List < Integer > ANS_r = new ArrayList < > ( RAN * 2 + 2 ) ;
  for ( int i = 0 ;
  i < RAN ;
  i ++ ) {
    ANS_l . set ( 2 * i + 1 , ANS_l . get ( i ) + LR_R . get ( i ) ) ;
  }
  System . out . println ( Math . max ( Math . max ( ANS_l . size ( ) * 2 , Math . max ( ANS_r . size ( ) * 2 ) ) ) ) ;
}
