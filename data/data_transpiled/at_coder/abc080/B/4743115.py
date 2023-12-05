def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.index ( 'N' )
        sum = 0
        t = N
        while t > 0 :
            sum += t % 10
            t = t / 10
        if N % sum == 0 :
            print ( 'Yes' )
        else :
            print ( 'No' )
