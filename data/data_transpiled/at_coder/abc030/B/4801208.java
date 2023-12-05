public static void main ( String input ) {
  int n = ( int ) input . split ( " " ) [ 0 ] ;
  int m = ( int ) input . split ( " " ) [ 1 ] ;
  int a = ( n % 12 / 12 ) * 360 + ( m / 60 ) * 30 ;
  int b = ( m / 60 ) * 360 ;
  int x = Math . abs ( a - b ) ;
  System . out . println ( Math . min ( x , 360 - x ) ) ;
}
