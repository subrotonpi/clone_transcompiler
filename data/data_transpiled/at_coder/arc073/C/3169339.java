public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  ArrayList < Ball > list = new ArrayList < Ball > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    x = Math . min ( x , y ) ;
    y = Math . max ( x , y ) ;
    list . add ( new Ball ( x , y ) ) ;
  }
  Collections . sort ( list ) ;
  List < Integer > X = list . stream ( ) . map ( x -> x ) . collect ( toList ( ) ) ;
  List < Integer > Y = list . stream ( ) . map ( y -> y ) . collect ( toList ( ) ) ;
  int MIN = X . get ( 0 ) ;
  int MAX = Math . max ( Y , MIN ) ;
  int ans = ( Math . max ( X , MIN ) - MIN ) * ( MAX - Math . min ( Y , MIN ) ) ;
  int MIN_index = X . indexOf ( MIN ) ;
  int MAX_index = Y . indexOf ( MAX ) ;
  int MIN_O = X . get ( MAX_index ) ;
  int MAX_O = Y . get ( MIN_index ) ;
  MIN_O = Math . min ( MIN_O , MAX_O ) ;
  int MAX_O = Math . max ( MIN_O , MAX_O ) ;
  list . stream ( ) . filter ( i -> i != MIN_index && i != MAX_index ) . forEach ( i -> {
    int x = X . get ( i ) ;
    int y = Y . get ( i ) ;
    if ( B_max - x > B_max - y >= 0 ) {
      B . set ( i , y ) ;
    }
    else {
      break ;
    }
  }
  ) ;
  ans = Math . min ( ans , ( MAX - MIN ) * ( Math . max ( B , MIN ) - Math . min ( B , MIN ) ) ) ;
  System . out . println ( ans ) ;
}
