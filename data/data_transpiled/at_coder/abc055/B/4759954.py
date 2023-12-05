def main ( ) :
    import sys
    import decimal
    import math
    class Main ( decimal.Decimal ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.readline ( ).strip ( )
            x = decimal.Decimal ( 1 )
            for i in range ( 1 , N + 1 ) :
                x = x * decimal.Decimal ( i ) % decimal.Decimal ( 1000000007 )
            print ( x )
