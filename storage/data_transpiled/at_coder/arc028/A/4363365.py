def _ ( ) : return
import sys
import math
class Main ( ) :
    def __init__ ( self ) :
        self.n , a , b = self.n , self.a , self.b
        self.ans = [ 'Bug' , 'Ant' ]
        self.turn = 0
        while self.n > 0 :
            self.turn += 1
            self.n -= self.turn % 2 == 1 and a or b
        self.out.write ( self.ans [ self.turn % 2 ] )
