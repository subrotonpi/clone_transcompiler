def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        nums = [ sc.readline ( ).strip ( ) for i in range ( n + 1 ) ]
        output = 0
        tmplength = 1
        for i in range ( n ) :
            if nums [ i ] < nums [ i + 1 ] :
                tmplength += 1
            else :
                output += tmplength * ( tmplength + 1 ) / 2
                tmplength = 1
        print ( output )
