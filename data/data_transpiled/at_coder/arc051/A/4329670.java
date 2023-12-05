public static String aPaint ( int X1 , int Y1 , int R , int X2 , int Y2 , int X3 , int Y3 ) {
  boolean isRectangleIncludeCircle = Arrays . asList ( X2 - R , X1 + R , X3 , Y2 - R , Y1 + R , Y3 ) . contains ( X1 ) ;
  boolean isCircleIncludeRectangle = Arrays . asList ( ( X1 - X2 ) * ( X1 - X2 ) + ( Y1 - Y2 ) * ( Y1 - Y2 ) * ( X1 - X3 ) * ( Y1 - Y3 ) * ( X1 - X3 ) * ( Y1 - Y2 ) * ( Y1 - Y3 ) ) . contains ( X1 ) ;
  String ans ;
  if ( isRectangleIncludeCircle ) {
    ans = "NO YES" ;
  }
  else if ( isCircleIncludeRectangle ) {
    ans = "YES NO" ;
  }
  else {
    ans = "YES YES" ;
  }
  return ans ;
}
