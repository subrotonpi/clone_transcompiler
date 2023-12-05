def import _dict_from_key
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.m = int ( sys.stdin.readline ( ).strip ( ) )
    def __init__ ( self , n ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
        self.m = int ( sys.stdin.readline ( ).strip ( ) )
        self.a = [ ]
        for i in range ( 1 , n + 1 ) :
            self.a.append ( self.a [ i ] )
        self.sum = [ ]
        for i in range ( 1 , n + 1 ) :
            self.sum.append ( self.a [ i ] + self.sum [ i - 1 ] )
    d = { }
    for i in range ( 1 , n + 1 ) :
        d [ sum [ i ] % m ] = 0
    for i in range ( 1 , n + 1 ) :
        x = d [ sum [ i ] % m ]
        d [ sum [ i ] % m ] = x + 1
    ans = 0
    if 0l in d :
        ans = d [ 0l ]
    for i in d :
        if d [ i ] >= 2 :
            for j in d [ i ] [ : : - 1 ] :
                ans += j - 1
    print ( ans )
class Pair ( object ) :
    def __init__ ( self ) :
        self.from = None
        self.end = None
        self.num = None
        self.bango = None
    def __eq__ ( self , other ) :
        otherpair = other
        return self.from == other.num
    def __ne__ ( self , other ) :
        otherpair = other
        return self.from == other.num
