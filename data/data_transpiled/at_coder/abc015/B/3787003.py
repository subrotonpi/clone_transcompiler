def import import _sys , string
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( string.ascii_letters )
        self.A = [ _sys.random.randint ( 0 , N ) for _ in range ( self.N ) ]
        self.sum , self.size = 0 , 0
        for i in range ( self.N ) :
            if i != 0 :
                self.sum += i
                self.size += 1
        print ( self.sum / self.size , 1 if self.sum % self.size != 0 else 0 )
