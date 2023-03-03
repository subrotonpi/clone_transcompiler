def import import sys , execute , N
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
    def execute ( self , num ) :
        self.N = num
        self.execute ( 0 )
        if self.execute ( num ) :
            sys.stdout.write ( "Yes" )
        else :
            sys.stdout.write ( "No" )
    def execute ( self , num ) :
        if num < N :
            return self.execute ( num + 4 ) or self.execute ( num + 7 )
        else :
            return ( num == self.N )
