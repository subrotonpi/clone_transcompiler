def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
    A = Main ( )
    B = Main ( )
    if A == B :
        print ( 1 )
    else :
        abi = 62
        for abi in range ( 0 , - 1 , - 1 ) :
            if ( ( A ^ B ) & ( 1l << abi ) ) :
                break
        mask = ( 1l << abi ) - 1
        ans = mask - ( A & mask ) + 1
        bi = abi - 1
        for bi in range ( 0 , - 1 , - 1 ) :
            if ( ( 1l << bi ) & B ) :
                break
            temp = 1l << ( bi + 1 )
            ans += temp + ( 1l << abi ) - max ( temp , A & mask )
            print ( ans )
