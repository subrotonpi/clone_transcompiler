static final int N = input ( ) {
  int N = input ( ) ;
  int MovingCardNum = Math . floor ( N / 5 ) % 6 + 1 ;
  List = Lists . newArrayList ( MovingCardNum + 1 , 7 ) ;
  List . add ( 1 , MovingCardNum ) ;
  int idx = N % 5 ;
  List . subList ( ( idx + 1 ) , 6 ) ;
  List . set ( idx , MovingCardNum ) ;
  System . out . println ( String . join ( List ) ) ;
}
