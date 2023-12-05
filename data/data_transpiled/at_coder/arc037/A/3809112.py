def import import sys
class Main ( object ) :
    def __init__ ( self , name , args ) :
        Scanner ( name , args )
        N = len ( args )
        m = [ ]
        ans = 0
        for i in range ( N ) :
            m.append ( sys.stdin.readline ( ) )
            if m [ i ] < 80 :
                ans += 80 - m [ i ]
        print ( ans )
