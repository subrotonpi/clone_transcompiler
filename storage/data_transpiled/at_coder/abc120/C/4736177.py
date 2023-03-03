def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
    def __call__ ( self , s ) :
        stack = [ ]
        removed = 0
        for c in s :
            stack.append ( c != '0' )
            while len ( stack ) > 1 :
                top = stack.pop ( )
                second = stack.pop ( )
                if top != second :
                    removed += 2
                else :
                    stack.append ( second )
                    stack.append ( top )
                    break
        print ( removed )
