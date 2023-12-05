@ VisibleForTesting static int solve ( int B , int N , int [ ] X ) throws IOException {
  int ans = 0 ;
  for ( int i = 1 ;
  i <= 1002 ;
  i ++ ) {
    int [ ] bigger = Arrays . stream ( X ) . filter ( j -> j > i ) . toArray ( ) ;
    int remain = 37 - bigger . length ;
    if ( remain == 0 ) continue ;
    int otherBet = Arrays . stream ( bigger ) . filter ( j -> j <= i ) . mapToInt ( j -> j ) . sum ( ) ;
    int totalBet = remain * i ;
    int myBet = totalBet - otherBet ;
    if ( myBet > B ) break ;
    double profit = 1.0 * myBet * ( 36.0 / remain ) - myBet ;
    if ( profit > ans ) ans = profit ;
    int [ ] remainX = Arrays . stream ( X ) . filter ( j -> j <= i ) . toArray ( ) ;
    Arrays . sort ( remainX , Integer . reverseOrder ( ) ) ;
    int myRemoveBet = 0 ;
    System . out . println ( i + " " + remainX [ 0 ] ) ;
    for ( int removeBucket = 0 ;
    removeBucket < remainX . length ;
    removeBucket ++ ) {
      int otherBetInThisBucket = remainX [ removeBucket ] ;
      myRemoveBet += ( i - otherBetInThisBucket ) ;
      if ( removeBucket == remain ) break ;
      int myAdditionBet = removeBucket ;
      if ( myBet + myAdditionBet > B ) continue ;
      double profit = 1.0 * ( myBet - myRemoveBet ) * 36.0 / ( remain - removeBucket ) - myBet - myAdditionBet ;
      if ( profit > ans ) {
        System . out . println ( "remove bucket " + removeBucket + " :" + otherBetInThisBucket ) ;
        System . out . println ( "my bet" + myBet ) ;
        System . out . println ( "my removeBet " + myRemoveBet ) ;
        System . out . println ( "profit" + profit ) ;
        ans = profit ;
      }
    }
  }
  System . out . println ( ans ) ;
  if ( Class . forName ( "java.util.Scanner" ) . findFirst ( ) . stream ( ) . filter ( x -> x . contains (