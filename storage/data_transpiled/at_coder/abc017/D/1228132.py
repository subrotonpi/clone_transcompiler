def import import _sys , os , sys
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1000000007
        N = sys.stdin.read ( )
        M = sys.stdin.read ( )
        f = [ i for i in range ( N ) ]
        dp = [ ]
        s = [ 1 ]
        dp.append ( 0 )
        s.append ( 1 )
        num = [ 0 ] * M
        num [ f [ 0 ] ] += 1
        start = 0
        end = 1
        while end < N :
            if num [ f [ end ] ] == 0 :
                num [ f [ end ] ] += 1
                a = 0
                if start == 0 : a = 1 + s [ end - 1 ]
                if start == 1 : a = s [ end - 1 ]
                if start > 1 :
                    if s [ end - 1 ] >= s [ start - 2 ] :
                        a = s [ end - 1 ] - s [ start - 2 ]
                    else :
                        a = s [ end - 1 ] - s [ start - 2 ] + MOD
                s [ end ] = ( s [ end - 1 ] + a ) % MOD
                if s [ end ] >= s [ end - 1 ] :
                    dp.append ( s [ end ] - s [ end - 1 ] )
                else :
                    dp.append ( s [ end ] - s [ end - 1 ] + MOD )
                end += 1
            else :
                num [ f [ start ] ] -= 1
                start += 1
        print ( dp [ N - 1 ] )
