def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def func ( self , k , t ) :
        self.count += 1
        return t
    def count ( self ) :
        self.count += 1
