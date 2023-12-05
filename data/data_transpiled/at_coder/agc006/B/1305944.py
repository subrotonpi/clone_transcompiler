def import import sys
import os
import sys
import getopt
class Main ( object ) :
    def __init__ ( self ) :
        sys.stdout = sys.stderr = sys.__stdout__
    def __init__ ( self , N , x ) :
        if x == 1 or x == 2 * N - 1 :
            self.out.write ( 'No' )
            self.out.flush ( )
            return
        self.out.write ( 'Yes' )
        if N == 2 :
            for i , n in enumerate ( [ 1 , 2 * N ] ) :
                self.out.write ( i )
        else :
            if x > N :
                for i in range ( N , N * 2 ) :
                    if i != x :
                        self.out.write ( i )
                self.out.write ( x )
                for i in range ( 1 , N ) :
                    if i != x :
                        self.out.write ( i )
            else :
                for i in range ( N + 1 , N * 2 ) :
                    if i != x :
                        self.out.write ( i )
                self.out.write ( x )
                for i in range ( 1 , N + 1 ) :
                    if i != x :
                        self.out.write ( i )
        self.out.flush ( )
