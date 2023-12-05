static final long [ ] getDoubleArray ( ) {
  final int X = Integer . parseInt ( input . nextLine ( ) ) ;
  final int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  final int Z = Integer . parseInt ( input . nextLine ( ) ) ;
  final long [ ] A_np = new long [ X + Y + Z ] ;
  final long [ ] B_np = new long [ X + Y + Z ] ;
  final long [ ] C_np = new long [ X + Y + Z ] ;
  for ( int i = 0 ;
  i < X + Y + Z ;
  i ++ ) {
    final long a = Long . parseLong ( input . nextLine ( ) ) ;
    final long b = Long . parseLong ( input . nextLine ( ) ) ;
    final long c = Long . parseLong ( input . nextLine ( ) ) ;
    A_np [ i ] = a ;
    B_np [ i ] = b ;
    C_np [ i ] = c ;
  }
  final int [ ] order_A_C = new int [ X ] ;
  Arrays . sort ( A_np ) ;
  final long [ ] A_np_s = A_np [ order_A_C [ 0 ] ] ;
  final long [ ] B_np_s = B_np [ order_A_C [ 0 ] ] ;
  final long [ ] C_np_s = C_np [ order_A_C [ 0 ] ] ;
  final long res_base = C_np_s [ 0 ] - B_np_s [ 0 ] ;
  final long [ ] plusLeft = new long [ Y + 1 ] ;
  for ( int k = 0 ;
  k < Y ;
  k ++ ) {
    final long r = heapheapAppend ( C_B_heap , C_np_s [ Z + k ] - B_np_s [ Z + k ] ) ;
    plusLeft [ k + 1 ] = plusLeft [ k ] - r + C_np_s [ Z + k ] - B_np_s [ Z + k ] ;
  }
  final long [ ] A_B_heap = new long [ Y + 1 ] ;
  for ( int k = 0 ;
  k < Y ;
  k ++ ) {
    final long r = heapAppend ( A_B_heap , A_np_s [ Z + Y - 1 - k ] - B_np_s [ Z + Y - 1 - k ] ) ;
    plusRight [ Y - k - 1 ] = plusRight [ Y - k ] - r + A_np_s [ Z + Y - 1 - k ] - B_np_s [ Z + Y - 1 - k ] ;
  }
  System . out .