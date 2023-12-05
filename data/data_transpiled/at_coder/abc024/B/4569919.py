def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.argv [ 1 ] )
            self.t = int ( sys.argv [ 2 ] )
            self.a = [ ]
            for i in range ( self.n ) :
                self.a.append ( self.a [ i ] )
    ans = 0
    time = self.a [ 0 ]
    for i in range ( 1 , self.n ) :
        if time + t <= self.a [ i ] :
            time = self.a [ i ]
            ans += t
        else :
            ans += self.a [ i ] - time
            time = self.a [ i ]
    ans += t
    print ( ans )
