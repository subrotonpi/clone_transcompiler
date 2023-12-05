def main ( ) :
    import sys
    import os
    import string
    import sys
    import struct
    W = "welcome to code jam"
    M = 10000
    global S
    global memo
    memo = [ [ - 1 ] * 500 , [ ] * 500 ]
    def go ( s , w ) :
        with open ( W , 'r' ) as f :
            for T , ds in [ ( s , M ) , ( M , M ) ] :
                S = f.read ( )
                for i in S :
                    [ memo [ i ] , i ] = - 1
                print ( "Case #%d: %04d" % ( ds , go ( 0 , 0 ) ) )
    def go ( s , w ) :
        if w == len ( W ) : return 1
        if s == len ( S ) : return 0
        if memo [ s ] [ w ] > - 1 : return memo [ s ] [ w ]
        res = go ( s + 1 , w )
        if S [ s ] == W [ w ] :
            res = ( res + go ( s + 1 , w + 1 ) ) % M
        return memo [ s ] [ w ] = res
    return go
