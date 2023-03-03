def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.t = sys.stdin.read ( )
        self.n = sys.stdin.read ( )
        self.made = [ ]
        for i in range ( self.n ) :
            self.made.append ( self.made [ i ] )
        self.m = sys.stdin.read ( )
        self.come = [ ]
        self.eaten = 0
        for i in range ( self.m ) :
            try :
                while True :
                    eaten += 1
                    if self.come [ i ] - t > self.made [ eaten - 1 ] :
                        if self.made [ eaten - 1 ] > self.come [ i ] :
                            print ( 'no' )
                            return
            except IndexError :
                print ( 'no' )
                return
        print ( 'yes' )
