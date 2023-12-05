def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.M = sys.maxint
    s = [ ]
    t = [ ]
    x = [ ]
    b = [ ]
    for i in range ( M ) :
        s.append ( sys.stdin.read ( ) )
        t.append ( sys.stdin.read ( ) )
        l = s [ i ] - 1
        r = t [ i ] - 1
        b [ l ] += 1
        b [ r + 1 ] -= 1
    for i in range ( N + 1 ) :
        b [ i + 1 ] += b [ i ]
        if b [ i ] == 1 :
            x.append ( x [ i ] + 1 )
        else :
            x.append ( x [ i ] + 0 )
    ans = [ ]
    for i in range ( M ) :
        if x [ t [ i ] ] - x [ s [ i ] - 1 ] == 0 :
            ans.append ( i + 1 )
    print ( len ( ans ) )
    for i in ans :
        print ( i )
