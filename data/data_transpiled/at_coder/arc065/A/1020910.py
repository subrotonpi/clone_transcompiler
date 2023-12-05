def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        n = len ( s )
        vis = [ True ] * ( n + 1 )
        for i in range ( n ) :
            if not vis [ i ] :
                continue
            if i + 5 <= n :
                s5 = s [ i : i + 5 ]
                if s5 in [ 'dream' , 'erase' ] :
                    vis [ i + 5 ] = True
            if i + 6 <= n :
                s6 = s [ i : i + 6 ]
                if s6 == 'eraser' :
                    vis [ i + 6 ] = True
            if i + 7 <= n :
                s7 = s [ i : i + 7 ]
                if s7 == 'dreamer' :
                    vis [ i + 7 ] = True
        if vis [ n ] :
            print ( "YES" )
        else :
            print ( "NO" )
    def tr ( * args ) :
        print ( " ".join ( map ( str , args ) ) )
