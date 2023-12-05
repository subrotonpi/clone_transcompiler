def import re
class Main ( object ) :
    def __init__ ( self , S ) :
        self.S = S
        print ( re.match ( 'A[a-z]+C[a-z]+' , S ).group ( 0 ) )
