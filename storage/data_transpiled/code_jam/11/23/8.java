public static List < List < Integer >> divide ( int n , List < List < Integer >> walls ) {
  List < List < Integer >> rooms = new ArrayList < > ( n ) ;
  for ( List < Integer > a : walls ) {
    List < List < Integer >> new ArrayList < > ( ) ;
    for ( List < Integer > b : walls ) {
      List < List < Integer >> new = new ArrayList < > ( ) ;
      for ( List < Integer > room : rooms ) {
        if ( room . contains ( a ) && room . contains ( b ) ) {
          int x = new Integer ( room . indexOf ( a ) ) ;
          int y = new Integer ( room . indexOf ( b ) ) ;
          List < Integer > left = room . subList ( x , y + 1 ) ;
          List < Integer > right = room . subList ( y , x + 1 ) ;
          new ArrayList < > ( left ) ;
          new ArrayList < > ( right ) ;
        }
        else {
          new ArrayList < > ( room ) ;
        }
      }
      rooms = new ArrayList < > ( ) ;
    }
    return rooms ;
  }
  private static int maximal ( List < List < Integer >> rooms ) {
    return Math . min ( CollectionUtils . size ( rooms ) , n ) ;
  }
  private static boolean verify ( List < List < Integer >> rooms , int c ) {
    return Arrays . stream ( rooms ) . filter ( Objects :: nonNull ) . count ( ) == c ;
  }
  private static List < Integer > functions ( int vertices , int c ) {
    int [ ] function = new int [ vertices ] ;
    new Random ( ) . nextIntArray ( function ) ;
    while ( ArrayUtils . contains ( function , c - 1 ) ) {
      function [ 0 ] ++ ;
      int carry = 0 ;
      for ( int i = 0 ;
      i < vertices ;
      i ++ ) {
        function [ i ] += carry ;
        carry = function [ i ] / c ;
        function [ i ] = function [ i ] % c ;
      }
      return function ;
    }
  }
  private static List < Integer > find ( List < Integer > rooms , int n , int c ) {
    for ( int c = 2 ;
    c <= maximal ( rooms ) ;
    c ++ ) {
      List < Integer > best = new ArrayList < > ( ) ;
      for ( int c = c ;
      c <= maximal ( rooms ) ;
      c ++ ) {
        List < Integer > new ArrayList < > ( ) ;
        for ( int s : rooms ) {
          new ArrayList < > ( ) ;
        }
        walls = divide (