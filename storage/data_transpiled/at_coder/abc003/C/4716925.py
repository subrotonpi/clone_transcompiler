def import import os , sys , traceback
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.argv [ 0 ]
        self.N = sys.argv.count ( 'N' )
        self.K = sys.argv.count ( 'K' )
        Trate = 0
        Vrate = 0
        video = [ i for i in range ( self.N ) ]
        video = [ i for i in video if i != self.N ]
        video = [ i for i in video if i != self.K ]
        video = [ i for i in video if i != self.K ]
        video = [ i for i in video if i != self.K ]
        for i in range ( K ) :
            Vrate = video [ i - K + i ]
            Trate = ( Trate + Vrate ) / 2
        print ( '%.6f' % Trate )
