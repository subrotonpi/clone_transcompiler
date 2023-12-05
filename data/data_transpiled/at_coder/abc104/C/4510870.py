def import import sys , string , traceback
from os import urandom
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.d = random.randint ( 1 , 5 )
        self.g = random.randint ( 1 , 5 )
        self.p = [ random.randint ( 1 , 5 ) for i in range ( self.d ) ]
        self.c = [ random.randint ( 1 , 5 ) for i in range ( self.c ) ]
        self.min_program = sys.maxint
        for i in range ( ( 1 , self.d ) ) :
            score = 0
            program = 0
            for j in range ( 0 , self.d ) :
                if ( ( self.i >> j ) & 1 ) == 1 :
                    score += 100 * ( self.j + 1 ) * self.p [ j ] + self.c [ j ]
                    program += self.p [ j ]
            if score < g :
                for j in range ( self.d - 1 , - 1 , - 1 ) :
                    if ( ( self.i >> j ) & 1 ) == 0 :
                        for k in range ( self.p [ j ] - 1 ) :
                            score += 100 * ( self.j + 1 )
                            program += 1
                            if score >= g :
                                break
                        break
        if score >= g and program < self.min_program :
            self.min_program = program
    print ( self.min_program )
