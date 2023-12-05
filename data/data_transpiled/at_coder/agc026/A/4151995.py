def import sys , color
class Main ( object ) :
    def __init__ ( self ) :
        self.n , result , combo , color = self.n , 0 , 0 , 0
        for i in range ( self.n ) :
            j = self.color
            combo += 1
            if j != color :
                result += combo / 2
                combo = 0
                color = j
        print ( result + 1 / combo / 2 )
