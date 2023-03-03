def import _urljoin
import sys
import os
import sys
class Wires ( object ) :
    def __init__ ( self ) :
        self.sys = sys
    def __call__ ( self , root , baseindex ) :
        try :
            BR = open ( "A-small.in" , "r" )
            PW = open ( "A-small.out" , "w" )
            T = int ( BR.readline ( ) )
            for I in range ( T ) :
                N = int ( BR.readline ( ) )
                A = [ ]
                B = [ ]
                As = [ ]
                Bs = [ ]
                for line in BR.readlines ( ) :
                    ST = line.split ( )
                    Ai = int ( ST [ 0 ] )
                    Bi = int ( ST [ 1 ] )
                    A.append ( Ai )
                    As.append ( Ai )
                    B.append ( Bi )
                    Bs.append ( Bi )
                tot = 0
                for i in range ( N ) :
                    a_i = A.index ( As [ i ] )
                    b_i = B.index ( Bs [ i ] )
                    if a_i > b_i :
                        tot += ( a_i - b_i )
                    else :
                        tot += ( b_i - a_i )
                PW.write ( "Case #%d: %d\n" % ( I + 1 , tot / 2 ) )
            PW.flush ( )
            PW.close ( )
            BR.close ( )
        except IOError as err :
            pass
    class TreeList ( object ) :
        def __init__ ( self , index , elem = - 1 ) :
            self.elem = root
            self.index = baseindex
        def __call__ ( self , root , baseindex ) :
            self.elem = root
            self.index = baseindex
        def __add__ ( self , obj ) :
            if not self.elem :
                self.elem = obj
            elif self.elem < self.index :
                if not self.right :
                    self.right = [ self.index , self.index + 1 ]
                else :
                    self.right.append ( self.index )
            else :
                if self.left :
                    self.