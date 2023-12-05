def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( sys.argv [ 1 ] )
            self.q = int ( sys.argv [ 2 ] )
            self.l = [ ]
            self.r = [ ]
            self.t = [ ]
            for i in range ( self.q ) :
                self.l.append ( self.n )
                self.r.append ( self.n )
                self.t.append ( self.n )
    ans = [ ]
    for i in range ( self.q ) :
        for j in range ( self.l [ i ] , self.r [ i ] + 1 ) :
            ans.append ( t [ i ] )
    for i in range ( 1 , n + 1 ) :
        print ( ans [ i ] )
