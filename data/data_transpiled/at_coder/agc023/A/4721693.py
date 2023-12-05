def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.a = [ ]
        for i in range ( self.n ) :
            self.a.append ( i )
    def main ( self ) :
        self.n = int ( self.n )
        self.a = [ ]
        self.a = [ ]
        self.a.append ( self.a [ 0 ] )
        self.a.append ( self.a [ 1 ] )
        self.ruiseki = [ 0 ]
        dict = { }
        dict [ 0l ] = 1l
        for i in range ( 1 , self.n + 1 ) :
            ruiseki [ i ] = ruiseki [ i - 1 ] + self.a [ i - 1 ]
            dict [ ruiseki [ i ] ] = dict [ ruiseki [ i ] ] + 1 if ruiseki [ i ] in dict else 1
        ans = 0
        for val in dict.values ( ) :
            if val > 1 :
                ans += val * ( val - 1 ) / 2
        print ( ans )
