def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = int ( self.N )
        self.Y = int ( self.Y )
        self.ok = False
        LOOP :
        for i in range ( 0 , N ) :
            for j in range ( 0 , N - i ) :
                if i * 10000 + j * 5000 + ( N - j - i ) * 1000 == self.Y :
                    self.ok = True
                    print ( i , j , ( N - j - i ) )
                    break LOOP
        if not self.ok :
            print ( - 1 , - 1 , - 1 )
