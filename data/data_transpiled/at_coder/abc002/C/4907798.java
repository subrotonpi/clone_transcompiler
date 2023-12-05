public static void xa ( String xa , String ya , String xb , String yb , String xc , String yc ) {
  int a = Integer . parseInt ( xb ) - Integer . parseInt ( xa ) ;
  int b = Integer . parseInt ( yb ) - Integer . parseInt ( ya ) ;
  int c = Integer . parseInt ( xc ) - Integer . parseInt ( xa ) ;
  int d = Integer . parseInt ( yc ) - Integer . parseInt ( ya ) ;
  int s = Math . abs ( a * d - c * b ) / 2 ;
  System . out . println ( s ) ;
}
