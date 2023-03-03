def import _main
class Main ( object ) :
    def __init__ ( self , out ) :
        self.out = out
    def add ( self , count ) :
        if count == 0 :
            self.out.append ( self.out [ 0 ] )
            return
        import string
        arr = string.ascii_lowercase
        for c in arr :
            add ( string.ascii_lowercase + c , count - 1 )
