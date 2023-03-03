@ MoreRequires public static String gcdLst ( List < String > lst ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final int K = Integer . parseInt ( input ( ) ) ;
  final List < Integer > lstA = Lists . newArrayList ( ) ;
  lstA . add ( N ) ;
  final int maxA = Collections . max ( lstA ) ;
  final int gcA = gcdLst ( lstA ) ;
  String ans = "IMPOSSIBLE" ;
  return ans ;
}
