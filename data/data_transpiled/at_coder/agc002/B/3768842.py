def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = int ( sys.argv [ 1 ] )
            self.M = int ( sys.argv [ 2 ] )
            self.balls = [ True ] * N
            self.ballvol = [ 1 for i in range ( N ) ]
        def run ( self ) :
            for s , g in self.balls :
                if self.balls [ s - 1 ] :
                    if self.ballvol [ s - 1 ] > 1 :
                        self.balls [ g - 1 ] = True
                        self.ballvol [ s - 1 ] -= 1
                        self.ballvol [ g - 1 ] += 1
                    elif self.ballvol [ s - 1 ] == 1 :
                        self.balls [ s - 1 ] = False
                        self.balls [ g - 1 ] = True
                        self.ballvol [ s - 1 ] -= 1
                        self.ballvol [ g - 1 ] += 1
                else :
                    self.ballvol [ s - 1 ] -= 1
                    self.ballvol [ g - 1 ] += 1
    count = 0
    for i in range ( N ) :
        if balls [ i ] :
            count += 1
    print ( count )
