public static void main ( String input , int n , int k ) {
  int [ ] [ ] sushi = new int [ n ] [ k ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) sushi [ i ] = new int [ n ] ;
  Arrays . sort ( sushi , 0 , n , sushi . length ) ;
  Set < String > kind = new HashSet < > ( ) ;
  Stack < Integer > changeable = new Stack < > ( ) ;
  int points = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    points += sushi [ i ] [ 1 ] ;
    if ( kind . contains ( sushi [ i ] [ 0 ] ) ) changeable . push ( sushi [ i ] [ 1 ] ) ;
    else kind . add ( sushi [ i ] [ 0 ] ) ;
  }
  points += kind . size ( ) * kind . size ( ) ;
  int ans = points ;
  for ( int i = k ;
  i < n ;
  i ++ ) {
    if ( changeable . isEmpty ( ) ) break ;
    if ( ! kind . contains ( sushi [ i ] [ 0 ] ) ) {
      kind . add ( sushi [ i ] [ 0 ] ) ;
      points += sushi [ i ] [ 1 ] - ( kind . size ( ) - 1 ) * ( kind . size ( ) - 1 ) + kind . size ( ) * kind . size ( ) - changeable . pop ( ) ;
      ans = Math . max ( ans , points ) ;
    }
  }
  System . out . println ( ans ) ;
}
