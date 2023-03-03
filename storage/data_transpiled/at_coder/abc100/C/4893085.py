def import import _sys , string
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
    def __call__ ( self , * args ) :
        self.T = [ ]
        for i in range ( self.N ) :
            self.T.append ( _sys.stdin.read ( ) )
    def main ( ) :
        self.count = 0
        counti = 0
        for m in self.T :
            self.count += counti
            for i in range ( 1 , 35 ) :
                p = int ( math.pow ( 2 , i ) )
                if m % p == 0 :
                    counti = i
                elif m % 2 != 0 :
                    counti = 0
                    break
                else :
                    break
        self.count += counti
        print ( count )
