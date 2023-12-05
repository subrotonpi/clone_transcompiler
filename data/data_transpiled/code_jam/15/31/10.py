def main ( ) :
    import sys
    class a ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.num_cases = len ( self.stdin )
    for loop in range ( 1 , num_cases + 1 ) :
        R = int ( loop )
        C = int ( loop )
        W = int ( loop )
        res = 0
        if C % W == 0 :
            res = R * ( C // W ) + W - 1
        else :
            res = R * ( C // W ) + W
        print ( "Case #{}: {}".format ( loop , res ) )
